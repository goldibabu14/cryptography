import java.security.*;
import java.util.Base64;
import javax.crypto.*;

public class rsa {
    public static void main(String[] args) throws Exception {
       String str = "hello";
       
       KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
       kpg.initialize(512);
       KeyPair kp = kpg.generateKeyPair();
       PublicKey pu = kp.getPublic();
       PrivateKey pr = kp.getPrivate();
       
       Cipher cipher = Cipher.getInstance("RSA");
       cipher.init(Cipher.ENCRYPT_MODE , pu);
       byte[] encBytes = cipher.doFinal(str.getBytes());
       String encBase64 = Base64.getEncoder().encodeToString(encBytes);
       System.out.println("Encrypted Text =" +encBase64);
       
       cipher.init(Cipher.DECRYPT_MODE , pr);
       byte[] dec = cipher.doFinal(encBytes);
       System.out.println("Decrytped = " +new String(dec));
    }
}
