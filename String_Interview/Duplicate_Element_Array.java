	package String_Interview;

import java.util.HashSet;

public class Duplicate_Element_Array {
    public static void main(String[] args) {
      //  int a[] = {1, 2, 3, 45, 66, 66};
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if ((a[i] == a[j]) && (i != j)) {
//                    System.out.println("Duplicate Element : " + a[j]);
//                }
//            }
//        }
//    }
        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };


        HashSet<String> store = new HashSet<>();
        for (String name : names)
        {
            if (store.add(name) == false)
            {
                System.out.println("found a duplicate element in array : " + name);
            }
        }



    }
}
