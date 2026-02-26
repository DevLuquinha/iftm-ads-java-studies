package classroom;

public class Account {
    int number;
    String name;
    double balance;

    void deposit(double value){
        this.balance += value;
    }

    void withdraw(double value){
        this.balance -= value;
    }

    void showStatement(){
        System.out.printf("\nThe current %s balance: %f", this.name, this.balance);
    }
}
