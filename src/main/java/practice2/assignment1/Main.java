package practice2.assignment1;

public class Main {
    public static void main(String[] args) {
        BankAccount client = new BankAccount("0", 10);


//        try {
//            client.withdraw(12);
//            client.deposit(-10);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        client.deposit(20);
        client.withdraw(5);

        System.out.println(client);
    }
}
