import java.util.Scanner;
public class hillCipher {
    public static String encrypt(String text , int[][] key){
        StringBuilder  ciphertext = new StringBuilder();
        for(int i=0; i<text.length(); i+=2){
            int p1 = text.charAt(i)-'A';
            int p2 = text.charAt(i+1)-'A';
            int c1= (key[0][0]*p1 + key[0][1]*p2)%26;
            int c2 = (key[1][0]*p1 + key[1][1]*p2)%26;
            ciphertext.append( (char)( c1+'A'));
            ciphertext.append( (char)( c2+'A'));
        }
        return ciphertext.toString();
    }
        
    public static String decrypt(String text , int[][] key){
        StringBuilder  plaintext = new StringBuilder();
        
        int det = key[0][0]*key[1][1] - key[0][1]*key[1][0];
        det = (det%26 + 26)%26; 
        int detInv = -1;
        for(int i=0; i<26; i++){
            if((det*i)%26 == 1){
                detInv = i;
                break;
            }
        }
        if(detInv == -1){
            System.out.println("Key is not invertible, decryption not possible.");
            return ""; 
        }
        int[][] invKey = {
            {(key[1][1]*detInv)%26, (-key[0][1]*detInv + 26)%26},
            {(-key[1][0]*detInv + 26)%26, (key[0][0]*detInv)%26}
        };
        for(int i=0; i<text.length(); i+=2){
            int c1 = text.charAt(i)-'A';
            int c2 = text.charAt(i+1)-'A';
            int p1= (invKey[0][0]*c1 + invKey[0][1]*c2)%26;
            int p2 = (invKey[1][0]*c1 + invKey[1][1]*c2)%26;
            plaintext.append( (char)( p1+'A'));
            plaintext.append( (char)( p2+'A'));
        }
        return plaintext.toString();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to encrypt: ");
        String input = scanner.nextLine().toUpperCase();
        int[][] key = {{3,3},{2,5}};
        if(input.length()%2 !=0){
            input = input +"X";
        }
        String encryptedText= encrypt(input , key);
        System.out.println("Encrypted Text: " + encryptedText);
        String decryptedText = decrypt(encryptedText , key);
        System.out.println("Decrypted Text: " + decryptedText);
        scanner.close();
    }
}