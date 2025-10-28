import java.util.*;
public class substitutionCipher {
    public static void main(String[] args) throws Exception{
        String plaintext = "abcdefghijklmnopqrstuvwxyz";
        String ciphertext = "qwertyuiopasdfghjklzxcvbnm";
        String message = "hello";
        StringBuilder encrypted = new StringBuilder();
        StringBuilder decrypted = new StringBuilder();
        for (char c : message.toLowerCase().toCharArray()){
            int idx = plaintext.indexOf(c);
            if (idx != -1) {
                encrypted.append(ciphertext.charAt(idx));
            } else {
                encrypted.append(c);
            }
        }
        System.out.println("Encrypted message: " + encrypted.toString());

        for(char c : encrypted.toString().toCharArray()){
            int idx = ciphertext.indexOf(c);
            if (idx != -1) {
                decrypted.append(plaintext.charAt(idx));
            } else {
                decrypted.append(c);
            }
        }
        System.out.println("Decrypted message :" +decrypted);
    }
}
