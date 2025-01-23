package com.example.seekhoanime.appscreens;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.seekhoanime.R;
import com.example.seekhoanime.adapter.AnimeAdapter;
import com.example.seekhoanime.appInternet.Internet;
import com.example.seekhoanime.appPojoClasses.animemain.AnimMain;
import com.example.seekhoanime.appPojoClasses.animemain.Datum;
import com.example.seekhoanime.serviceapi.AnimeApiService;
import com.example.seekhoanime.serviceapi.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeScreen extends AppCompatActivity {
    RecyclerView recyclerView;
    AnimeAdapter animeAdapter;
    ProgressBar progressBar;
    ConstraintLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recylerView);
        progressBar = findViewById(R.id.progressBarH);
        main = findViewById(R.id.main);

        if (Internet.isAvailable(this)) {
            main.setVisibility(VISIBLE);
            fetchAllAnimeList();
        } else {
            main.setVisibility(GONE);
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Alert");
            alert.setMessage("We're having trouble connecting to the internet. Please check your internet connection and try again.");
            alert.setPositiveButton("ok", (dialog, which) -> alert.create().dismiss());
            alert.show();
        }
    }

    private void fetchAllAnimeList() {
        progressBar.setVisibility(VISIBLE);
        AnimeApiService retrofitInstance = (AnimeApiService) RetrofitInstance.getApiClient();
        Call<AnimMain> call = retrofitInstance.getAllAnimList();
        call.enqueue(new Callback<AnimMain>() {
            @Override
            public void onResponse(Call<AnimMain> call, Response<AnimMain> response) {
                progressBar.setVisibility(GONE);
                if (response.isSuccessful()) {
                    AnimMain animMain = response.body();
                    List<Datum> animeList = animMain.getData();
                    Log.d("TAG", "onResponse: " + animeList.size());
                    createRecyclerView(animeList);
                } else if (response.code() == 500) {
                    Log.d("TAG", "onResponse: " + response);
                } else if (response.code() == 404) {
                    Log.d("TAG", "onResponse: " + response);
                }
            }

            @Override
            public void onFailure(Call<AnimMain> call, Throwable throwable) {

            }
        });

    }

    private void createRecyclerView(List<Datum> animeList) {
        animeAdapter = new AnimeAdapter(this, animeList, new AnimeAdapter.onClickListener() {
            @Override
            public void onItemClick(int position, Datum data) {
//                Toast.makeText(HomeScreen.this, "" + data.getTitle(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeScreen.this, AnimeDetailScreen.class).putExtra("animeID", data.getMalId()));
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(HomeScreen.this, 2));
        recyclerView.setAdapter(animeAdapter);
        recyclerView.setHasFixedSize(true);
    }
}