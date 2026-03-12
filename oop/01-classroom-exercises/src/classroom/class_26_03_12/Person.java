package classroom.class_26_03_12;

public class Person {
    String name;
    int age;
    double weight;

    @Override
    public String toString() {
        return "The " + name +
                " is " + age +
                " years old and " + weight + "kg";
    }
}
