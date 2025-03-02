public class Solution {

    public int solution(int number) {
        int mulThree=0;
        int mulFive=0;
        int mulThreeFive=0;
        for (int i = 3; i < number; ) {
            mulThree= i+mulThree;
            i=i+3;
        }
        for (int i = 5; i < number; ) {
            mulFive= i+mulFive;
            i=i+5;
        }
        for (int i = 15; i < number;) {
            mulThreeFive=i+mulThreeFive;
            i=i+15;
        }
        return mulFive+mulThree-mulThreeFive;
    }
}
