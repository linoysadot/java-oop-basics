import java.util.Scanner;

public class BankAccount {
    Scanner scan=new Scanner(System.in);
    public String owner;
    public double balance;
    public void printbank(){
    
        System.out.println(" the balance is: "+balance);
        
    }


    public void deposit( double addmoney){
        System.out.println("enter sum of money u want to add: ");
         addmoney =scan.nextDouble();
        if (addmoney >0){
            balance+= addmoney;
              System.out.println(" the new balance is "+balance);

        }

    }
    public void Withdraw(double takemoney){
        System.out.println("enter sum of money u want to take: ");
         takemoney=scan.nextDouble();
        if (balance>0&&balance>takemoney){
            balance-=takemoney;
            System.out.println(" the new balance is "+balance);

        }else {
            System.out.println("u dont have enough money");
        }
      
    }

}
