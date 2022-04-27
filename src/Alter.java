
public class Alter {
	public static void main(String []args) {

		/*x,y,z ?? wie alt
			anzahlkinder = 3
		    des Alters = x*y*z=36;*/

		for (int x = 1; x <=3 ; x++) {

			for (int y = 1; y <= 3; y++) {

				for (int z = 1; z <=3 ; z++) {
					
					
					
					int hn = x+y+z;	

					int erg = 36;

					erg = x*y*z;
					System.out.print(erg);
					System.out.println(hn);

					if (erg >= 36) { 

						break;
						
						
						
					}		
					
				
				
				}
			}

		}

	}

}







