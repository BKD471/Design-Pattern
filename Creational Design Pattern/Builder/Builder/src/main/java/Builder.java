
//interface that defines methods  that allows user to build parts of objects
// Earlier we have seen the Prodcut constr is using multiple arguments,
//this builder provides these arguments one at a time, so its easy to create the final one big object
public interface Builder {

    //its job is to instantiate the Prodcut class
    public void build();

    //users use it to query already built objects
    // once obj has been asembled by build method, user can use it to query the assembled object
    public Product getProduct();
}
