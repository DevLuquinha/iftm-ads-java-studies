package classroom.class_26_03_05.ex01;

public class Person {
    String name;
    int age;
    double salary;

    void showPersonInfo(){
        System.out.printf(
                "The %s is %d years old and earns R$%.2f",
                name,
                age,
                salary);
    }
}
