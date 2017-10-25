package HIROSI;

public class Sasha extends SuperHeroes {
	public Sasha(String name){
		super.setName(name);
		super.setElem(Elemental.WATER);
	}

	@Override
	public void superPower() {
		System.out.println("Jo tu nie rzigo³ " + super.getName() + " " + super.getElem().getElemental());

	}

}
