package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Library {


    public static void displayMenu() {
        System.out.println("**********************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Check out Book                              *");
        System.out.println("*         3. Check Library Number                        *");
        System.out.println("*         4. Movie Listing                               *");
        System.out.println("*         5. Login                                       *");
        System.out.println("*         9. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");

    }

    public static int getSelctionFromUser() {
        BufferedReader reader=createNewReader();
        int option = 0;
        try {
            String value = reader.readLine();
            option = Integer.parseInt(value);
        } catch (Exception e) {
            // Do you know what numbers are!!!
            System.out.println("Enter a valid integer!!");
        }
        return option;
    }

    public static BufferedReader createNewReader() {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        return new BufferedReader(inputStream);
    }

    public static boolean performSelection(int option) {
        if (option == 1) {
            displayBookList();
        } else if (option == 2) {
            checkOutBook();       }
        else if (option == 3) {
            checkLibraryNumber();
        } else if (option == 4) {
            displayMovieList();
        } else if (option == 5) {
            Login.login();

        } else if (option == 9) {
            System.out.println("Quitting...");
            return true;
        } else {
            System.out.println("\n");
            System.out.println("Enter a valid integer!!");
        }
        return false;
    }

    private static void displayBookList() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
    }

    public static void checkOutBook() {
        int option=0;
        System.out.println(" Please enter the number of the book you wish to checkout: ");
        option = getSelctionFromUser();
        System.out.println("\n");
        if (option==1||option==2||option==3||option==4)
            System.out.println(" Thank You! Enjoy the book.");
        else
            System.out.println("Sorry we don't have that book yet.");
    }

    private static void checkLibraryNumber()
    {
        System.out.println("\n");
        if (Login.loggedIn)
            System.out.println("Your library number is " + Login.savedLibraryNumber);
        else
            System.out.println("Please talk to Librarian. Thank you.");
    }

    private static void displayMovieList() {
        System.out.println(createMovie("Rocky", "John G. Avildsen", "10"));
        System.out.println(createMovie("Rocky II", "John G. Avildsen", "9"));
        System.out.println(createMovie("Rocky III", "John G. Avildsen", "8"));
        System.out.println(createMovie("Rocky IV", "John G. Avildsen", "7"));
        System.out.println(createMovie("Rocky V", "John G. Avildsen", "8"));
        System.out.println(createMovie("Drainage", "Francisco Trindade", "N/A"));
        System.out.println(createMovie("The Shawshank Redemption", "Frank Darabont", "10"));
        System.out.println(createMovie("The Godfather", "Francis Ford Coppola", "7"));
        System.out.println(createMovie("Inception", "Frank Darabont", "10"));
        System.out.println(createMovie("Pulp Fiction", "Quentin Tarantino", "6"));
    }

    private static String createMovie(String movieTitle, String movieDirector, String movieRanking) {
        return movieTitle + " - Director: " + movieDirector + " Rating: " + movieRanking;
    }




}

