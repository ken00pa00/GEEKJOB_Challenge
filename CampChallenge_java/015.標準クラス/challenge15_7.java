/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author horiguchikentarou
 */
public class challenge15_7 {
    
    public static void main(String[] args) {
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        
        String word2=word.replace("I", "い");
        String word3=word2.replace("U", "う");
        
        System.out.print(word3);
    }
}
