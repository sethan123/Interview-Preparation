package Arrays_Interview;

public class printArrayList {

//	public static void main(String[] args) {
//		
//		
//		String[] makeStrings= {"BMW","audi","swift","hundai","tata"};
//		
//		Print_Array(makeStrings);
//		
//		
//
//	}

	
	public static void main(String[] args) {
		
		String[] amake=ReturnArray();
		for(int i=0;i<amake.length-1;i++)
		{
			System.out.println(amake[i]);
		}
		
	}
	
	public static String[] ReturnArray() {
		String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};  
		  return aArray;
		}
	}
	
	

