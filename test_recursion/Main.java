package com.company;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static void towerOfHanoi(int n, char hasteOrigem, char hasteMover, char hasteAuxiliar) {
        if (n == 1) {
            System.out.println("Movendo disco 1 da haste " +  hasteOrigem + " para a haste " + hasteMover);
            return;
        }

        towerOfHanoi(n-1, hasteOrigem, hasteAuxiliar, hasteMover);
        System.out.println("Movendo disco " + n + " da haste " +  hasteOrigem + " para a haste " + hasteMover);
        towerOfHanoi(n-1, hasteAuxiliar, hasteMover, hasteOrigem);
    }

    //  Driver method
    public static void main(String args[]) {
        Scanner discos = new Scanner(System.in);
        System.out.println("Digite quantidade de discos: ");
        Integer numeroDiscos = discos.nextInt();

        int n = numeroDiscos; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}

