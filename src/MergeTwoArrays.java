import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] sarray = {"ab", "c", "d"};
        Integer[] intarray = {1, 2, 3, 4, 5};

        // Merge the two arrays using Streams
        List<Object> mergedList = new ArrayList<>();

        int maxLength = Math.max(sarray.length, intarray.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < intarray.length) {
                mergedList.add(intarray[i]);
            }
            if (i < sarray.length) {
                mergedList.add(sarray[i]);
            }
        }

        // Output the merged list
        System.out.println(mergedList);
    }
}
