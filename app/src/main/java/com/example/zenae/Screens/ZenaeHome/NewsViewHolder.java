package com.example.zenae.Screens.ZenaeHome;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zenae.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout newItemContainer;

    @BindView(R.id.newsTitle)
    public TextView title;

    @BindView(R.id.newsDetail)
    public TextView brief;

    @BindView(R.id.newsComposerLabel)
    public TextView newsComposerLabel;

    @BindView(R.id.newsComposerName)
    public TextView newsComposerName;

    @BindView(R.id.newsImage)
    public ImageView newsImage;

    @BindView(R.id.newsDate)
    public TextView newsDate;



    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this,itemView);
        title = itemView.findViewById(R.id.newsTitle);
        brief = itemView.findViewById(R.id.newsDetail);
        newsComposerLabel = itemView.findViewById(R.id.newsComposerLabel);
        newsComposerName = itemView.findViewById(R.id.newsComposerName);
        newsImage = itemView.findViewById(R.id.newsImage);
        newItemContainer = itemView.findViewById(R.id.newItemContainer);
    }
}
