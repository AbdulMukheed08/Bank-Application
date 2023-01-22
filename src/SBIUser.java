import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private double balance;
    private String name;
    private String accountNo;
    private String password;
    static double rateOfInterest = 6.6;

    public SBIUser(double balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance += amount;
        return "Your account is credited with Rs."+amount+" and your updated balance is : "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Are bhikari itna paisa nhi tere pas";
            }
            else{
                balance -= amount;
                return "Wah beta bahut paisa hai tere pas";
            }
        }
        else{
            return "Wrong password\nSahi password dal!!!";
        }
    }

    @Override
    public double calculateInterest(int years) {
        double interest = (balance*rateOfInterest*years)/100;
        return interest;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
