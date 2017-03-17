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

    public static int[] testArray = {2, 3, 5, 10, 11, 15, 18, 29};

    public int search(int[] array, int num, int min, int max) {
        int half = (max - min) / 2;
        if (array[min + half] == num) {
            return min + half;
        }

        if (num > array[min + half]) {
            return search(array, num, min + half, max);
        }
        return search(array, num, min, min + half);
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
