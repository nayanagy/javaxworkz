class MovieDataOperator
{
	static String[] names={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		System.out.println("save : nadita ede");
		names[position]=name;
		position++;
		System.out.println("Movie name is "+name+"at position :"+position);
		System.out.println("save : mugitu");
		
	}
	static void displayDetails()
	{
		System.out.println("displayDetails start");
		for(int i=0;i<names.length;i++)   
		{
			System.out.println("element is "+names[i]);
		}
	}
}