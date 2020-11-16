public class MonopolyGame {
	public static void main(String arg[]) {
	    Token wheelbarrow = new Token("wheelbarrow", "blue");
	    wheelbarrow.updatePosition(5);
	    System.out.println(wheelbarrow);
	    Player p1 = new Player("Zikry", wheelbarrow);
	    System.out.println(p1);

	    Token hat = new Token("hat", "red");
	    PropertyOwner po1 = new PropertyOwner("Zikry", hat);
	    po1.buyProperty("Mydin Sdn. Bhd");
	    System.out.println(po1);

	    //Token hat = new Token();
	    Token car = new Token();
	}
}