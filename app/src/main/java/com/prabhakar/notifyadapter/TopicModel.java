package com.prabhakar.notifyadapter;

public class TopicModel {
    String topicName;
    boolean isClick;

    public TopicModel(String topicName, boolean isClick) {
        this.topicName = topicName;
        this.isClick = isClick;
    }

    public String getTopicName() {
        return topicName;
    }

    public boolean getIsClick() {
        return isClick;
    }

    public void setClick(boolean click) {
        isClick = click;
    }
}
