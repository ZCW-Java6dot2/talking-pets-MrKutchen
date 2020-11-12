package io.zipcoder.polymorphism;



import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DisplayForPets display = new DisplayForPets(scanner);

        PetOwner petOwner = display.generateOwnerAndPets();
        display.printResults(petOwner);
    }

}
