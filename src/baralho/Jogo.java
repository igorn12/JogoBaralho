package baralho;

import java.util.Scanner;

public class Jogo {
    private Scanner input = new Scanner(System.in);
    private Baralho baralho = new Baralho();
    private Jogador[] jogadores;
    
    public void iniciarJogo(){
        baralho.mostrarBaralho();
        baralho.embaralhar();
        baralho.mostrarBaralho();
        
        System.out.println("Informe o número de jogadores (Máximo 7 jogadores):");
        
        int qtdJogadores = input.nextInt();
        do{
            if(qtdJogadores > 7){
                System.out.println("Número de jogadores inválido");
                System.out.println("Máximo de 7 jogadores");
                qtdJogadores = input.nextInt();
            }
        }while(qtdJogadores>7);
        
        jogadores = new Jogador[qtdJogadores];
        
        for (int i = 0; i < qtdJogadores; i++) {
            System.out.println("Jogador "+(i+1)+" informe seu nome:");
            String name = input.next();
            jogadores[i] = new Jogador(name);
        }
    }
    
    public void distribuirCartas(int qtdCartas){
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("DISTRIBUINDO CARTAS");
            jogadores[i].setCartas(baralho.destribuirCartas(qtdCartas));
        }
    }
    
    public void mostrarCartas(){
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].mostrarCartas();
        }
    }
    
    public static void main(String[] args) {
        Jogo j = new Jogo();
        j.iniciarJogo();
        j.distribuirCartas(7);
        j.mostrarCartas();
    }
}
