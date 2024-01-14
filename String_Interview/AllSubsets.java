package String_Interview;
//For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
public class AllSubsets {

	public static void main(String[] args) {
		
		
		String s ="FUN";
		int n = s.length();
		
		int temp =0;
		
		String arr[]= new String[n*(n+1)/2];
		
		
		for(int i=0;i<n;i++ )
		{
			for(int j=i;j<n;j++)
			{
				arr[temp]=s.substring(i, j+1);
				temp ++;
			}
		}

		
		System.out.println("print all subset");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

}
