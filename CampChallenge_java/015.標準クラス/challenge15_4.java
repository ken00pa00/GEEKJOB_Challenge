/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author horiguchikentarou
 */
public class challenge15_4 {
    
    public static void main( String[] args ){    
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dateTo = null;
    Date dateFrom = null;
    
    try {
        dateFrom = sdf.parse("2015/01/01 00:00:00");
        dateTo = sdf.parse("2015/12/31 23:59:59");
    } catch (ParseException e) {}
    
    long dateTimeTo = dateTo.getTime();
    long dateTimeFrom = dateFrom.getTime();
    
    long dayDiff = ( dateTimeTo - dateTimeFrom  );
    
    System.out.println( "日数(FROM) : " + sdf.format(dateFrom) );
    System.out.println( "日数(TO) : "   + sdf.format(dateTo) );
    System.out.println( "差分ミリ秒 : "  + dayDiff );
}
}
