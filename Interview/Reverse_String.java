package Interview;
//use string buffer or string builder(use append)
public class Reverse_String {
    public static void main(String[] args) {
        String str="chethan";
        StringBuffer sb =new StringBuffer(String.valueOf(str));
        StringBuffer rev =sb.reverse();
        System.out.println("String buffer " + ""+ rev);
    }
}
