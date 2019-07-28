package model;

public enum BloodType {
	A("A型"), B("B型"), O("O型"), AB("AB型");

	private String displayWord;

	private BloodType(String displayWord) {
		this.displayWord = displayWord;
	}

	public String getDisplayWord() {
		return displayWord;
	}

}
