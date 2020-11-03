package com.company;
import java.util.Scanner;

public class Main {

    static void torreInfo(int n, char hasteOrigem, char hasteMover, char hasteAuxiliar) {
        if (n == 1) {
            System.out.println("[disco 1] da haste " +  hasteOrigem + " para a haste " + hasteMover);
            return;
        }

        torreInfo(n-1, hasteOrigem, hasteAuxiliar, hasteMover);
        System.out.println("[disco " + n + "] da haste " +  hasteOrigem + " para a haste " + hasteMover);
        torreInfo(n-1, hasteAuxiliar, hasteMover, hasteOrigem);
    }

    public static void main(String args[]) {
        Scanner discos = new Scanner(System.in);
        System.out.println("Digite quantidade de discos: ");
        Integer numeroDiscos = discos.nextInt();
        int n = numeroDiscos;
        torreInfo(n, 'A', 'C', 'B');

        // Conta para descobrir numero minimo de movimentos. 2^n - 1
        int baseMovimentos = 2;
        double potencia;
        potencia = Math.pow(baseMovimentos, numeroDiscos);
        int potenciaInt = (int)potencia;
        int numeroMovimentos = potenciaInt - 1;
        System.out.println("Quantidade minima de movimentos: " + numeroMovimentos + " movimentos.");


    }
}

