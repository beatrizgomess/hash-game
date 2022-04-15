package Hash;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char[][] tabuleiro = new char[3][3];
    //String peca1 = JOptionPane.showInputDialog("X").toUpperCase(Locale.ROOT);
    boolean ganhou = false;

    while(ganhou != true) {

        System.out.println("Bem vindo ao jogo da velha");
        System.out.println("Tabuleiro: ");
        System.out.println("Jogador 01 = X");
        System.out.println("Jogador 02 = O");

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " - ");
            }
            System.out.println();
        }
        System.out.println("A letra NULL significa 'POSIÇÃO LIVRE'");
        System.out.println("Vez do Jogador 01: ");
        System.out.println("Informe a posição que deseja: ");
        int linha = 0;
        int coluna = 0;
        System.out.println("Linha: ");
        linha = scan.nextInt();
        System.out.println("Coluna: ");
        coluna = scan.nextInt();
        System.out.println("Confirme o envio da peça: ");
        char peca1 = scan.next().charAt(0);

        tabuleiro[linha][coluna] = peca1;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("Vez do jogador 02: ");
        System.out.println("Informe a posição que deseja: ");
        System.out.println("Linha: ");
        linha = scan.nextInt();
        System.out.println("Coluna: ");
        coluna = scan.nextInt();
        System.out.println("Confirme o envio da peça: ");
        char peca2 = scan.next().charAt(0);

        tabuleiro[linha][coluna] = peca2;


        if(tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'x' && tabuleiro[0][2] == 'x') {
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;

        }
        if(tabuleiro[1][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[1][2] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }

        if(tabuleiro[2][0] == 'x' && tabuleiro[2][1] == 'x' && tabuleiro[2][2] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }
        if(tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][0] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }
        if(tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro[2][0] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }
        if(tabuleiro[0][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][2] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }

        if(tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][1] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }

        if(tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro[2][2] == 'x'){
            System.out.println("Jogador 01 Venceu!!");
            ganhou = true;
        }

        //Jogador 02

        if(tabuleiro[0][0] == 'o' && tabuleiro[0][1] == 'o' && tabuleiro[0][2] == 'o') {
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;

        }
        if(tabuleiro[1][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[1][2] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }

        if(tabuleiro[2][0] == 'o' && tabuleiro[2][1] == 'o' && tabuleiro[2][2] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }
        if(tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }
        if(tabuleiro[0][0] == 'o' && tabuleiro[1][0] == 'o' && tabuleiro[2][0] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }
        if(tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }

        if(tabuleiro[0][1] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][1] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }

        if(tabuleiro[0][2] == 'o' && tabuleiro[1][2] == 'o' && tabuleiro[2][2] == 'o'){
            System.out.println("Jogador 02 Venceu!!");
            ganhou = true;
        }

    }
    }
}
