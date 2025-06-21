import java.util.*;
class Soln{
    ArrayList<ArrayList<Integer>>sol=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> nQueens(int n){
        int[][] chess = new int[n][n];
        findpath(chess,0,new ArrayList<Integer>());
        return sol;
    }
    
    public void findpath(int[][] chess,int r,ArrayList<Integer>ans){
        if(r==chess.length){
            sol.add(new ArrayList<>(ans));
            return;
        }
        for(int c=0;c<chess.length;c++){
            if(isValid(chess,r,c)){
                chess[r][c]=1;
                ans.add(c+1);
                findpath(chess,r+1,ans);
                chess[r][c]=0;
                ans.remove(ans.size()-1);
            }
        }
    }
    public boolean isValid(int[][]chess,int r,int c){
        for(int i=0;i<r;i++){
            if(chess[i][c]==1)return false;
        }
        for(int i=r-1,j=c-1; (i>=0 && j>=0); i--,j--){
            if(chess[i][j]==1)return false;
        }
        for(int i=r-1,j=c+1; (i>=0 && j<chess.length); i--,j++){
            if(chess[i][j]==1)return false;
        }
        return true;
    }
}
public class Backtracking_nQueens
{
	public static void main(String[] args) {
	    Soln s=new Soln();
	    ArrayList<ArrayList<Integer>> solun=s.nQueens(4);
	    for(ArrayList<Integer>sol:solun){
	        System.out.println(sol);
	}
}
}
