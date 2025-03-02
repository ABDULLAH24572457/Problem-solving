public class DuplicateEncoder {
    static String encode(String word){


        word= word.toLowerCase();
        StringBuilder sb= new StringBuilder(word);
        char[] charsArray=word.toCharArray();
        int i = 0;
        for (char ch : charsArray) {
            int count=0;
            for (char c : charsArray){
                if (c == ch){
                    count++;
                }
            }
            if (count>1){
                sb.setCharAt(i,')');
            }else {
                sb.setCharAt(i,'(');
            }
            i++;
        }

        return sb.toString();
    }
}
