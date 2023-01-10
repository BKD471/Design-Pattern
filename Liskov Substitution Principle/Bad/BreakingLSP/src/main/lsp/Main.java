package lsp;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        //useRectangle(rectangle);

        useRectangle(square);
    }

    //since square extends Rectangle we can pass square through
    //its parent class reference
    public static void useRectangle(Rectangle rectangle){
        // giving differnt height & width to both rectange & square objects
        rectangle.setHeight(70);
        rectangle.setWidth(80);

        //Here comes the problem
        //code behaved as it should for rectange instance
        //but for  square instance,its height becomes 80, since we passed setWidth(80) as last call
        //square made 80 as both height and width, this breaks the code
        //because we are violating LSP, it says we can substitute Parent class obj with child class
        //as long as it doesnot breaks the code
        //its virtually impossible to substitute Recatngle obj with child square obj
        //coz  if we set differnt height and width for both recatngle & square instance
        //square instances will be affected
        if(rectangle.getHeight()==70) System.out.println("Working bro") ;
        else System.out.println(String.format("Not working bro height is %s",rectangle.getHeight()));



    }
}
