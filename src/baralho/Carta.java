package baralho;


public class Carta {
    private String face, naipe;

    public Carta(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    
    @Override
    public String toString() {
        String carta = face+ " de " +naipe;
        return carta;
    }
    
    
}
