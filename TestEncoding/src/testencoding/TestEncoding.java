/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Teacher
 */
public class TestEncoding {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException 
    {
        FileInputStream in = new FileInputStream("Cs441.txt");
        InputStreamReader inn = new InputStreamReader(in,"UTF-8");
        BufferedReader bf= new BufferedReader(inn);
        
        FileOutputStream o= new FileOutputStream("test.txt");
        OutputStreamWriter ow= new OutputStreamWriter(o,"UTF-8");
        BufferedWriter bw = new BufferedWriter(ow);
        PrintWriter p= new PrintWriter(bw);
        
        int c=0;
        while(true)
        {
            String b= bf.readLine();
            
            if(b==null) break;
            System.out.println(b);
            ++c;
            p.println(b);
            
        }
        p.flush();
        //p.close();
        System.out.println(c);
    }
    
}
