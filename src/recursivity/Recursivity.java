/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivity;

import java.io.File;

/**
 *
 * @author EAN
 */
public class Recursivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int sumWithFingers(int a, int b) {
        if (b == 0) {
            return a;
        }
        return 1 + sumWithFingers(a, b - 1);
    }

    public int restWithFingers(int a, int b) {
        if (b == 0) {
            return a;
        }
        return -1 + restWithFingers(a, b - 1);
    }

    public int multiplyWithFingers(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplyWithFingers(a, b - 1);
    }

    public int factorial(int a) {
        if (a <= 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static long Fibonacci(long position) {
        if (position == 1 || position == 2) {
            return 1;
        }
        return Fibonacci(position - 1) + Fibonacci(position - 2);
    }

    public static int[] testArray = {7, 2, 4, 3, 20, 10, 50, 9 ,1 ,13};

    private int search(int[] array, int num, int min, int max) {
        int half = (max - min) / 2;
        if (array[min + half] == num) {
            return min + half;
        }

        if (num > array[min + half]) {
            return search(array, num, min + half, max);
        }
        return search(array, num, min, min + half);
    }
    
    public int search(int[]array, int num){
        return search(array, num, 0, array.length);
    }
    
    public int findTheGreat(int[] array, int min, int max) {
        int half = (max - min) / 2;
        
        if (array[half-min]>array[max-half]) {
            return findTheGreat(array,half-min,max-half);
        }
        
        else {
            return findTheGreat(array, max-half, half-min);
        }    
    }
    
    public int arraySummary(int position, int[]array){
        if(position==0){
            return array[position];
        }
       
       return arraySummary(array[position],array)+arraySummary(array[position-1],array);
        
        
    }
    
   public void arrayinverted(String array[],int min, int max){
       String temp; 
       if(min<max){
            temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }
       arrayinverted(array, min+1, max-1);
   }
    
    public static String[] palindromo={"r","e","c","o","n","o","c","e","r"};
    public boolean espalindromo(String[] palindromo1,int min,int max){
      if(min<max){
        //  return palindromo1[min]==palindromo[max] && palindromo1[palindromo1,min+1,max-1]==palindromo1[palindromo1,min+1,max-1];
      }
      return true;
    }
  
    
    
   
    
    public long fileSize(File f){
        long size=f.length();
        if (f.isDirectory()) {
            for (String sonName : f.list()) {
                File son=new File(f,sonName);
                size+=fileSize(son);
            }
        }
        return size;
    }
}
