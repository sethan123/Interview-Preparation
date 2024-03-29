//STEP 1: START
//STEP 2: INITIALIZE arr[] ={1, 2, 3, 4, 5 }.
//STEP 3: SET n =3
//STEP 4: PRINT "Original Array"
//STEP 5: REPEAT STEP 6 UNTIL i<arr.length
//            //for(i=0; i<arr.length; i++)
//STEP 6: PRINT arr[i]
//STEP 7: REPEAT STEP 8 to STEP 12 UNTIL i<n
//            // for(i=0; i<n; i++ )
//STEP 8: DEFINE j, last.
//STEP 9: last = arr[arr.length-1]
//STEP 10: REPEAT STEP 11 UNTIL j>0
//            //for(j= arr.length-1;j>0; j--)
//STEP 11: arr[j]= arr[j-1]
//STEP 12: arr[0]= last
//STEP 13: PRINT "Array after right rotation"
//STEP 14: REPEAT STEP 15 UNTIL i<arr.length
//            //for(i=0; i<arr.length; i++)
//STEP 15: PRINT arr[i]
//STEP 16: END

package Arrays_Interview;

public class Rotate_the_Array {

	public static void main(String[] args) {
		  int [] arr = new int [] {1, 2, 3, 4, 5};     
	        //n determine the number of times an array should be rotated.    
	        int n = 3;    
	           
	        //Displays original array    
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }      
	            
	        //Rotate the given array by n times toward right    
	        for(int i = 0; i < n; i++){    
	            int j, last;    
	            //Stores the last element of array    
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1];    
	            }    
	            //Last element of array will be added to the start of array.    
	            arr[0] = last;    
	        }    
	        
	        System.out.println();    
	            
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
		
			
}
