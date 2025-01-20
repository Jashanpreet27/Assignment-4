import java.sql.Array;

public class two {
    static void sprial(int n){
        int top=0,bottom=n-1,left=0,right=n-1;
        int a[][]=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                a[i][j]=0;
//            }
//        }
        int c=0;
        int dir=0;
        while(bottom>=top && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    a[top][i]=c;
                    c++;
                }
                top++;
                dir=1;
            }
            else if(dir==1){
                for(int i=top;i<=bottom;i++){
                   a[i][right]=c;
                   c++;
                }
                right--;
                dir=2;
            }
            else if(dir==2){
                for(int i=right;i>=left;i--){
                    a[bottom][i]=c;
                    c++;
                }
                bottom--;
                dir=3;

            }
            else if(dir==3){
                for(int i=bottom;i>=top;i--){
                    a[i][left]=c;
                    c++;
                }
                left++;
                dir=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                System.out.print("         "+a[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        sprial(8);
    }
}
