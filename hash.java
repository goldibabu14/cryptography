import java.util.Scanner;
public class hash{
    public static void main (String args[]){
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = sx.nextLine();
        byte result = 0 ;
        byte [] hash = input.getBytes();
        for (byte b : hash){
            result ^= b;
        }
        System.out.println("Hash value in decimal : " + (result&0xFF));
        System.out.println("Hash value in hexadecimal : 0X"  + Integer.toHexString(result & 0xFF).toUpperCase());
    }
}