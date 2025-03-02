public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder finalWord= new StringBuilder();
        int firstLetter=0;
        str=str+" ";
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isSpaceChar(new StringBuilder(str).charAt(i)) & !Character.isLetter(new StringBuilder(str).charAt(i))) {
                finalWord.append(str.charAt(i));
                str=str.trim();
                continue;
            }
            if (str.charAt(i)==' '){
                String word = str.substring(firstLetter,i+1);
                char firstChar=word.charAt(0);
                finalWord.append(word.substring(1).trim()).append(firstChar).append("ay ");
             firstLetter=i+1;
            }
        }


        return finalWord.toString().trim();
    }
}