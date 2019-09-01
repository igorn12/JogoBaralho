package baralho;

import java.util.Random;


public class Baralho {
    private Carta[] cartas;
    private Random aleatorio;
    private int cont=0;

    public Baralho() {
        cartas = new Carta[52];
        int num = 0;
        String toFace = null, toNaipe = null;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (i == 0){
                    toNaipe = "Paus";
                }else if(i == 1){
                    toNaipe = "Copas";
                }else if(i == 2){
                    toNaipe = "Espadas";
                }else{
                    toNaipe = "Ouros";
                }
                if(j == 0){
                    toFace = "A";
                }else if(j<10){
                    toFace = String.valueOf(j+1);
                }else if(j == 10){
                    toFace = "J";
                }else if( j == 11){
                    toFace = "Q";
                }else{
                    toFace = "K";
                }
                cartas[num] = new Carta(toFace, toNaipe);
                num++;
            }
        }
    }
    
    public void mostrarBaralho(){
        System.out.println("----------------- MOSTRANDO BARALHO ----------------");
        for(Carta i : cartas) {
            System.out.println(i.toString());
        }
    }
    
    public void embaralhar(){
        aleatorio = new Random();
        System.out.println("EMBARALHANDO");
        for (int i = 0; i < cartas.length; i++) {
            Carta aux;
            int x = aleatorio.nextInt(cartas.length);
            aux = cartas[i];
            cartas[i] = cartas[x];
            cartas[x] = aux;
        }
    }
    
    public Carta[] destribuirCartas(int qtdCartas){
        Carta[] maoJogador = new Carta[qtdCartas];
        for (int i = 0; i < qtdCartas; i++) {
            maoJogador[i] = cartas[cont];
            cont++;
        }
        return maoJogador;
    }

    public Carta[] getCartas() {
        return cartas;
    }
}
