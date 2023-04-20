package PO;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String args[]){
        int a[] = {10, 100, 1, 5, 3, 94, 542, 542, 1000, 1000};
        System.out.println("el segundo numero mas grande es: " + findSecondnumber(a));
    }

    public static int findSecondnumber(int array[]){
        Arrays.sort(array);
        int max = array.length - 1;
        int aux = 0;
        for (int i = 0; i < max; i++){
            if(array[max] != array[max - i]){
                aux  = array[max - i];
                break;
            }
        }
        return aux;
    }

}
