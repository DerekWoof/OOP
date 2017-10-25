package pl.sdacademy.main;

import pl.sdacademy.oop.Leaf;

public class OOP {

	public static void main(String[] args) {
			System.out.println("Witam");
			
			int a =5;
			Integer b = 7;
			Integer c = 8;
			Leaf lisc = new Leaf();
			System.out.println(b.toString()+ c.toString());
			
			Leaf liscPierwszy = new Leaf();
			liscPierwszy.color = "zielony";
			liscPierwszy.size = "ma³y";
			liscPierwszy.fly();
					
			Leaf liscDrugi = new Leaf();
			liscDrugi.color = "brazowy";
			liscDrugi.size = "duzy";
			liscDrugi.rot();
			
			Leaf liscTrzeci = new Leaf();
			
			
	}

}
