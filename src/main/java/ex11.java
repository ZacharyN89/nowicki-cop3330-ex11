/*
Exercise 11 - Currency Conversion

At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your calculations are as precise as possible.

Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

The formula for currency conversion is

amount_to = (amount_from * rate_from) / rate_to

where

    amount_to is the amount in U.S. dollars.
    amount_from is the amount in euros.
    rate_from is the current exchange rate in euros.
    rate_to is the current exchange rate of the U.S. dollar.

Example Output

How many euros are you exchanging? 81
What is the exchange rate? 137.51
81 euros at an exchange rate of 137.51 is
111.38 U.S. dollars.

Constraints

    Ensure that fractions of a cent are rounded up to the next penny.
    Use a single output statement.

Challenges

    Build a dictionary of conversion rates and prompt for the countries instead of the rates.
    Wire up your application to an external API that provides the current exchange rates.

*/

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("How many euros are you exchanging? ");
        int euros = Integer.parseInt(cursor.nextLine());

        System.out.print("What is the exchange rate? ");
        double exchange = Double.parseDouble(cursor.nextLine());

        System.out.println(euros + " euros at an exchange rate of " + exchange + " is");

        double total = (euros*exchange) / 100.0027833;
        double totalRounded = Math.round(total * 100.0) / 100.0;
        System.out.println(totalRounded + " U.S. dollars.");
    }
}
