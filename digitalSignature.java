import java.security.*;
import java.util.*;
import javax.crypto.*;

public class digitalSignature {
    public static void main(String[] args) throws Exception {
       String str = "hello";
       
       KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
       kpg.initialize(512);
       KeyPair kp = kpg.generateKeyPair();
       PublicKey pu = kp.getPublic();
       PrivateKey pr = kp.getPrivate();
       
       Signature sign = Signature.getInstance("SHA256withRSA");
       sign.initSign(pr);
       sign.update(str.getBytes());
       byte[] digitalSignature = sign.sign();

       System.out.println("Sign = " +digitalSignature);
       //str= "hell";
       Signature verify = Signature.getInstance("SHA256withRSA");
       verify.initVerify(pu);
       verify.update(str.getBytes());
       boolean ver = verify.verify(digitalSignature);

       System.out.println("Verification = " +ver);
    }
}
