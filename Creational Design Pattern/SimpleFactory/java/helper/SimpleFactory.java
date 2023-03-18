package helper;

import services.Impl.BlogPostImpl;
import services.Impl.NewsPostImpl;
import services.Impl.ProductPostImpl;
import services.Post;

public class SimpleFactory {
    public static Post getPost(String type){
        switch(type){
            case "news":    return new NewsPostImpl();
            case "product": return new ProductPostImpl();
            case "blogs":   return new BlogPostImpl();
            default: throw  new IllegalStateException("Nahi mila bsdk");
        }
    }
}
