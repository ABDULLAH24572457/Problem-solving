public class NumberFun {
    public static long findNextSquare(long sq) {
        long result;
        double sqrt=Math.sqrt(sq);
        int x = (int)sqrt;
        if (sqrt == x){
            x++;
            result= (long) x *x;
        }else {
            result=-1;
        }
        return result;
    }
}
