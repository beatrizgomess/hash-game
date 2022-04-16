package Hash;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        //String peca1 = JOptionPane.showInputDialog("X").toUpperCase(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;
        int jogada = 1;
        System.out.println("Bem vindo ao jogo da velha");
        System.out.println("Jogador 01 = X");
        System.out.println("Jogador 02 = O");
        while (!ganhou) {


            if (jogada % 2 == 1) {
                System.out.println("Vez do Jogador 01: ");
                System.out.println("Informe a posição que deseja: Entre 0 e 2");
                sinal = 'x';

            } else {
                System.out.println("Vez do jogador 02: ");
                System.out.println("Informe a posição que deseja: ");
                sinal = 'o';
            }

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


            if (tabuleiro[linha][coluna] == 'x' || tabuleiro[linha][coluna] == 'o') {
                System.out.println("Posição invalida. Tente Novamente");
            } else {
                tabuleiro[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
            }


            if ((tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'x' && tabuleiro[0][2] == 'x')
                    || (tabuleiro[1][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[1][2] == 'x')
                    || (tabuleiro[2][0] == 'x' && tabuleiro[2][1] == 'x' && tabuleiro[2][2] == 'x')
                    || (tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][0] == 'x')
                    || (tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro[2][0] == 'x')
                    || (tabuleiro[0][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][2] == 'x')
                    || (tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][1] == 'x')
                    || (tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro[2][2] == 'x')) {
                        System.out.println("Jogador 01 Venceu!!");
                        ganhou = true;
            } else {

                //Jogador 02
                if ((tabuleiro[0][0] == 'o' && tabuleiro[0][1] == 'o' && tabuleiro[0][2] == 'o')
                        || (tabuleiro[1][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[1][2] == 'o')
                        || (tabuleiro[2][0] == 'o' && tabuleiro[2][1] == 'o' && tabuleiro[2][2] == 'o')
                        || (tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o')
                        || (tabuleiro[0][0] == 'o' && tabuleiro[1][0] == 'o' && tabuleiro[2][0] == 'o')
                        || (tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o')
                        || (tabuleiro[0][1] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][1] == 'o')
                        || (tabuleiro[0][2] == 'o' && tabuleiro[1][2] == 'o' && tabuleiro[2][2] == 'o')) {
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
}
