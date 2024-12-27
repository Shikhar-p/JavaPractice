/**
 * Input : I am$&## Groot
 * Output : toorG ma$&## I
 *
 * **/

public class ReverseCharacterNotSpecialChar {
    public static void main(String[] args) {

        String s = "I am$&## Groot";

        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        char temp;

        while(left < right){
            if(Character.isAlphabetic(ch[left]) &&
                    Character.isAlphabetic(ch[right])){
                temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }else if(!Character.isAlphabetic(ch[left])){
                left++;
            }else{
                right--;
            }
        }

        // Convert the char array back to a string
        String reversedString = new String(ch);

        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);

    }
}
