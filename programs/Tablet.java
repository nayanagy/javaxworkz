class Tablet
{
	
	static double weight;
	static long price;
	static double mass;
	static double cv;
	static String[] ingredients;
	static String[] type;
	static boolean preservative;
	static int dosage;
	static double quantity;
	static boolean safetyForChildren;
	static String shape;
	static char vitamins;
	static String[] name;
	static String toxic;
	static int manufactureYear;
	static int expiryYear;
	static boolean chewable;
	
	static void printDetails()
	{
		System.out.println(weight);
		System.out.println(price);
		System.out.println(mass);
		System.out.println(cv);
		if(ingredients!=null)
		{
			System.out.println("array is pointing to memory");
			for(int i=0;i<ingredients.length;i++)
			{
				String ref=ingredients[i];
				System.out.println(ref);
			}
		}else
		{
			System.out.println("array is  not pointing to memory");
		}
		
		if(type!=null)
		{
			System.out.println("array is pointing to memory");
			for(int j=0;j<type.length;j++)
			{
				String ref1=type[j];
				System.out.println(ref1);
			}
		}else
		{
			System.out.println("array is  not pointing to memory");
		}
		System.out.println(preservative);
		System.out.println(dosage);
		System.out.println(quantity);
		System.out.println(safetyForChildren);
		System.out.println(shape);
		System.out.println(vitamins);
		
		if(name!=null)
		{
			System.out.println("array is pointing to memory");
			for(int k=0;k<name.length;k++)
			{
				String ref2=name[k];
				System.out.println(ref2);
			}
		}else
		{
			System.out.println("array is  not pointing to memory");
		}
		
		System.out.println(toxic);
		System.out.println(manufactureYear);
		System.out.println(expiryYear);
		System.out.println(chewable);
	}
	
	
}