import java.util.*;
public class diffieHellman{
    public static void main (String args[]){
        int p = 23 , g=5;
        Random rand = new Random();
        int a = rand.nextInt(p-2)+1;
        int A= (int)(Math.pow(g,a)%p);

        int b= rand.nextInt(p-2)+1;
        int B = (int)(Math.pow(g,b)%p);

        System.out.println("Alice's pvt key :" +a);
        System.out.println("Bob's pvt key :" +b);

        System.out.println("Public values exchanged ");
        System.out.println("Alice sends :" +A);
        System.out.println("Bob sends :" +B);

        int secretAlice = (int )(Math.pow(B,a)%p);
        int secretBob = (int)(Math.pow(A,b)%p);
        
        System.out.println("Shared secrets : ");
        System.out.println("Alice sends :" +secretAlice);
        System.out.println("Bob sends :" +secretBob);

        if(secretAlice==secretBob){
            System.out.println("Shared secret key successfully");
        }
        else{
            System.out.println("SOMETHING WENT WRONG !");
        }
    }
}