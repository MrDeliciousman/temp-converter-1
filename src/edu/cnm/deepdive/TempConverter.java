package edu.cnm.deepdive;

import java.util.Scanner;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean repeat;

    do {
      double fahrenheit;
      double celsius;
      System.out.print("Enter a Temperature in Farenheit: ");
      fahrenheit = input.nextDouble();
      celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println(celsius);
      System.out.print("Convert another (true/false)? ");
      System.out.println("Continue?");
      repeat = input.nextBoolean();
    } while (repeat);
  }
}
