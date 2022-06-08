public class Czas {
    private int godzina, minuta;
    Czas(int godzina, int minuta){
        this.godzina=godzina;
        this.minuta=minuta;
    }

    public int getGodzina(){
        return godzina;
    }

    public int getMinuta() {
        return minuta;
    }

    public String toString(){
        return godzina+":"+minuta;
    }
}
