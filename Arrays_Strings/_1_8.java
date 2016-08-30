import java.util.*;

public class _1_8 {
	public static void main(String [] args){
		int[][] NxM = new int[][] {
			{1,2,3,4,0},
			{1,2,2,3,4},
			{1,1,1,1,1},
			{9,5,4,2,4}
		};
		zeroRows(NxM);
		for(int[] row: NxM){
			for(int i: row){
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static void zeroRows(int[][] NxM){
		HashMap<Integer,ArrayList<Integer>> rowCol = new HashMap<Integer,ArrayList<Integer>>();
		for(int i = 0; i < NxM.length; i++){
			ArrayList<Integer> currRow = new ArrayList<Integer>();
			for(int j = 0; j < NxM[i].length; j++){
				if(NxM[i][j] == 0){
					currRow.add(j);
				}
			}
			rowCol.put(i,currRow);
		}

		for(int i: rowCol.keySet()){
			for(int j: rowCol.get(i)){
				for(int col = 0; col < NxM[i].length; col++){
					NxM[i][col] = 0;
				}
				for(int row = 0; row < NxM.length; row++){
					NxM[row][j] = 0;
				}
			}	
		}
	}
}
