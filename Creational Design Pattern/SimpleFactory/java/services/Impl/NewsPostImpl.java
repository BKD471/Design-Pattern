package services.Impl;

import services.Post;

import java.util.List;

public class NewsPostImpl extends Post {
    private Long newsId;
    private String newsName;
    private List<Post> newsFeed;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public List<Post> getNewsFeed() {
        return newsFeed;
    }

    public void setNewsFeed(List<Post> newsFeed) {
        this.newsFeed = newsFeed;
    }

    @Override
    public String toString() {
        return "NewsPostImpl{" +
                "newsId=" + newsId +
                ", newsName='" + newsName + '\'' +
                ", newsFeed=" + newsFeed +
                '}';
    }
}
