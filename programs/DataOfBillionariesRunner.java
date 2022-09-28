class DataOfBillionariesRunner
{
	public static void main(String[] args)
	{
	
	DataOfBillionaries.save("Elon Musk");
	DataOfBillionaries.save("Bernard Arnault");
	DataOfBillionaries.save("Gautam Adani");
	DataOfBillionaries.save("Jeff Bezos");
	DataOfBillionaries.save("Bill Gates");
	DataOfBillionaries.save("Warren buffett");
	DataOfBillionaries.save("Larry Ellison");
	DataOfBillionaries.save("Mukesh Ambani");
	DataOfBillionaries.save("Larry Page");
	DataOfBillionaries.save("Sergey Brin");
	
	DataOfBillionaries.displayDetails();
	boolean found=DataOfBillionaries.find("Jeff Bezos");
	
	DataOfBillionaries.update("Warren buffett","Rathan Tata");
	DataOfBillionaries.displayDetails();
	
	DataOfBillionaries.update1(2,"Savitri Jindal");
	DataOfBillionaries.displayDetails();
	
	DataOfBillionaries.delete("Savitri Jindal");
	DataOfBillionaries.displayDetails();
	
	DataOfBillionaries.delete1(4);
	DataOfBillionaries.displayDetails();

	}
}