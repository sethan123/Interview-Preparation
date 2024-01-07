package String_Interview;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int a[] = {1,2,3,45,66,5,35};
//        boolean flag=false;
//
//        int x= 66;
//        int l=0;
//        int h=a.length-1;
//
//        while (l<=h){
//            int m =(l+h)/2;
//            if(a[m]==x)
//            {
//                System.out.println("Element found");
//                flag=true;
//                break;
//            }
//            if(a[m]<x){
//                l=m+1;
//            }
//            if(a[m]>x){
//                l=m-1;
//            }
//
//        }
//        if(flag=false)
//        {
//            System.out.println("Element not found");
//        }


            Arrays.sort(a);
        for(int num:a)
        {
            System.out.print(" " + num +"");
        }
        System.out.println();

       // System.out.println(a);
        System.out.println(" Location " + Arrays.binarySearch(a,2));



    }
}
