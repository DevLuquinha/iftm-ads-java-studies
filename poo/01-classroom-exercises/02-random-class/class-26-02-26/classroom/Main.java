package classroom;

public class Main {
    static void main(String[] args) {
        Account nubank = new Account();
        nubank.name = "Nubank";
        nubank.number = 1234;

        Account inter = new Account();
        inter.name = "Inter";
        inter.number = 5678;

        // 1. Add balance for bank accounts
        nubank.deposit(100);
        nubank.withdraw(30);

        inter.deposit(300);
        inter.withdraw(20);

        // 2. Get the bank statements
        System.out.printf("BANK STATEMENTS");
        nubank.showStatement();
        inter.showStatement();
    }
}
