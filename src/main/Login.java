package main;

import java.io.BufferedReader;

public class Login {
    public static boolean loggedIn = false;
    public static String savedLibraryNumber = "";
    public static void login() {
        Login.clearLogin();
        BufferedReader reader=Library.createNewReader();
        System.out.println("Enter your library number");
        try {
            String libraryNumber = reader.readLine();
            if (validLibraryNumber(libraryNumber)) {
                try {
                    System.out.println("Enter your Password: ");
                    String password = reader.readLine();
                    if (validPassword(password)) {
                        loggedIn = true;
                        savedLibraryNumber = libraryNumber;
                    }
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {

        }
    }

    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }

    private static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }
}