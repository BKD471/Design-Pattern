package services.Impl;

import services.Post;

import java.util.List;

public class ProductPostImpl extends  Post {
    private Long productId;

    private String postName;

    private List<Post> productsList;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public List<Post> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Post> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "ProductPostImpl{" +
                "productId=" + productId +
                ", postName='" + postName + '\'' +
                ", productsList=" + productsList +
                '}';
    }
}
