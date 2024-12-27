import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "Ashishp";
        String s2 = "shikhar";
        //output -pkr

      //String str = Stream.concat(s1.chars()).mapToObj(c->(char)c, s2.chars().mapToObj(c->(char)c))
             // .collect(Collectors.groupingBy(c->))
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        for (char c : s2.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                sb.append(entry.getKey());
            }
        }

        System.out.println("Character are : " + sb.toString());
    }

}
