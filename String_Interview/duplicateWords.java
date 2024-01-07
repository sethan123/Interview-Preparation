//Q. Write a function to find out duplicate words in a given string?
//
//**Approach:**
//
//1. Define a string.
//1. Convert the string into lowercase to make the comparison insensitive.
//1. Split the string into words.
//1. Two loops will be used to find duplicate words. Outer loop will select a word and Initialize variable count to 1. Inner loop will compare the word selected by outer loop with rest of the words.
//1. If a match found, then increment the count by 1 and set the duplicates of word to '0' to avoid counting it again.
//1. After the inner loop, if count of a word is greater than 1 which signifies that the word has duplicates in the string.
//
//```java


package String_Interview;

public class duplicateWords {

	public static void main(String[] args) {
		
		String str = "Big black bug bit a big black dog on his big black nose";
		int count;
		
		String lowercase= str.toLowerCase();
		String word[] = lowercase.split(" ");
		
		System.out.println("Find the Duplicate");
		
		for(int i=0;i<word.length;i++)
		{
			count = 1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			
			if(count >1 && word[i]!="0")
				System.out.println(word[i]);
			
		}
		
		
		

	}

}
