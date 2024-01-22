/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication50;

/**
 *
 * @author Aslam
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arr={1,3,5,6};
        Solution s=new Solution();
        int solarr=s.minimumPushes("Mohammed Aslam");
        System.out.println(solarr);
        System.out.println();
    }
    
}
class Solution {
    public int minimumPushes(String word) {
        String keypad[]={"0", "1", "anb", "edf", "yghc", "ijk", "oml", "pqr", "ustz", "vwx"};
        char wordsbreak[]=word.toCharArray();
        int sum=0;
        for(int i=0; i<wordsbreak.length; i++){
            sum+=returnvalue(wordsbreak[i]);
        }
        
        return sum;
        
    }   
    int returnvalue(char letter){
        int value=0;
        switch(letter){
            case 'a': value=1;
                break;
            case 'b': value=3;
                break;
            case 'c': value=4;
                break;
            case 'd': value=2;
                break;
            case 'e': value=1;
                break;
            case 'f': value=3;
                break;
            case 'g': value=2;
                break;
            case 'h': value=3;
                break;
            case 'i': value=1;
                break;
            case 'j': value=2;
                break;
            case 'k': value=3;
                break;
            case 'l': value=3;
                break;
            case 'm': value=2;
                break;
            case 'n': value=2;
                break;
            case 'o': value=1;
                break;
            case 'p': value=1;
                break;
            case 'q': value=2;
                break;
            case 'r': value=3;
                break;
            case 's': value=2;
                break;
            case 't': value=3;
                break;
            case 'u': value=1;
                break;
            case 'v': value=1;
                break;
            case 'w': value=1;
                break;
            case 'x': value=3;
                break;
            case 'y': value=2;
                break;
            case 'z': value=4;
                break;
            default: value=0;               
        }
        return value;
    }
}
  

