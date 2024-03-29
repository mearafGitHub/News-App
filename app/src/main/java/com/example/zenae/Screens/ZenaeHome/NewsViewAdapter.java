package com.example.zenae.Screens.ZenaeHome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zenae.R;
import com.example.zenae.Repository.data.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    Context context;
    List<News> newsList;
    LayoutInflater inflater;

    public NewsViewAdapter(Context context, List<News> newses) {
        this.context = context;
        newsList = new ArrayList<>(newses) ;
        newsList = newses;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewItem = inflater.inflate(R.layout.news_item_layout, parent, false);
        return new NewsViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

        News news = newsList.get(position);

        holder.newsItemContainer.setAnimation(AnimationUtils.loadAnimation(context, R.anim.list_fade_anim));
        holder.title.setText(news.getTitle());
        holder.newsComposerLabel.setText("Writer: ");
        holder.newsComposerName.setText(news.getPublisher());
        holder.newsDate.setText(news.getDate());
        holder.brief.setText(news.getBrief());
        holder.newsImage.setImageResource(news.getNewsImage());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
