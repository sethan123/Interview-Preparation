package Arrays_Interview;

public class Missing_Number_in_Array
{
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4};
        int arr2[]={1,2,3,4,5};
        int a = 0;

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
              a=arr1[i]-arr2[i];

            }

        }
        System.out.println(a);

    }
}
