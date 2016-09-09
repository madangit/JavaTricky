
	//Question: suppose you have a 5 * 5 matrix 
	//we need to print the output as a zigzag read of the matrix
	//meaning if the matrix is 
	//  1  2  3  4  5
	//  6  7  8  9 10
	// 11 12 13 14 15
	// 16 17 18 19 20
	// 21 22 23 24 25
	//
	// The output should be 1 2 3 4 5 10 15 14 13 12 11 16 21 22 23 24 25 


public class MatrixTraverse {
	
	public static void main(String[] args) {
		
		boolean forward = false;
		boolean skipline = false;
		int colcount = 5;
		int rowcount = 5;
		int filler = 0;
		int temp[]= new int[colcount];
		
				
		for (int currow=0; currow < rowcount; currow++) {
			
				if ((forward == true) && (skipline ==false)) {
					forward = false;
				} else if ((forward == false) && (skipline ==false)) {
					forward = true;
				}

			for (int curcol=0; curcol < colcount; curcol++) {
				filler ++;
				if (skipline == false) {
					if (forward == true) {
						System.out.print(filler+" ");
					} else {
						temp[curcol] = filler;
					}
				}
				if ((skipline == true) && (forward == true) && (curcol == colcount -1) ) {
					System.out.println(filler+"");
				} else if ((skipline == true) && (forward == false) && (curcol == 0) ) {
					System.out.println(filler+"");
				}
			}

			if ((forward == false) && (skipline == false)) {
				for (int i = temp.length-1; i >=0 ; i--) {
					System.out.print(temp[i]+ " ");
				}
			}
			
			if (skipline == false) {
				skipline = true;
			} else {
				skipline = false;
			}		
			

		}
	}
}
