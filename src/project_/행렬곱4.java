package project_;

public class Çà·Ä°ö4 {

	public static void main(String[] args) {
		int [][] Arr1 = {{1, 0, 2}, {-1, 3, 1}};
		int [][] Arr2 = {{3,1}, {2,1}, {1,0}};
		int [][] Arr3 = new int[2][2];
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				
				Arr3[i][j] = 0;
				
				for(int k = 0; k<3; k++) {
					Arr3[i][j] = Arr3[i][j] + Arr1[i][k] * Arr2[k][j];
				}
			}
		}
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print(Arr3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
