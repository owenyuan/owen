package Class;

public class Shuzhu {

	public static void main(String[] args) {
		int sum = 0;
		int[][] array = new int[][]{{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		for(int i = 0; i<array.length; i++){
			for(int j= 0; j<array[i].length; j++){
				sum += array[i][j];
			}
		}
		System.out.println(sum);
	}
}
