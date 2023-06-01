package Interview;

public class Reverse_Number {
    public static void main(String[] args) {

        int a=1234455;

        int rev=0;

        while(a!=0)
        {
            rev=rev*10 + a%10;
            a=a/10;
        }
        System.out.println(rev);





//        StringBuffer sb =new StringBuffer(String.valueOf(a));
//        StringBuffer rev =sb.reverse();
//        System.out.println("String buffer " + ""+ rev);
//
//        StringBuilder sb1= new StringBuilder();
//        sb1.append(a);
//        StringBuilder rev1 =sb1.reverse();
//        System.out.println(rev1);

    }
}
