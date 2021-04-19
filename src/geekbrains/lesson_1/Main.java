package geekbrains.lesson_1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ;
    }


    public static void task1() {
        int[] array = {1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        System.out.println(Arrays.toString(array));
        }

    public static void task2() {
        int[] array2 = new int[100];
        for(int i=0; i<array2.length; i++) {
            array2[i] = i+1;
            System.out.println(Arrays.toString(array2));
            }

        }

    public static void task3() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i<array3.length; i++) {
            if(array3[i] <6) {
               array3 [i] = array3[i] * 2;

             }
            System.out.println(Arrays.toString(array3));
        }
    }
    public static void task4() {

        int[][] array4 = new int[4][4];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (int) Math.round(Math.random()*4);
                if(i==j){
                   System.out.println(array4[i][j] + " ");
                }

//Предположу, что для вычисления второй диагонали необходимо что-то вроде 3й переменной (k--), но как реализовать не особо понимаю
            }
        }

    }
  /*  public static void task5(int len , int initialValue) {
        int[] array5 = new int[len];
        for(int i=0; i < array5.length; i++) {
           array5[len] = initialValue;
        }
        System.out.println(Arrays.toString(array5));
    } */
                                                               // не понял(

}