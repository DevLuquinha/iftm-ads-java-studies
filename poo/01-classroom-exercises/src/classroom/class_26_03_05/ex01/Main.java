package classroom.class_26_03_05.ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        // 1. Get name
        System.out.println("What's your name? ");
        person.name = scanner.nextLine();

        // 2. Get age
        System.out.println("How old are you?");
        person.age = Integer.parseInt(scanner.nextLine());

        // 3. Get salary
        System.out.println("How much do you earn?");
        person.salary = Double.parseDouble(scanner.nextLine());

        // 4. Show the person info
        person.showPersonInfo();
    }
}
