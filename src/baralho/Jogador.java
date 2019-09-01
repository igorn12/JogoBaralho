package baralho;

public class Jogador {
    private String name;
    private Carta[] carta;

    public Jogador(String name) {
        this.name = name;
    }

    public void setCartas(Carta[] carta) {
        this.carta = carta;
    }
    
    public void mostrarCartas(){
        System.out.println("---------------- CARTAS DE "+name+" ---------------");
        for (int i = 0; i < carta.length; i++) {
            System.out.println(carta[i].toString());
        }
    }
}
