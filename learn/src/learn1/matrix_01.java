package learn1;
import java.util.*;
public class matrix_01 {
	//BFS ���������������
	    public int[][] updateMatrix(int[][] matrix) {
	        Queue<int[]> queue=new LinkedList<>();
	       int m=matrix.length;
	        int n=matrix[0].length;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(matrix[i][j]==0){
	                    queue.add(new int[]{i,j});
	                }
	                else{
	                    matrix[i][j]=m+n;
	                }
	                
	                
	            }
	        }
	        
	        while(!queue.isEmpty()){
	            int[] tmp=queue.poll();//ȡ����Ԫ��;
	            int[][] my_vector=new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
	            for(int i=0;i<4;i++){
	                //�Զ���Ԫ��λ��Ϊ��ʼ�㣬����
	               int r=tmp[0]+my_vector[i][0];
	               int c=tmp[1]+my_vector[i][1];
	                if(r>=0&&r<m&&c>=0&&c<n&&matrix[r][c]>matrix[tmp[0]][tmp[1]]+1) {
	                	queue.add(new int[]{r,c});
	                    matrix[r][c]=matrix[tmp[0]][tmp[1]]+1;
	                }
	                    
	            }
	        }
	       return matrix;        
	    }
	    public static void main(String[] args) {
	    	matrix_01 tmp=new matrix_01();
	    	int [][] test=new int[][] {{0,0,0},{0,1,0},{1,1,1}};
	    	int [][] ma=tmp.updateMatrix(test);
	    	int m=test.length;
	    	int n=test[0].length;
	    	for(int i=0;i<m;i++) {
	    		System.out.println();
	    		for(int j=0;j<n;j++) {
	    			System.out.printf("%d  ",ma[i][j]);
	    		}
	    	}
	    }
}
