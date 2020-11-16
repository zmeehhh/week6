public class Token {
    private String name;
	private int currentPosition = 0;
	private String color;

	public Token() {}

	public Token(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public int updatePosition(int steps) {
	    currentPosition += steps;
	    return currentPosition;
	}

	public String toString() {
	    return color + " "
	        + name
	        + " is at position " + currentPosition;
	}
}