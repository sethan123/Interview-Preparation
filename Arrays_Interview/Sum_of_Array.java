package Arrays_Interview;

public class Sum_of_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,455,};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            System.out.println(sum);
        }
    }
}
