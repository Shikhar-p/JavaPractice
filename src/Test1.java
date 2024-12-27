public class Test1 {
    public static void main(String[] args) {
        String str = "aaabbbccaacbddd";

        if(str == null || str.length() == 0){
            return;
        }
        int count =0;
        char ch1 = str.charAt(0);
        for(int i=1; i <str.length(); i++){
            char ch2 = str.charAt(i);
            if(ch2 == ch1){
                count++;
            }else{
                count = 1;
            }
            ch1 = ch2;
           System.out.print( count + "" +ch1);
        }

    }

}
