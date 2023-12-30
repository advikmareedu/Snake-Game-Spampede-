package com.gradescope.spampede;

enum CellType {
	WALL("*"), OPEN(" "), SPAM("X"), HEAD("H"), BODY("B");

	private final String displayChar;

	private CellType(String inputChar) {
		this.displayChar = inputChar;
	}

	/** Returns a String representing the CellType */
	public String getDisplayChar() {
		return this.displayChar;
	}

}
