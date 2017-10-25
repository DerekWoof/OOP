package HIROSI;

public enum Elemental {
	
	FIRE("Pali"),
	WATER("Gasi"),
	WIND("Wieje"),
	EARTH("Zasypuje");

	private String elemental;
	
	private Elemental(String elemental){
		this.elemental = elemental;
	}

	public String getElemental() {
		return elemental;
	}

	public void setElemental(String elemental) {
		this.elemental = elemental;
	}

}
