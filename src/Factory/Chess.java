package Factory;

public class Chess {
    public Factory createChess(int pos){
        if(pos < 8){
            return  new King();
        }else {
            return new Queen();
        }
    }
}
