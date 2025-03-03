public class Order {
    public static String order(String words) {

        String[] wordArray=words.split(" ");
        String[] orderArray=new String[wordArray.length];
        for (String word:wordArray) {
            for (char c: word.toCharArray()){
                if (Character.isDigit(c)){
                    int x =c-'0';
                    orderArray[x -1]=word;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word:orderArray){
            if (word !=null){
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }
}