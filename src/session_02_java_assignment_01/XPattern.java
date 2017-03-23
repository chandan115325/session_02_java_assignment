package session_02_java_assignment_01;

public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=0,col=0,size=5;
		
		for ( row = 0; row < size; row++) {
	        for (col = 0; col < size; col++) {
	            if (row == col || row + col == size - 1) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}

}
