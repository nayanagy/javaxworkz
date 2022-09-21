class GroceryStoreRunner
{
	public static void main(String[] products)
	{
		System.out.println("main : nadita ede");
		
		
		GroceryStore.setName("GroceryStore");
		System.out.println(GroceryStore.getName());
		
		GroceryStore.setLocation("Shivamogga");
		System.out.println(GroceryStore.getLocation());
		
		GroceryStore.setWorkers(10);
		System.out.println(GroceryStore.getWorkers());
		
		GroceryStore.setCurrentBill(2000d);
		System.out.println(GroceryStore.getCurrentBill());
		
		GroceryStore.setOwner("Ram Chandra ");
		System.out.println(GroceryStore.getOwner());
		
		GroceryStore.setFacility("good");
		System.out.println(GroceryStore.getFacility());
		
		GroceryStore.setDiscountInPercent(20d);
		System.out.println(GroceryStore.getDiscountInPercent());
		
		GroceryStore.setNoOfBranch(1);
		System.out.println(GroceryStore.getNoOfBranch());
		
		GroceryStore.isOnlineShopping(true);
		System.out.println(GroceryStore.isOnlineShopping());
		
		GroceryStore.setNoOfFloors(4);
		System.out.println(GroceryStore.getNoOfFloors());
		
		GroceryStore.setTypeOfItems(5);
		System.out.println(GroceryStore.getTypeOfItems());
		
		GroceryStore.setsalaryOfWorkers(10000d);
		System.out.println(GroceryStore.getsalaryOfWorkers());
		
		GroceryStore.setNoOfBaskets(15);
		System.out.println(GroceryStore.getNoOfBaskets());
		
		GroceryStore.isOnlinePayment(true);
		System.out.println(GroceryStore.isOnlinePayment());
		
		
		
	}
		
}
	