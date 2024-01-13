package String_Interview;

public class CountPunctuation {

	public static void main(String[] args) {
		String arr = "The best of both worlds!@#";

		//String arr[]=s.split(" ");
		int count =0;
		
		for(int i=0;i<arr.length();i++)
		{
			if(arr.charAt(i) =='!' || arr.charAt(i) =='@' || arr.charAt(i)=='#')
				count++;
		}
		System.out.println(count);
		
	}
}
