public class DnaStrand {
    public static String makeComplement(String dna){

        dna= dna.toUpperCase();
        StringBuilder sb = new StringBuilder(dna);
        if (! dna.isEmpty()){
            for (int i = 0; i < dna.length(); i++) {
                if (sb.charAt(i) == 'A'){
                    sb.setCharAt(i,'T');
                }else if (sb.charAt(i) == 'T'){
                    sb.setCharAt(i,'A');
                }else if (sb.charAt(i) == 'C'){
                    sb.setCharAt(i,'G');
                }else if (sb.charAt(i) == 'G'){
                    sb.setCharAt(i,'C');
                }
            }
            dna= sb.toString();
        }
        return dna;
    }
}
