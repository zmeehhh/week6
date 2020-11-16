public class Player {
	// private String name;
	// private double totalCashInHand;
	// private Token selectedToken;

	protected String name;
	protected double totalCashInHand;
	protected Token selectedToken;

	public Player () { }

	public Player (String name, Token selectedToken) {
		this.name = name;
		this.selectedToken = selectedToken;
		totalCashInHand = 500_000;
	}

	public void updateCashInHand(double totalCashInHand) {
		this.totalCashInHand += totalCashInHand;
	}

	public String toString() {
		return "Player name " + name
		+ " with token " + selectedToken
		+ " has RM" + totalCashInHand;
	}
}