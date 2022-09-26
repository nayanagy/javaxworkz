class FoodItemsDataOperatorRunner
{
	public static void main(String[] food)
	{
		System.out.println("main : naditha ede");
		FoodItemsDataOperator.save("Dosa ");
		FoodItemsDataOperator.save("Parota");
		FoodItemsDataOperator.save("Puliyogare");
		FoodItemsDataOperator.save("Palav");
		FoodItemsDataOperator.save("Idli");
		
		
		FoodItemsDataOperator.displayDetails();		
		System.out.println("main : mugitu");

	}
}
