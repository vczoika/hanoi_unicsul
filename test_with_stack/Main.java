package com.company;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        Stack<Integer> haste1 = new Stack<Integer>();
        Stack<Integer> haste2 = new Stack<Integer>();
        Stack<Integer> haste3 = new Stack<Integer>();

        Scanner numeroDiscos = new Scanner(System.in);
        System.out.println("Digite a quantidade de discos: ");
        Integer discos = numeroDiscos.nextInt();

        for(int i = discos; i >= 1; i--) {
            haste1.push(i);
        }
        ordem(haste1.size(), haste1, haste3, haste2);
    }

    public static void ordem(int n, Stack<Integer> haste1, Stack<Integer> haste3, Stack<Integer> haste2 ) {
        if(n > 0) {
            ordem(n-1, haste1, haste2, haste3);
            haste3.push(haste1.pop());
            System.out.println("A | " + haste1 + "\n" + "B | " + haste2 + "\n" + "C | " + haste3 + "\n");
            ordem(n-1, haste2, haste3, haste1);
        }
    }
}
