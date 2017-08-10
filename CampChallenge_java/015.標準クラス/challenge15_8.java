/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.camp.servlet;
import java.io.*;

/**
 *
 * @author horiguchikentarou
 */
public class challenge15_8 {
    
    public static void main(String[] args)throws IOException {
        
        File fp = new File("test.txt");
        
        FileWriter fw = new FileWriter(fp);
        
        fw.write("堀口賢太郎です。");
        
        fw.close();
    }
}
