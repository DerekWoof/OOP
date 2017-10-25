package HIROSI;

public class IronMan extends SuperHeroes {
	
	public IronMan(String name){
		super.setName(name);
		super.setElem(Elemental.EARTH);
	}
	@Override
	public void superPower(){
		System.out.println("Witaj, ja latam " + super.getName() + " " + super.getElem().getElemental());
	}

}
