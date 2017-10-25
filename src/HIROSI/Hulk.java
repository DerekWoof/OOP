package HIROSI;

public class Hulk extends SuperHeroes {
	
	public Hulk(String name){
		super.setName(name);
		super.setElem(Elemental.FIRE);
	}
	@Override
	public void superPower() 
		{
			System.out.println("WItaj, jestem zielony " + super.getName() + " " + super.getElem().getElemental());
		}

	

}
