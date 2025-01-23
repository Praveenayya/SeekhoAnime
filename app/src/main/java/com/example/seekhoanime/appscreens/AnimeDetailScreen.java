package com.example.seekhoanime.appscreens;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

import com.bumptech.glide.Glide;
import com.example.seekhoanime.R;
import com.example.seekhoanime.appInternet.Internet;
import com.example.seekhoanime.appPojoClasses.animechild.AnimeChild;
import com.example.seekhoanime.appPojoClasses.animechild.Data;
import com.example.seekhoanime.appPojoClasses.animemain.AnimMain;
import com.example.seekhoanime.appPojoClasses.animemain.Datum;
import com.example.seekhoanime.appPojoClasses.animemain.Genre;
import com.example.seekhoanime.serviceapi.AnimeApiService;
import com.example.seekhoanime.serviceapi.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AnimeDetailScreen extends AppCompatActivity {
    ImageView imgDetailPoster;
    TextView txtDetailTitle, txtGenre, txtAnimeEpisodeNo, txtAnimeRating, txtPlot;
    WebView webView;
    ProgressBar progressBar;
    ConstraintLayout mainLyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_anime_detail_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViews();
        Intent intent = getIntent();
        Integer animeID = intent.getIntExtra("animeID", 0);

        if (Internet.isAvailable(this)) {
            mainLyt.setVisibility(VISIBLE);
            fetchAnimeDetailsByID(animeID);
        } else {
            mainLyt.setVisibility(GONE);
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Alert");
            alert.setMessage("We're having trouble connecting to the internet. Please check your internet connection and try again.");
            alert.setPositiveButton("ok", (dialog, which) -> alert.create().dismiss());
            alert.show();
        }


    }

    private void findViews() {
        imgDetailPoster = findViewById(R.id.imgDetailPoster);
        txtDetailTitle = findViewById(R.id.txtDetailTitle);
        txtGenre = findViewById(R.id.txtGenre);
        txtAnimeEpisodeNo = findViewById(R.id.txtAnimeEpisodeNo);
        txtAnimeRating = findViewById(R.id.txtAnimeRating);
        txtPlot = findViewById(R.id.txtPlot);
        webView = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progressBar);
        mainLyt = findViewById(R.id.mainLyt);
    }

    private void fetchAnimeDetailsByID(Integer animeID) {
        progressBar.setVisibility(VISIBLE);
        AnimeApiService retrofitInstance = (AnimeApiService) RetrofitInstance.getApiClient();
        Call<AnimeChild> call = retrofitInstance.getAnimeByID(animeID);
        call.enqueue(new Callback<AnimeChild>() {
            @Override
            public void onResponse(Call<AnimeChild> call, Response<AnimeChild> response) {
                progressBar.setVisibility(GONE);
                if (response.isSuccessful()) {
                    AnimeChild animeChild = response.body();
                    Data data = animeChild.getData();
                    setViews(data);
                    Log.d("AnimeDetailScreen", "onResponse: " + data.getTitle());
                } else if (response.code() == 500) {
                    Log.d("AnimeDetailScreen", "onResponse: " + response);
                } else if (response.code() == 404) {
                    Log.d("AnimeDetailScreen", "onResponse: " + response);
                } else if (response.code() == 400) {
                    Log.d("AnimeDetailScreen", "onResponse: " + response);
                }
            }

            @Override
            public void onFailure(Call<AnimeChild> call, Throwable throwable) {

            }
        });
    }

    private void setViews(Data data) {
        String genre = "";
        txtDetailTitle.setText(data.getTitle());
        if (data.getGenres().size() > 1) {
            for (int i = 0; i < data.getGenres().size(); i++) {
                genre = genre + data.getGenres().get(i).getName() + " | ";
                txtGenre.setText(genre);
            }
        }
        if (data.getTrailer().getUrl() != null) {
            webView.setVisibility(VISIBLE);
            imgDetailPoster.setVisibility(GONE);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.loadUrl(data.getTrailer().getEmbedUrl().toString());

        } else {
            webView.setVisibility(GONE);
            imgDetailPoster.setVisibility(VISIBLE);
            Glide.with(this).load(data.getImages().getJpg().getLargeImageUrl()).into(imgDetailPoster);

        }

        txtAnimeEpisodeNo.setText(data.getEpisodes().toString().equals("1") ? data.getEpisodes().toString() + " episode " : data.getEpisodes().toString() + " episodes ");
        txtAnimeRating.setText(data.getRating().toString());
        txtPlot.setText(data.getSynopsis());

    }
}