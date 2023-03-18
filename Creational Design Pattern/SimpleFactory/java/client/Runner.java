package client;

import helper.SimpleFactory;
import services.Post;

public class Runner {
    public static void main(String[] args) {
        Post post= SimpleFactory.getPost("product");
        System.out.println(post);
    }
}
