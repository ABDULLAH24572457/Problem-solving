public class RomanNumerals {

    public static String toRoman(int n) {
        StringBuilder romanNumeral = new StringBuilder();
        while (n>=1000){
            romanNumeral.append("M");
            n-=1000;
        }
        while (n>=900){
            romanNumeral.append("CM");
            n-=900;
        }
        while (n>=500){
            romanNumeral.append("D");
            n-=500;
        }
        while (n>=400){
            romanNumeral.append("CD");
            n-=400;
        }
        while (n>=100){
            romanNumeral.append("C");
            n-=100;
        }
        while (n>=90){
            romanNumeral.append("XC");
            n-=90;
        }
        while (n>=50){
            romanNumeral.append("L");
            n-=50;
        }
        while (n>=40){
            romanNumeral.append("XL");
            n-=40;
        }
        while (n>=10){
            romanNumeral.append("X");
            n-=10;
        }
        while (n==9){
            romanNumeral.append("IX");
            n-=9;
        }
        while (n>=5){
            romanNumeral.append("V");
            n-=5;
        }
        while (n>=4){
            romanNumeral.append("IV");
            n-=4;
        }
        while (n>=1){
            romanNumeral.append("I");
            n-=1;
        }
        return romanNumeral.toString();
        }

    public static int fromRoman(String romanNumeral) {
        int n=0;
        char[] litter=romanNumeral.toCharArray();
        for (int i = 0; i < litter.length; i++) {
            int j=i+1;
            if (!(j < litter.length)){j=i;}
            if (litter[i]=='M'){n+=1000;}
            else if (litter[i]=='C'&&litter[j]=='M'){n+=900;i+=1;}
            else if (litter[i]=='D'){n+=500;}
            else if (litter[i]=='C'&&litter[j]=='D'){n+=400;i+=1;}
            else if (litter[i]=='C'){n+=100;}
            else if (litter[i]=='X'&&litter[j]=='C'){n+=90;i+=1;}
            else if (litter[i]=='L'){n+=50;}
            else if (litter[i]=='X'&&litter[j]=='L'){n+=40;i+=1;}
            else if (litter[i]=='X'){n+=10;}
            else if (litter[i]=='I'&&litter[j]=='X'){n+=9;i+=1;}
            else if (litter[i]=='V'){n+=5;}
            else if (litter[i]=='I'&&litter[j]=='V'){n+=4;i+=1;}
            else if (litter[i]=='I'){n+=1;}
        }
        return n;
    }
}