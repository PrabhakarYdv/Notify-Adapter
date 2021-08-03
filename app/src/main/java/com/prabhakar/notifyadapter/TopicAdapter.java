package com.prabhakar.notifyadapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopicAdapter extends RecyclerView.Adapter<TopicViewHolder> {
    private ArrayList<TopicModel> topicLists;
    private ClickListener clickListener;

    public TopicAdapter(ArrayList<TopicModel> topicLists, ClickListener clickListener) {
        this.topicLists = topicLists;
        this.clickListener = clickListener;
    }

    @NonNull

    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
            Log.d("TAG","onCreateViewHolder");
        return new TopicViewHolder(view,clickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull TopicViewHolder holder, int position) {
        TopicModel model = topicLists.get(position);
        holder.setTopicData(model);
        Log.d("TAG","onBindViewHolder");
    }

    @Override
    public int getItemCount() {
        return topicLists.size();

    }
    public void updateData(ArrayList<TopicModel> topicLists){
        this.topicLists=topicLists;
        notifyDataSetChanged();
    }
}
