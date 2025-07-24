package BankAccount;
import java.util.*;

public class Interface extends crypto {
    public encryptionsl es = new encryptionsl(crypted);
    public byte[] encoded_orig = es.encrypted();
    public static boolean judge(byte[] hash1,byte[] hash2){
        return Arrays.equals(hash1,hash2);
    }
    public static boolean pass() {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        do {
            System.out.print("Enter password: ");
            String pstr = sc.nextLine();
            if (!(pstr.isEmpty()) ) {
                encryption enc_pswd = new encryption((pstr + first_salt));
                Interface itf = new Interface();
                boolean res = judge(itf.encoded_orig, enc_pswd.encrypted());
                if (res) {
                    System.out.println("Logon successfully");
                    return true;
                } else {
                    System.out.println("Error. Please try again.");
                    x--;
                }
            }
        }while (x > 0);
        return false;
    }
    public static void main(String[] args){
        Interface inf = new Interface();
        System.out.println(inf.pass());
    }
}
