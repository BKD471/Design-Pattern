package lsp;


//Since a Square is a special type of rectange we can extends Rectange
public class Square extends  Rectangle{

    private  int side;

    public Square(int side) {
        super(side, side);
    }

    //since square is a special recatangle with height and width
    // and also height and width should be same
    //forcefully making both height and width to be same
    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    //since square height and width should be same
    @Override
    public void setHeight(int height) {
        setSide(height);
    }


    //forcefully making both to be equal
    public  void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }
}
