package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pricePerDay = new int[]{77, 45, 32, 65, 99, 101, 46};
        int totalPrice = 0;
        System.out.println("Unsorted prices for the product during this week: " + Arrays.toString(pricePerDay));

        for (int i = 0; i < pricePerDay.length - 1; i++) {
            for (int j = 0; j < pricePerDay.length - i - 1; j++) {
                if (pricePerDay[j] > pricePerDay[j + 1]) {
                    int temp = pricePerDay[j];
                    pricePerDay[j] = pricePerDay[j + 1];
                    pricePerDay[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted prices for the product during this week: " + Arrays.toString(pricePerDay));

        for (int price : pricePerDay) {
            totalPrice += price;
        }
        double avgPrice = totalPrice * 1.0 / pricePerDay.length;
        System.out.printf("Average price is: %.2f", avgPrice);
    }
}