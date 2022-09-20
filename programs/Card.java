class Card
{
	static String type;
	static double height;
	static double width;
	static long price;
	static String[] colors;
	
	
	static void printDetails()
	{
		
		
		System.out.println(type);
        System.out.println(height);
        System.out.println(width);
        System.out.println(price);
        if(colors!=null)
		{
			System.out.println("array is pointing to memory");
			for(int index=0;index<colors.length;index++)
			{
				String ref=colors[index];
				System.out.println(ref+"position : "+index);
			}
		}else
		{
			System.out.println("Array is not pointing to memory");
		}
	}
}