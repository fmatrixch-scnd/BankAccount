package BankAccount;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.math.*;

public class encryption extends crypto {
    String original;
    public encryption(String original){
        this.original = original;
    }
    public byte[] encrypted(){
        byte[] result = new byte[0];
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            MessageDigest md2 = MessageDigest.getInstance("SHA-384");
            byte[] first_enc = md.digest(original.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1,first_enc);
            String hex = number.toString(16);
            if (hex.length() < 128){
                hex+=0;
            }
            hex += second_salt;
            byte[] second_enc = md.digest(hex.getBytes(StandardCharsets.UTF_8));
            hex = null;
            BigInteger num2 = new BigInteger(1,second_enc);
            String hex2 = num2.toString(16);
            if (hex2.length() < 128){
                hex2+=0;
            }
            result = md2.digest(hex2.getBytes(StandardCharsets.UTF_8));
            hex2 = null;
        }catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return result;
    }
}
