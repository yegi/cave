package cave;

public class _11MultiDimensionalArrays {
	public static void main(String[] args) {
		int values[] = { 1, 2, 3, 4, 5 };
		System.out.println(values[0]);

		System.out.println("In Java Multi-dimensional aray is just array of arrays");
		int[][] grid = { 
				{ 1, 2, 3 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4 }
		
		};

		grid[0][2] = 9;
		System.out.println(grid[0][1]+" "+grid[0][2]);
		
		
		
		String[][] words = new String[2][4];
		
		System.out.println(words[0][0]);
		System.out.println("Below I use only one dimension from 2-dimensional array new String[2][4] - this is reference");
		System.out.println(words[0]);
		
		for (int i = 0; i< 2; i++) { //i < grid.length, and better to call row instad of i
			for (int j = 0; j<4; j++) { //j < grid[row].length and better call it column or col instead of col
				String fword = "fuck";
				words[i][j] = fword;
				System.out.print(words[i][j]+ "\t");
			}
			System.out.println("!");
		}
		
		
		String[][] text = new String[2][];
		System.out.println("Below I use only one dimension from 2-dimensional array new String[2][0]");
		System.out.println(text[0]);
		
		
		
	}

}
