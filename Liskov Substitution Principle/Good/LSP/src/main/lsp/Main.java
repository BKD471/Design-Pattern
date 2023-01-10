package lsp;


public class Main {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangle(rectangle);
        //useRectangle(square); we can no longer pass square type instances to useRectange
        //so no more breaking the code
        //separate code has to be written for square like useSquare(Square square);
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        if(rectangle.getHeight() == 20) System.out.println("Height  equal to 20");
        if(rectangle.getWidth() == 30) System.out.println("Width  equal to 30");
    }
}
