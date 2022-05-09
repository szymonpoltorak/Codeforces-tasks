package pl.edu.pw.ee.ribbon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please give me a ribbons total length: ");
        int totalLength = in.nextInt();

        if (totalLength < 1){
            throw new IllegalArgumentException("Total length is out of range!!!");
        }

        System.out.println("Please give me three pieces of ribbon that will be cut: ");
        int[] pieces = new int[3];

        for (int i = 0; i < 3; i++){
            pieces[i] = in.nextInt();
            if (pieces[i] < 1 || pieces[i] > 4000){
                throw new IllegalArgumentException("Arguments are out of range!!");
            }
        }

        int maxNumber = 0;
        for (int i = 0; i < 3; i++){
            int size = 0;
            int number = 0;

            for (int j = i; j < 3; j++){
                int newSize = size + pieces[j];

                if (newSize <= totalLength){
                    number++;
                    size = newSize;
                }
            }
            maxNumber = Math.max(number, maxNumber);
        }

        System.out.println("Max number of cut pieces is : " + maxNumber);
        in.close();
    }
}
