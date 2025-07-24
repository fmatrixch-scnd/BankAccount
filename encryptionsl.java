package BankAccount;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class encryptionsl {
    String original;
    public encryptionsl(String original){
        this.original = original;
    }
    public byte[] encrypted(){
        byte[] result = new byte[0];
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-384");
            result = md.digest(original.getBytes(StandardCharsets.UTF_8));
        }catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return result;
    }
}
