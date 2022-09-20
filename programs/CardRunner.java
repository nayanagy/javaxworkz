class CardRunner{
	public static void main(String[] cards)
	{
		System.out.println("main :Nadiitha ede");
		
		Card.printDetails();
		
		Card.type="debit card";
		Card.height=4.3d;
		Card.width=3;
        Card.price=1000;
        String[] color={"blue","pink"};
		Card.colors=color;
		
		Card.printDetails();
		
		System.out.println("main :Mugitu");
		
	}
}