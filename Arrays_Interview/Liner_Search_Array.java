package Arrays_Interview;

public class Liner_Search_Array {
    public static void main(String[] args) {
        int a[] = {1,2,3,45,66};
        int Search_x=66;
        boolean flag =false;
        for(int i=0;i<a.length;i++)
            if(Search_x==a[i])
            {
                System.out.println("Element is present at index "
                        + i);
                flag=true;
                break;

        } if(flag=false){
                System.out.println("Element is not present in array");
            }


    }
}
