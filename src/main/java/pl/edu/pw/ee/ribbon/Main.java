package pl.edu.pw.ee.ribbon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please give me a ribbons total length: ");
        int totalLength = in.nextInt();

        Ribbon ribbon = new Ribbon(totalLength);
        System.out.println("Please give me three pieces of ribbon that will be cut: ");

        for (int i = 0; i < 3; i++){
            ribbon.setPieces(i, in.nextInt());
        }

        System.out.println("Max number of cut pieces is : " + ribbon.countMaxNumber());
        in.close();
    }
}
