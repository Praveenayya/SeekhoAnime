package com.example.seekhoanime.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.seekhoanime.R;
import com.example.seekhoanime.appPojoClasses.animemain.Datum;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {
    Context context;
    onClickListener onClickListener;
    List<Datum> animeList;

    public AnimeAdapter(Context context, List<Datum> animeList, AnimeAdapter.onClickListener onClickListener) {
        this.context = context;
        this.onClickListener = onClickListener;
        this.animeList = animeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(animeList.get(position).getImages().getJpg().getImageUrl()).into(holder.imgPoster);
        holder.txtAnimeTitle.setText(animeList.get(position).getTitle());
        holder.txtAnimeEpisodeNo.setText(animeList.get(position).getEpisodes().toString().equals("1") ?animeList.get(position).getEpisodes().toString()+ " episode "  : animeList.get(position).getEpisodes().toString() +" episodes ");
        holder.txtAnimeRating.setText("⭐  " + animeList.get(position).getScore().toString());

        holder.crdPoster.setOnClickListener(v -> {
            onClickListener.onItemClick(position, animeList.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView txtAnimeTitle, txtAnimeEpisodeNo, txtAnimeRating;
        CardView crdPoster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.imgPoster);
            txtAnimeTitle = itemView.findViewById(R.id.txtAnimeTitle);
            txtAnimeEpisodeNo = itemView.findViewById(R.id.txtAnimeEpisodeNo);
            txtAnimeRating = itemView.findViewById(R.id.txtAnimeRating);
            crdPoster = itemView.findViewById(R.id.crdPoster);

        }
    }

    public interface onClickListener {
        void onItemClick(int position, Datum data);
    }
}
