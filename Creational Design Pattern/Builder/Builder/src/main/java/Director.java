
//We have seen that builder provides these multiple methods to build parts.
//Now somebody has to call these methods and there could be a sequence in which these methods need to be called.
//So there is a logic in which the builder has to be used and that logic is provided by director.
//So director knows how to use a builder object to create our final product.
public class Director{
    Builder builder;

    Director(Builder builder){
        this.builder=builder;
    }

}
