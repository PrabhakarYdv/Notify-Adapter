package com.prabhakar.notifyadapter;

import android.widget.TextView;

import androidx.cardview.widget.CardView;

public interface ClickListener {
    void onItemClicked(int position,TopicModel topicModel);
}
