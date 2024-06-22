import java.util.*;

public class Main
{
    
    public static void floydWarshall(int[][] matrix, int V, boolean flag){
        
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(i==j) matrix[i][j]=0;
                
                else if (matrix[i][j]==-1) matrix[i][j]=(int)(1e9);
            }
        }
        
        for(int k=0;k<V;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    matrix[i][j]=Math.min(matrix[i][j], matrix[i][k]+matrix[k][j]);
                }
            }
            
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(i==j && matrix[i][j]<0) flag=false;
            }
        }
        
    }
    
	public static void main(String[] args) {
		int V = 4;
        int[][] matrix = new int[V][V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                matrix[i][j] = -1;
            }
        }

        matrix[0][1] = 2;
        matrix[1][0] = 1;
        matrix[1][2] = 3;
        matrix[3][0] = 3;
        matrix[3][1] = 5;
        matrix[3][2] = 4;
        
        boolean flag=true;
        
        floydWarshall(matrix,V, flag);
        
        if(flag){
        
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if(matrix[i][j]!=(int)(1e9)) System.out.print(matrix[i][j] + " ");
                    else System.out.print(-1 + " ");
                }
                System.out.println("");
            }
            
        }
        
        else System.out.print("There exist a cycle");
	}
}
