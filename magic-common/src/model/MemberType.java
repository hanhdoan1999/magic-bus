package model;

public enum MemberType {
	K("仮会員"), S("正会員");
	private String displayWord;

	private MemberType(String displayWord) {
		this.displayWord = displayWord;
	}

	public String getDisplayWord() {
		return displayWord;
	}

}
