/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author horiguchikentarou
 */
abstract public class Human {
    
    abstract public Integer open();
    abstract public void setCard(Integer ArrayList[]);
    abstract public boolean checkSum();
    ArrayList<Integer> myCards = new ArrayList<>();
}

abstract class Dealer extends Human {
    
    int jqk = 10;
    
    ArrayList<Integer> cards = new ArrayList<>();
    {
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 10; j++){
            cards.add(j);
        }
        for(int k = 0; k < 4; k++){
            cards.add(jqk);
        }
    }
    }
    
    
    public ArrayList deal(){
    
    ArrayList<Integer> hand = new ArrayList<>();
    
    Random rnd = new Random();
    
    for(int i = 0; i < 2; i++){
        int index = rnd.nextInt(cards.size());
        hand.add(cards.get(index));
    }
    return hand;
    }
    
    
    public ArrayList hit(){
    
    ArrayList<Integer> hit = new ArrayList<>();
    
    Random rnd = new Random();
    
    int index = rnd.nextInt(cards.size());
    hit.add(cards.get(index));
    return hit;
    }
    
    
    @Override
    public Integer open(){
        int total = 0;
        for(int i = 0; i < myCards.size(); i++){
            total = total + myCards.get(i); 
        }
        return total;
    }
    
    
    public void setCard(ArrayList<Integer> setCard){
        for(int i = 0; i < setCard.size(); i++){
            myCards.add(setCard.get(i));
        }
    }
    
    
    @Override
    public boolean checkSum(){
    
    int total = open();
    
    if(total < 11){
        for(int i =0; i < myCards.size(); i++){
            if(myCards.get(i) == 1){
                myCards.set(i, 11);
            }
        } 
    }
    return total < 17;
    }
    
    
    @Override
    public void setCard(Integer[] ArrayList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}    
    
    
abstract class User extends Human {
    
    @Override
    public Integer open(){
        int total = 0;
        for(int i = 0; i < myCards.size(); i++){
            total = total + myCards.get(i); 
        }
        return total;
    }
    
    
    public void setCard(ArrayList<Integer> setCard){
        for(int i = 0; i < setCard.size(); i++){
            myCards.add(setCard.get(i));
        }
    }
    
    
    @Override
    public boolean checkSum(){
    
    int total = open();
    
    if(total < 11){
        for(int i =0; i < myCards.size(); i++){
            if(myCards.get(i) == 1){
                myCards.set(i, 11);
            }
        }
    }
    return total < 17;
    }
    
    @Override
    public void setCard(Integer[] ArrayList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
