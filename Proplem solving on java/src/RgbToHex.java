public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        String valueR=hex(r);
        String valueG=hex(g);
        String valueB=hex(b);
        return valueR+valueG+valueB;
    }
    public static String hex(int color){
        int division=color/16;
        int remainder=color%16;
        String a="A";String b ="B";String c= "C";String d="D";String e="E";String f= "F";
        String remainder2 ;
        String division2 ;
        if (color>255){
            division2=f;
            remainder2=f;
        }else {

            if (division>=10){
                switch (division){
                    case 10 -> division2 =a;
                    case 11 -> division2 =b;
                    case 12 -> division2 =c;
                    case 13 -> division2 =d;
                    case 14 -> division2 =e;
                    default -> division2 =f;
                }
            } else if (division<0) {
                division2="0";
            } else {
                division2 = String.valueOf(division);
            }
            if (remainder>=10){
                switch (remainder){
                    case 10 -> remainder2 =a;
                    case 11 -> remainder2 =b;
                    case 12 -> remainder2 =c;
                    case 13 -> remainder2 =d;
                    case 14 -> remainder2 =e;
                    default -> remainder2 =f;
                }
            }else if (remainder<0) {
                remainder2="0";
            }else {
                remainder2 = String.valueOf(remainder);
            }
        }
        return division2+remainder2;
    }
}