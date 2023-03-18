package services.Impl;

import services.Post;

import java.util.List;

public class BlogPostImpl extends Post {
    private Long authorId;
    private  String authorName;
    private List<Post> blogList;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Post> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Post> blogList) {
        this.blogList = blogList;
    }

    @Override
    public String toString() {
        return "BlogPostImpl{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", blogList=" + blogList +
                '}';
    }
}
