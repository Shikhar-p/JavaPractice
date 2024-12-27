import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestStreamCode {

    public static void main(String[] args) {

        //second highest number in integer array
        List<Integer> list = Arrays.asList(3,6,8,2,11,5);
        Integer secondHighestNum = list.stream().sorted((a,b)->b-a)
                .skip(1).findFirst().get();
        System.out.println("Second highest number :" + secondHighestNum);

        System.out.println("==========================");
        //find unique number in integer array
        List<Integer> list1 = Arrays.asList(1,2,2,3,4,5,5);
        List<Integer> uniqueNumber = list1.stream().distinct().toList();
        System.out.println("unique number :" + uniqueNumber);

        System.out.println("==========================");
        //find duplicate number in integer array
        List<Integer> list2 = Arrays.asList(1,2,2,3,4,5,5);
        List<Integer> duplicateNumber = list2.stream()
                        .collect(Collectors.groupingBy(i->i,Collectors.counting()))
                                .entrySet().stream()
                        .filter(entry -> entry.getValue() > 1)
                                .map(Map.Entry::getKey)
                                        .toList();
        System.out.println("duplicate number :" + duplicateNumber);

        System.out.println("==========================");
        //find longest length of string and unique in string array
        List<String> list3 = Arrays.asList("Delhi", "Pune", "Banglore", "Mumbai", "Delhi");
        String longestString = list3.stream().distinct().max(Comparator.comparingInt(String::length)).get();

        System.out.println("longest & unique string :" + longestString);

        System.out.println("==========================");
        //Print character count from the string.
        String s = "aabbbccddaaabbccceeff";
       List<String> charCountString = IntStream.range(0,s.length())
                .mapToObj(i->s.charAt(i))
                .collect(Collectors.groupingBy(c->c))
                .entrySet().stream()
                .map(entry->entry.getKey() + "" + entry.getValue().size())
                .toList();
       charCountString.forEach(System.out::print);

        System.out.println("==========================");
        //find unique character from string
        String sUnique = "Shikhar";
        // Get the unique characters from the string using Streams
        String uniqueChars = sUnique.chars()  // Convert string to IntStream of char values
                .mapToObj(c -> (char) c)  // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Group by character and count occurrences
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)  // Filter characters that appear only once
                .map(Map.Entry::getKey)  // Extract the unique characters
                .map(String::valueOf)  // Convert each character to a string
                .collect(Collectors.joining());  // Join the unique characters into a string

        // Print the result
        System.out.println("Unique characters: " + uniqueChars);

    }
}
