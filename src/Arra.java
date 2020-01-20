
public class Arra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int asd[][] = {{1,2,3},{4,0,6},{7,8,9}};
		int min = asd[0][0];
		for (int i = 0; i <3; i++) {
	
			for (int j = 0; j <3; j++) {
				if(min>asd[i][j])
				{
				min = asd[i][j];
				}
			//	System.out.println(asd[i][j]);
				
			}
		}
		System.out.println(min);
		
	}

}
