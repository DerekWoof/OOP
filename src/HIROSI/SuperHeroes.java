package HIROSI;

public abstract class SuperHeroes {
	private String name;
	
	private Elemental elem;
	
	
	public Elemental getElem() {
		return elem;
	}

	public void setElem(Elemental elem) {
		this.elem = elem;
	}

	public abstract void superPower();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
