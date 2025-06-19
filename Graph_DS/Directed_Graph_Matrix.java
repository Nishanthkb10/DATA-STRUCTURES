import java.util.*;

class Graph{
    int[][] matrix;
    Graph(int v){
        matrix=new int[v][v];
    }
    public void addedge(int u,int v){
       matrix[u][v]=1;
    }
    public void display(){
        for(int i=0;i<matrix.length;i++){
            System.out.print("The vertices connected to "+i+": ");
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Directed_Graph_Matrix
{
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addedge(0,1);
		g.addedge(0,4);
		g.addedge(1,2);
		g.addedge(4,1);
		g.addedge(2,3);
		g.addedge(4,3);
		g.addedge(3,1);
		g.display();
	}
}
