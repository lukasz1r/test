public class Lotnisko{
    

    private String nazwa;
    private int x, y;

    Lotnisko(String nazwa, int x, int y){
        this.nazwa = nazwa;
        this.x = x;
        this.y = y;
    }

    public String getNazwa(){
        return nazwa;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }   

    public String toString(){
        return nazwa + " | " + x + " | " + y + "\n";
    }
}
