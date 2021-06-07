package sorting;

import java.util.Arrays;

public class Main {
    public static int[] array;

    public static void bubbleSort(){
        boolean changed = true;
        for(int i = 1; i < array.length-1 && changed; i++){
            changed = false;
            for(int j = 0; j < array.length-i; j++){
                if(array[j] > array[j+1]){
                    changed = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                System.out.println(j);
                System.out.println(Arrays.toString(array));
            }
        }
    }
    public static void selectionSort(){
        for(int i = 0; i < array.length; i++){
            int min = array[i];
            for( int j = i+1; j < array.length; j++){
                if(array[j] < min){
                    int temp = array[j];
                    array[j] = min;
                    min = temp;
                }
            }
            array[i] = min;
        }
    }
    public static void insertionSort(){
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0 && array[j-1] > array[j]; j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }
    public static void main(String [] args){
        array = new int[] {7,3,9,2,5,1,6,4,8};
        System.out.println(Arrays.toString(array));

        long start = System.nanoTime();
        bubbleSort();
        long end = System.nanoTime();
        System.out.println("Insertion Sort terminated in "+(end-start)+" in nanoseconds");
        System.out.println(Arrays.toString(array));
    }
}
