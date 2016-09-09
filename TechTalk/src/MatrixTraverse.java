
public class MatrixTraverse {

	public static void main(String[] args) {
		boolean forward = false;
		boolean skipline = false;
		int colcount = 5;
		int rowcount = 5;
		int filler = 0;
		int temp[]= new int[colcount];
		
		for (int currow=0; currow < rowcount; currow++) {
			
			if ( (currow & 1) == 0 ) {
				if (forward == true) {
					forward = false;
				} else {
					forward = true;
				}
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
				if ((skipline == true) && (forward == false) && (curcol == colcount -1) ) {
					System.out.println(filler+"");
				} else if ((skipline == true) && (forward == false) && (curcol == 0) ) {
					System.out.println(filler+"");
					forward = true;
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
