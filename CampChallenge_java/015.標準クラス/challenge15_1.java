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
public class challenge15_1 {
    
    public static void main(String[] args) {
        
        Date now = new Date();
        
        SimpleDateFormat sdf =
            new SimpleDateFormat("2016年1月1日 0時0分0秒");
        System.out.print(sdf.format(now));
    }
}

