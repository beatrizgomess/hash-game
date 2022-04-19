package Hash;

import java.util.Scanner;

public class HashGame {
Scanner scan = new Scanner(System.in);
    int jogada;
    int linha;
    int coluna;
    char sinal;
    boolean ganhou;
    char[][] tabuleiro;

    //Construtor

    public HashGame(){
        tabuleiro = new char[3][3];
    }

    void desenharTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
    }

    void determinarJogador(){
        if(jogada % 2 == 1){
            System.out.println("Jogador 01, sua vez!");
            System.out.println("Posição: [0-2]");
            sinal = 'X';
        }else{
            System.out.println("Jogador 02, sua vez!");
            System.out.println("Posição: [0-2]");
            sinal = 'O';
        }
    }

    void validarJogada(){
        boolean linhaValida = false;
        while (!linhaValida) {
            System.out.println("Linha: ");
            linha = scan.nextInt();
            if (linha >= 0 && linha <= 2) {
                linhaValida = true;

            } else {
                System.out.println("Entrada Invalida. Tente Novamente");
            }
        }
        boolean colunaValida = false;
        while (!colunaValida) {
            System.out.println("Coluna: ");
            coluna = scan.nextInt();
            if (coluna >= 0 && coluna <= 2) {
                colunaValida = true;
            } else {
                System.out.println("Coluna Inválida. Tente Novamente");
            }
        }

    }

    void fazerJogada() {
        while(ganhou == false){
            desenharTabuleiro();
            determinarJogador();
            validarJogada();
            if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                System.out.println("Posição invalida. Tente Novamente");
            } else {
                tabuleiro[linha][coluna] = sinal;
                jogada++;
            }
            regras();

        }

    }

    void regras(){
        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')
                || (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')
                || (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')
                || (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')
                || (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X')
                || (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
                || (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')
                || (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')) {
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        } else {

            //Jogador 02
            if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O')
                    || (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')
                    || (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')
                    || (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')
                    || (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O')
                    || (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
                    || (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')
                    || (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')) {
                System.out.println("Jogador 02 Venceu!!");
                ganhou = true;

            }else{
                if(jogada > 9){
                    ganhou = true;
                    System.out.println("Ninguem ganhou! Deu velha!!!");
                }
            }
        }
    }





}
