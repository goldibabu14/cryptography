import java.util.*;
import javax.crypto.*;
public class des {
    public static void main(String args[]) throws Exception{
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String plaintext = sc.nextLine();

        KeyGenerator key = KeyGenerator.getInstance("DES");
        SecretKey sk = key.generateKey();

        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

        cipher.init(Cipher.ENCRYPT_MODE , sk);
        byte[] encText = cipher.doFinal(plaintext.getBytes());
        String encbase64 = Base64.getEncoder().encodeToString(encText);
        System.out.println("Encrypted Text: " + encbase64);

        cipher.init(Cipher.DECRYPT_MODE , sk);
        byte[] decText = cipher.doFinal(encText);
        String decbase64 = new String (decText);
        System.out.println("Decrypted Text: " + decbase64);
    }
}