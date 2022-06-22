package pl.edu.pw.ee.drink;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)){
            System.out.print("Give a number of shops: ");
            var n = in.nextInt();

            if (n < 1 || n > 100_000){
                throw new IllegalArgumentException();
            }
            var bottlePrices = new int[n];

            System.out.println("Enter prices of bottles in each shop:");
            for (int i = 0; i < n; i++){
                var price = in.nextInt();

                if (price < 1 || price > 100_000){
                    throw new IllegalArgumentException();
                }
                bottlePrices[i] = price;
            }

            System.out.print("Enter number of days: ");
            var days = in.nextInt();

            if (days < 1 || days > 100_000){
                throw new IllegalArgumentException();
            }

            System.out.println("Enter number of coins Vasily has each day:");
            var coins = new int[days];
            for (int i = 0; i < coins.length; i++){
                var coinNumber = in.nextInt();

                if (coinNumber < 1 || coinNumber > 1000_000_000){
                    throw new IllegalArgumentException();
                }
                coins[i] = coinNumber;
            }

            for (int coin : coins){
                var canDrink = 0;
                for (int bottlePrice : bottlePrices) {
                    if (bottlePrice <= coin) {
                        canDrink++;
                    }
                }
                System.out.println(canDrink);
            }
        } catch (IllegalArgumentException | InputMismatchException e){
            System.err.println("Illegal arguments given !");
        }
    }
}
