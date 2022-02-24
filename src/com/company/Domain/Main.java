package com.company.Domain;

public class Main {

    public static void main(String[] args) {
	// write your code here

Client obj1 = new Client (765, "tray","knight",0);
Card card = new Card();
obj1.getIdNumber();
obj1.getFirstName();
obj1.getLastName();
obj1.getAge();
obj1.card.setCardNumber(45678);
obj1.card.getPin();
obj1.card.getBalance();
obj1.display();
obj1.card.setStatus(true);
obj1.card.display();

    }
}
