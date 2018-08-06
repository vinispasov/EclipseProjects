package bfs_dfs;
import java.util.List;
import java.util.ArrayList;

public class GraphAdjacencyList {
	List<List<Integer>>vertices;
	
	public GraphAdjacencyList(int n){
		vertices=new ArrayList<>();
		
		for (int i = 1; i <=n; i++) {
			vertices.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int x,int y) {
		vertices.get(x).add(y);
		vertices.get(y).add(x);
	}

}
