package main;

public class mainClass {
    public static void main(String[] args) {
        while (true) {
            Library.displayMenu();
            int option = Library.getSelctionFromUser();
            if (Library.performSelection(option)) break;
        }

    }
}