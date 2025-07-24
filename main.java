package BankAccount;

public class main {
    public static void main(String[] args){
        Interface login = new Interface();
        boolean check = login.pass();
        if (check){
            BankSys bs = new BankSys();
            int e = bs.intro();
        }else{
            System.out.println("Due to your multiple failure on typing password, We're sorry that you can't enter our system this time.");
        }
    }
}
