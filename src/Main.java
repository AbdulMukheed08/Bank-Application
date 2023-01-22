import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,accountBalance and password to create an account");

        String name = sc.nextLine();
        double balance = sc.nextDouble();
        String password = sc.next();

        //create user
        SBIUser user = new SBIUser(balance,"Abdul Mukheed","MSuaknhieyead");

        //addMoney
        System.out.println(user.addMoney(10000));

        //withdraw
        System.out.println(user.withdrawMoney(3000,"Ab"));
        System.out.println(user.withdrawMoney(3000,"MSuaknhieyead"));
        System.out.println(user.checkBalance());
        System.out.println(user.calculateInterest(5));
    }
}