class ColorRunner
{
	public static void main(String[] args)
	{
		System.out.println("main : naditha ede");
		
		Color.save("Pink");
		Color.save("perple");
		Color.save("Green ");
		Color.save("Yellow");
		Color.save("Black");
		Color.save("White");
		
		Color.displayColors();
		boolean found=Color.find("Green");
		System.out.println("Finding colores is "+found);
		
	}
	
	
}