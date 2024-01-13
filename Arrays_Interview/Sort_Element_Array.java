package Arrays_Interview;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Element_Array {
    public static void main(String[] args) {
        int arr[]={12,11,10,17,19,1888,1666};
        Integer arr1[]={12,11,10,17,19,1888,1666};
        Sort_Element_Array se =new Sort_Element_Array();
         se.sort(arr);
         se.reverse(arr1);

    }

    void sort(int arr[]){
        Arrays.sort(arr);
        Arrays.parallelSort(arr);
        for(int num:arr)
        {
            System.out.print(" " + num +"");
        }
        System.out.println();
    }
void reverse(Integer[] arr1){
    Arrays.sort(arr1, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr1));

}
}
