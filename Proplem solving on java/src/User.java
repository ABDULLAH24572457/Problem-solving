public class User {
    int rank=-8;
    int progress=0;
    public int incProgress(int rank){
        if (rank < -8 || rank == 0 || rank > 8) {
            throw new IllegalArgumentException("Invalid challenge rank.");
        }
        int challengeRank= (rank<0)? rank+9:rank+8;
        int rankNow= (this.rank<0)? this.rank+9:this.rank+8;
        int d =challengeRank-rankNow;
        if (d==0){
            progress+=3;
        } else if (d==-1) {
            progress+=1;
        } else if (d>0) {
            progress+=d*d*10;
        }
        while (progress>=100 && this.rank<8){
            progress-=100;
            if (this.rank==-1){
                this.rank=1;
            }else {
                this.rank++;
            }
        }
        if(this.rank==8){
            progress=0;
        }
        return this.rank;
    }
}
