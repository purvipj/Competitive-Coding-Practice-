class Solution {
    public int pascalTriangleI(int r, int c) {
        int[][] Pascal=new int[r][r];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                if(j==0) Pascal[i][j]=1;
                else if(j==i) Pascal[i][j]=1;
                else Pascal[i][j]=Pascal[i-1][j-1]+Pascal[i-1][j];
                System.out.print(Pascal[i][j]);
                
            }
            System.out.println();
        }
        return Pascal[r-1][c-1];
    }
}
public class PascalTriangle{
    public static void main(String[] args){
        Solution sol=new Solution();
        int ans=sol.pascalTriangleI(4,2);
        System.out.print(ans);
    }
}