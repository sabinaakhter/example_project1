package homelearnjavapackage;

public class homearray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] country= {"bangladesh","india","nepal","usa"};
		country[1]="uk";
		System.out.println(country.length);
		System.out.println(country[3]);
		for (int i=0; i<country.length; i++) {
			System.out.println(country[i]);
		}
		

	}

}
