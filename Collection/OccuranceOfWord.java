package Collection;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
    public static void main(String[] args) {
       // String arr[] = {"I", "am", "JavaDeveloper","I",""};
        String str ="I am Java developer I am proud of it";
        String arr[] = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String word:arr){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        for(Map.Entry<String,Integer>entry : map.entrySet()){
            System.out.print(entry.getKey() +" :"+entry.getValue() +" ");
        }

    }
}