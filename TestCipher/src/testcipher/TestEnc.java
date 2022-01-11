/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcipher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author Teacher
 */
public class TestEnc {

   
    public static void main(String[] args) throws FileNotFoundException, InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, IOException 
    { 
        FileInputStream in = new FileInputStream("Jerusalem.bmp");
        FileOutputStream out= new FileOutputStream("JerusalemE.bmp");
        String k= "12345678";
        DESKeySpec x= new DESKeySpec(k.getBytes());
        SecretKeyFactory y= SecretKeyFactory.getInstance("DES");
        SecretKey f = y.generateSecret(x);
        Cipher c= Cipher.getInstance("DES");
        c.init(Cipher.ENCRYPT_MODE, f);
        CipherOutputStream cout = new CipherOutputStream(out, c);
        while(true)
        {
            int b= in.read();
            if(b==-1) break;
            cout.write(b);
        }
        cout.close();
        in.close();
        
        
    }
    
}
