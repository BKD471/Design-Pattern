

//Its a concrete class provides the implementation of builder
//It will provide all the method implementations which construct the parts of our object.
//It will also provide a method that assembles the final object and it can also optionally keep track
//of the object that it just built so that anybody can call that method and get the already built object
public class ConcreteBuilder extends  Product implements  Builder{
    public void build() {

    }

    public Product getProduct() {
        return null;
    }
}
