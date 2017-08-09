/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author horiguchikentarou
 */
public class challenge15_2 {
    
    public static void main(String[] args) {
        
        Date now = new Date();
        
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.print(sdf.format(now));
    }
}
