package HIROSI;

public class Herkules extends SuperHeroes {

		public Herkules(String name){
			super.setName(name);
			super.setElem(Elemental.WIND);
		}
	@Override
	public void superPower() {
		System.out.println("Witaj, jestem bykiem " + super.getName()+ " " + super.getElem().getElemental());

	}
	

}
