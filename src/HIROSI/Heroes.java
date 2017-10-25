package HIROSI;

public class Heroes {

	public static void main(String[] args) {
			
		SuperHeroes[] all ={new Herkules("Herkules"),new  Hulk("Hulk"),new IronMan ("IronMan"),new Sasha ("Sasha")};
		
		for(SuperHeroes p : all){
			p.superPower();
		}
			
		}

	

}
