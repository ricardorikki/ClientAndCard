package com.company.Domain;

import java.util.Scanner;

public class Card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    //Default Constructor
    public Card() {
    }

    Scanner sc = new Scanner(System.in);

    //Constructor
    public Card(int cardNumber, double balance,
                int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
        cardNumber = 45678;
    }

    public int getCardNumber() {

        return cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        System.out.print("Enter balance: ");
        balance = sc.nextInt();
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        System.out.print("Enter pin: ");
        pin = sc.nextInt();
        return pin;
    }

    public void setStatus(boolean status) {this.status = status;}

    public boolean getStatus() {return status;}

    //method to display
    public  void display(){
        System.out.println("\nThe Card Number is: " +cardNumber);
        System.out.println("Your balance is: " +balance);
        System.out.println("The pin you entered is: " +pin);
        System.out.println("The status of the card is: " +status);
    }


}
