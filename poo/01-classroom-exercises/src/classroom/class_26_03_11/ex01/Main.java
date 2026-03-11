package classroom.class_26_03_11.ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int option = -1; // By default
        MenuUtils menuUtils = new MenuUtils();
        menuUtils.scanner = new Scanner(System.in);

        do {
            System.out.println("WELCOME TO THE PROGRAM");
            menuUtils.showMenu();
            option = menuUtils.getOption();

            switch (option) {
                case 1:
                    System.out.println("Executing the 1");
                    break;
                case 2:
                    System.out.println("Executing the 2");
                    break;
                case 3:
                    System.out.println("Executing the 3");
                    break;
                case 4:
                    System.out.println("Executing the 4");
                    break;
                case 5:
                    System.out.println("Executing the 5");
                    break;
                case 6:
                    System.out.println("Executing the 6");
                    break;
                case 7:
                    System.out.println("Executing the 7");
                    break;
                case 8:
                    System.out.println("Executing the 8");
                    break;
                case 9:
                    System.out.println("Executing the 9");
                    break;
            }
        } while (option != 9);
    }
}
