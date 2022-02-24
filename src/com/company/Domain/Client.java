package com.company.Domain;
import java.util.Scanner;

public class Client {
    //field or data member or instance variable
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    Card card;

    Scanner sc = new Scanner(System.in);

    //Default Constructor
    public Client(){}


    //Constructor
    public Client(int idNum, String fName,
                  String lName, int age){
        this.idNumber = idNum;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.card = new Card();
    }

    //Getters
    public int getIdNumber() {
        System.out.print("Enter ID No: ");
        idNumber = sc.nextInt();
        return idNumber;
    }
    public int getAge() {
        System.out.print("Enter age: ");
        age = sc.nextInt();
        return age;
    }
    public String getFirstName() {
        System.out.print("Enter First Name: ");
        firstName = sc.next();
        return firstName;
    }
    public String getLastName() {
        System.out.print("Enter Last Name: ");
        lastName = sc.next();
        return lastName;
    }

    //Setters
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

  /* public void setCard(Card card) {
        this.card = card;

    }   */

    public Card getCard() {
        System.out.println("The card is: " +card);
        return card;
    }

    //method to display
        public  void display(){
            System.out.println("\nThe ID Number is: " +idNumber);
            System.out.println("The First Name is: " +firstName);
            System.out.println("The Last Name is: " +lastName);
            System.out.println("The age is: " +age);
    }



}
