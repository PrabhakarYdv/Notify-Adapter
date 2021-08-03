package com.prabhakar.notifyadapter;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TopicViewHolder extends RecyclerView.ViewHolder {
    private TextView topicName;
    private CardView topicCard;
    private ClickListener clickListener;

    public TopicViewHolder(@NonNull View itemView, ClickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        initViews(itemView);

    }

    private void initViews(View itemView) {
        topicName = itemView.findViewById(R.id.topic_name);
        topicCard = itemView.findViewById(R.id.topic_card);

    }

    public void setTopicData(TopicModel topicModel) {
        topicName.setText(topicModel.getTopicName());
        topicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClicked(getAdapterPosition(), topicModel);
                if (topicModel.getIsClick()) {
                    topicCard.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    topicName.setTextColor(Color.parseColor("#0583EA"));
                    topicModel.setClick(false);
                } else {
                    topicCard.setCardBackgroundColor(Color.parseColor("#0583EA"));
                    topicName.setTextColor(Color.parseColor("#FFFFFF"));
                    topicModel.setClick(true);
                }
            }

        });
    }
}