import java.util.Scanner;

public class tester {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        Dog d=new Dog();
        d.name="toy";
        d.age=9;
        d.printdetail();
        System.out.println("---------------------");

        Book b=new Book();
        b.title="superman";
        b.pages=100;
        b.printbook();
        System.out.println("---------------------");

        circle c=new circle();
        c.radius=5.0;
        c.printradius();
        System.out.println("---------------------");

        BankAccount ba=new BankAccount();
        ba.owner="linoy ";
        System.out.println(" hello"+owner);
        ba.balance=100;
        ba.printbank();
        ba.deposit(ba.balance);
        ba.Withdraw(ba.balance);
        ba.printbank();
        System.out.println("---------------------");

        ClassRoom v=new ClassRoom();
        v.students=new String[3];
        for (int i = 0; i < v.students.length; i++) {
            System.out.print(" the name of student "+(i+1)+" is :");
            v.students[i]=scan.nextLine();

        }
       v.printnames();

        System.out.println("---------------------");


        Light l=new Light();
        l.TurnON();
        l.print();
        l.TurnOff();
        l.print();


        Counter counter=new Counter();
        counter.count=10;
        counter.printCounter();
        counter.increas();
        counter.decreas();









    }
}
