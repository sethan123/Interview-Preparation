package Interview;

public class Palidrome_String {
    public static void main(String[] args) {
        String str="chethan";
        StringBuffer sb =new StringBuffer(String.valueOf(str));
        StringBuffer rev =sb.reverse();
        String str1 = sb.toString();
        if(str.equals(str1)){
            System.out.println("pallidrome");
    }
        else {
        System.out.println("notapallidrome");
    }
    }
}
