package com.prabhakar.notifyadapter;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    private ArrayList<TopicModel> topics;
    private RecyclerView recyclerView;
    private TopicAdapter topicAdapter;
    private CardView cardView;
    private TextView textView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setAdapter();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);

    }

    private void buildList() {
        topics = new ArrayList<>();
        topics.add(new TopicModel("Books", false));
        topics.add(new TopicModel("Podcasts", false));
        topics.add(new TopicModel("News", false));
        topics.add(new TopicModel("Business", false));
        topics.add(new TopicModel("Entertainment", false));
        topics.add(new TopicModel("Sports", false));
        topics.add(new TopicModel("Technology", false));
        topics.add(new TopicModel("Pronunciation", false));
        topics.add(new TopicModel("Grammar", false));
        topics.add(new TopicModel("Health", false));
        topics.add(new TopicModel("Books", false));
        topics.add(new TopicModel("Books", false));
        topics.add(new TopicModel("Books", false));
        topics.add(new TopicModel("Podcasts", false));
        topics.add(new TopicModel("News", false));
        topics.add(new TopicModel("Business", false));
        topics.add(new TopicModel("Entertainment", false));
        topics.add(new TopicModel("Sports", false));
        topics.add(new TopicModel("Technology", false));
        topics.add(new TopicModel("Pronunciation", false));
        topics.add(new TopicModel("Grammar", false));
        topics.add(new TopicModel("Health", false));
        topics.add(new TopicModel("Books", false));
        topics.add(new TopicModel("Books", false));
    }

    private void setAdapter() {
        topicAdapter = new TopicAdapter(topics, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(topicAdapter);
    }

    @Override
    public void onItemClicked(int position, TopicModel topicModel) {
        Toast.makeText(MainActivity.this, "item click", Toast.LENGTH_SHORT).show();
//        cardView = findViewById(R.id.topic_card);
//        textView = findViewById(R.id.topic_name);
//        if (topics.get(position).getIsClick()) {
//            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
//            textView.setTextColor(Color.parseColor("#0583EA"));
//            topics.get(position).setClick(false);
//        } else {
//            cardView.setCardBackgroundColor(Color.parseColor("#0583EA"));
//            textView.setTextColor(Color.parseColor("#FFFFFF"));
//            topics.get(position).setClick(true);
//        }
        topicAdapter.notifyItemChanged(position);
    }
}