import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupFirstCharacterString {

    public static void main(String[] args) {
        // Input List
        List<String> nameList = Arrays.asList("Eric", "Joseph", "Marry", "Elizabeth", "John", "Johnny");

       Map<Character,List<String>> map =  nameList.stream().collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println(map);


    }
}
