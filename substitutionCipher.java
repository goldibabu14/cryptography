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







// import java.util.*;

// public class substitutionCipher {
//     public static void main(String[] args) {
//         String plaintext = "abcdefghijklmnopqrstuvwxyz";
//         String ciphertext = "qwertyuiopasdfghjklzxcvbnm";
        
//         String message = "HelloWorld";  
        
//         StringBuilder encrypted = new StringBuilder();
//         StringBuilder decrypted = new StringBuilder();

//         
//         for (char c : message.toCharArray()) {
//             if (Character.isLetter(c)) {
//                 boolean isUpper = Character.isUpperCase(c);
//                 char lower = Character.toLowerCase(c);
//                 int idx = plaintext.indexOf(lower);
//                 char enc = ciphertext.charAt(idx);
//                 encrypted.append(isUpper ? Character.toUpperCase(enc) : enc);
//             } else {
//                 encrypted.append(c);  
//             }
//         }

//         System.out.println("Encrypted message: " + encrypted.toString());

//        
//         for (char c : encrypted.toString().toCharArray()) {
//             if (Character.isLetter(c)) {
//                 boolean isUpper = Character.isUpperCase(c);
//                 char lower = Character.toLowerCase(c);
//                 int idx = ciphertext.indexOf(lower);
//                 char dec = plaintext.charAt(idx);
//                 decrypted.append(isUpper ? Character.toUpperCase(dec) : dec);
//             } else {
//                 decrypted.append(c);
//             }
//         }

//         System.out.println("Decrypted message: " + decrypted.toString());
//     }
// }
