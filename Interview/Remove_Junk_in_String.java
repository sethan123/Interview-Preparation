package Interview;

public class Remove_Junk_in_String   {
    public static void main(String[] args) {
        String str = "askdjkdkaj878a7d8#$%#^&@&@&**@&";
        String str1="sda sdjfhjkf sdjkfhjskdf s  sdjfh skjfh sdkfjhsd f";
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str);
        str1=str1.replaceAll("\\s", "");
        System.out.println(str1);

        int totalcount =str1.length();
        int aftercount=str1.replaceAll("s","").length();
        int count = totalcount-aftercount;
        System.out.println("Number of count = " +" " +   count);



    }
}
