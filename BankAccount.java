import java.util.Scanner;

public class BankAccount {
    Scanner scan=new Scanner(System.in);
    public String owner;
    public double balance;
    public void printbank(){
        System.out.println(" hello "+owner);
        System.out.println(" the balance is: "+balance);
    }


    public double deposit(){
        System.out.println("enter sum of money u want to add: ");
        int addmoney =scan.nextInt();
        if (addmoney >0){
            balance+= addmoney;

        }
        return balance;
    }
    public double Withdraw(){
        System.out.println("enter sum of money u want to take: ");
        int takemoney=scan.nextInt();
        if (balance>0&&balance>takemoney){
            balance-=takemoney;
        }else {
            System.out.println("u dont have enough money");
        }
        return balance;
    }

}
