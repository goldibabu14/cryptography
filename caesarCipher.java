import java.util.Scanner;
public class caesarCipher {
    static int shift = 3; 
    public static String encrypt(String text){
        String enc = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if( ch>='A'&& ch<='Z'){
                enc =  enc + (char)( ( (ch - 'A' + shift)%26 ) + 'A' );
            }
            else if( ch>='a'&& ch<='z'){
                enc =  enc + (char)( ( (ch - 'a' + shift)%26 ) + 'a' );
            }
            else{
                enc = enc + ch;
            }
    
        }
        System.out.println("Encrypted message: " + enc);
        return enc;
    }
    public static void decrypt(String text){
        String dec = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if( ch>='A'&& ch<='Z'){
                dec =  dec + (char)( ( (ch - 'A' - shift + 26)%26 ) + 'A' );
            }
            else if( ch>='a'&& ch<='z'){
                dec =  dec + (char)( ( (ch - 'a' - shift + 26)%26 ) + 'a' );
            }
            else{
                dec = dec + ch;
            }
        }
        System.out.println("Decrypted message: " + dec);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        
        String enc = encrypt(message);
        
        decrypt(enc);
        scanner.close();
    }
}
