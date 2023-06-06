package Interview;
//use string buffer or string builder(use append)
public class Reverse_String {
    public static void main(String[] args) {
//        String str="chethan rush";
//        StringBuffer sb =new StringBuffer(String.valueOf(str));
//        StringBuffer rev =sb.reverse();
//        System.out.println("String buffer " + ""+ rev);


        // buffer string using StringBuffer class.

        StringBuffer a = new StringBuffer("I like java very much.");

// use reverse() method to reverse string

        System.out.println(a.reverse());

    }

}

