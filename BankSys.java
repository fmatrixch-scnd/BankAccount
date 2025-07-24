package BankAccount;
import java.util.*;

public class BankSys {
    public static int demo_balance = 102424;
    public static int dep_time = 0,wit_time = 0;
    public static int intro(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("LoremBank\nWelcome back, user_demo\nChoose the following options:\n(1 DEPOSIT\n(2 WITHDRAW\n(3 CHECK BALANCE\n(4 EXIT");
            String option = sc.nextLine();
            switch (option){
                case "1":
                    deposit();
                    return 0;
                case "2":
                    withdraw();
                    return 0;
                case "3":
                    check();
                    return 0;
                case "4":
                    System.out.println("Goodbye, user_demo");
                    return 0;
                default:
                    System.out.println("Option invalid. Please try again.");
            }
            return 0;
        }
    }
    public static void deposit(){
        if (dep_time >= 2){
            System.out.println("We're sorry but you have exceeded our deposit limit. Please try again next time.");
            intro();
        }else{
            System.out.println("Current balance: " + demo_balance);
            Scanner dep = new Scanner(System.in);
            System.out.println("Maximum deposit: $5,000");
            System.out.println("Enter your deposit: ");
            int new_dep = dep.nextInt();
            if (new_dep >= 0 && new_dep <= 5000){
                System.out.println("You've deposited: " + new_dep + " dollars");
                System.out.println(demo_balance + " dollars left");
                demo_balance += new_dep;
            }else{
                System.out.println("Unsupported operation");
            }
            dep_time++;
            intro();
        }
    }
    public static void withdraw(){
        if (wit_time >= 2){
            System.out.println("We're sorry but you have exceeded our withdrawal limit. Please try again next time.");
            intro();
        }else{
            System.out.println("Current balance: " + demo_balance);
            Scanner wes = new Scanner(System.in);
            System.out.println("Maximum withdrawal: $5,000");
            System.out.println("Enter your withdrawal: ");
            int new_wes = wes.nextInt();
            if (new_wes >= 0 && new_wes <= 5000){
                System.out.println("You've withdrew: " + new_wes + " dollars");
                System.out.println(demo_balance + " dollars left");
                demo_balance -= new_wes;
            }else{
                System.out.println("Unsupported operation");
            }
            wit_time++;
            intro();
        }
    }
    public static void check() {
        System.out.println("Current balance: $" + demo_balance);
        intro();
    }
}
