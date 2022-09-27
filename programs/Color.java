class Color
{
	static String[] colors={null,null,null,null,null,null};
	static int position=0;
	
	static void save(String colorName)
	{
		System.out.println("Save: Start aythu");
		
		if(position>=6)
		{
			System.out.println("Array Is Exeeded");
			return;
		}
		
		if(colorName!=null&&colorName.length()>=3)
		{
			colors[position]=colorName;
			System.out.println("Entered color is: "+colorName+ " at the position : "+position);
			position++;
			
		}
		else
			System.err.println("colorName is not null or more than at least 3 charactors ");					
	}
	
	static void displayColors()
	{
		for(int i=0;i<colors.length;i++)
		{
			System.out.println("colors name is:"+colors[i]);
		}
	}
	
	static boolean find(String name)
	{
		System.out.println("Finding Color is : "+name);
		for(int i=0;i<colors.length;i++)
		{
			String ref=colors[i];	
		if(ref==name)
		{
		System.out.println("color is found : "+name);
		return true;
		}
		}
		return true;
	}
}