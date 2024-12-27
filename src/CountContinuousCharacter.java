import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountContinuousCharacter {

    public static void main(String[] args) {
        String s = "aabbbccddaaabbccceeff";

        // Use Stream to find continuous characters and their frequencies
        String result = IntStream.range(0, s.length())
                .mapToObj(i -> s.charAt(i))  // Convert each character from string to stream of characters
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            StringBuilder sb = new StringBuilder();
                            int n = list.size();
                            for (int i = 0; i < n; i++) {
                                char currentChar = list.get(i);
                                int count = 1;

                                // Count consecutive characters
                                while (i + 1 < n && list.get(i + 1) == currentChar) {
                                    count++;
                                    i++;
                                }

                                // Append the character and its count to the result
                                sb.append(currentChar).append(count);
                            }
                            return sb.toString();
                        }
                ));

        // Print the result
        System.out.println(result);
    }
}
