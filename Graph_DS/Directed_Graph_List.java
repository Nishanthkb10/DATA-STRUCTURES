import java.util.*;

class Graph{
    ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
    Graph(int v){
        for(int i=0;i<v;i++){
            arr.add(new ArrayList<Integer>());
        }
    }
    public void addedge(int u,int v){
        arr.get(u).add(v);
    }
    public void display(){
        for(int i=0;i<arr.size();i++){
            System.out.print("The vertices connected to "+i+": ");
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
public class Directed_Graph_List
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
