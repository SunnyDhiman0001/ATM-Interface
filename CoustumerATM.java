import java.util.Scanner;

class Bank{
    private double Balance = 100000;
    private int pwd;
    double Money;

    public void Deposite(){
        System.out.println("Enter Your Password:  ");
        Scanner scanner = new Scanner(System.in);
        pwd = scanner.nextInt();
        if (pwd == 2005) {
            System.out.println("Enter the Amount to Deposite:");
            Money = scanner.nextInt();
            if (Money>0) {
                Balance = Balance + Money;
            System.out.println("Deposite Successfully...");
            System.out.println("Current Balance: "+ Balance);
            }else{
                System.out.println("No Money for Deposite.");
            }
        }
        else{
            System.out.println("incorrect Password, Please Try again.");
        }
    }
    public void Withdraw(){
        System.out.println("Enter Your Password:  ");
        Scanner scanner = new Scanner(System.in);
        pwd = scanner.nextInt();
        if (pwd == 2005) {
            System.out.println("Enter the Amount to Withdraw:");
            Money = scanner.nextInt();
            if (Money>0) {
                Balance = Balance - Money;
            System.out.println("Withdraw Successfully...");
            System.out.println("Current Balance: "+ Balance);
            }else{
                System.out.println("No Money for Deposite.");
            }
        }
        else{
            System.out.println("incorrect Password, Please Try again.");
        }
    }
    public void CheckBalance(){
        System.out.println("Enter Your Password:  ");
        Scanner scanner = new Scanner(System.in);
        pwd = scanner.nextInt();
        if (pwd == 2005) {
            System.out.println("Your Currently Balance: "+Balance);
        }
        else{
            System.out.println("incorrect Password, Please Try again.");
        }
    }
}
public class CoustumerATM {

    public static void main(String[] args) {

        Bank b = new Bank();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1. Deposite Money");
        System.out.println("2. Withraw Money");
        System.out.println("3. Check Balance");
        System.out.println("Enter Your Choice: ");

        int ch = scanner1.nextInt();

        switch (ch) {
            case 1:
                b.Deposite();
                break;
            case 2:
                b.Withdraw();
                break;
            case 3:
                b.CheckBalance();
                break;
            default:
            System.out.println("Invailed Choice, Please Try again...");
                break;
        }
        scanner1.close();
    }
}
