// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int len = 0;
		int wid = 0;
		int len1 = -1, len2 = -1, f1 = 0;
		int wid1 = -1, wid2 = -1, f2 = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == ch && f1 == 0) {
					len1 = i;
					len2 = i;
					f1 = 1;
					break;
				}
				else if (grid[i][j] == ch && f1 == 1) {
					len2 = i;
					break;
				}
			}
		}
		if (len1 != -1) {
			len = len2 - len1 +1;
		}
		for (int i = 0; i < grid[0].length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[j][i] == ch && f2 == 0) {
					wid1 = i;
					wid2 = i;
					f2 = 1;
					break;
				}
				else if (grid[j][i] == ch && f2 == 1) {
					wid2 = i;
					break;
				}
			}
		}
		if (wid1 != -1) {
			wid = wid2 - wid1 +1;
		}
		return len*wid; // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		
		return 0; // YOUR CODE HERE
	}
	
	public static void main(String[] args) {
		char[][] a = new char[][] {
			{'c', 'a', 'x'},
        	{'b', ' ', 'b'},
        	{' ', ' ', 'a'}
		};
		CharGrid bang = new CharGrid(a);
		System.out.println(bang.charArea('a'));
	}
}
