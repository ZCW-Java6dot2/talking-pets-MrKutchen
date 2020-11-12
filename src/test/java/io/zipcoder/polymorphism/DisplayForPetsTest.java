package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class DisplayForPetsTest extends TestCase {

    @Test
    public void testPrintResultsDog() {

        String input = "Peter\n1\nDog\nFido\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        displayForPets.printResults(petOwner);

    }

    @Test
    public void testPrintResultsCat() {

        String input = "Peter\n1\nCat\nFluffy\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        displayForPets.printResults(petOwner);

    }

    @Test
    public void testPrintResultsChicken() {

        String input = "Peter\n1\nChicken\nRed\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        displayForPets.printResults(petOwner);

    }

    @Test
    public void testPrintResultsWringAnimal() {

        String input = "Peter\n1\nPuppy\nScooby\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        DisplayForPets displayForPets = new DisplayForPets(scanner);

        PetOwner petOwner = displayForPets.generateOwnerAndPets();
        displayForPets.printResults(petOwner);

    }

}