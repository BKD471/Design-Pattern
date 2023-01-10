package lsp;


//Square no more extends Rectange
//rather  it implements shape and overrides the calculateArea()
//hence no more impressions will be given to developers that we can substitute Rectangels Objects
//with Square instances,
public class Square implements  Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int computeArea() {
        return side*side;
    }
}
