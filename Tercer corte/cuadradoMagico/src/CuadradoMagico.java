/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PedroAndres
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 

public class CuadradoMagico {
    
    int [][]valor = new int[8][8];
    
    public static void main(String[] args)  throws IOException{
    // Path names are relative to project directory (Eclipse Quirk )
    FileReader fr = new FileReader("./src/Mercury.txt");
    BufferedReader br = new BufferedReader(fr);
    String line = null;

    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }

    br.close();
    }    
}
