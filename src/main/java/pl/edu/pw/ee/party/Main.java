package pl.edu.pw.ee.party;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        var in = new Scanner(System.in);

        System.out.print("Please enter the number of employees: ");

        var numOfEmployees = in.nextInt();
        if (numOfEmployees < 1 || numOfEmployees > 2000){
            throw new IllegalArgumentException("Employee number out of range!");
        }

        System.out.println("Please insert manager of each employee\n");
        var values = new int[numOfEmployees + 1];

        for (int i = 1; i < values.length; i++){
            System.out.printf("Manager[%d]: ", i);
            int manager = in.nextInt();

            if (manager < -1 || manager == 0 || manager > numOfEmployees){
                throw new IllegalArgumentException("Wrong manager given!");
            }
            if (manager == -1){
                values[0]++;
            }
            else {
                values[manager]++;
            }
        }

        var numOfManagers = 0;
        for (int value : values) {
            if (value >= 1) {
                numOfManagers++;
            }
        }
        System.out.println("Number of managers: " + numOfManagers);

        in.close();
    }
}
