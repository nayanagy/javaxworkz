class DataOfBillionaries
{
	static String[] billionaries={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	
	//save 
	static void save(String billionarie)
	{
		System.out.println("Svae :naditha ede");
		if(position>=10)
		{
			System.out.println("Array is exeed");
			return;
		}
		if(billionarie!=null && billionarie.length()>=4)
		{
			billionaries[position]=billionarie;
			System.out.println("Entered billionarie name is: "+billionarie+ " at the position : "+position);
			position++;
		}else{
			System.err.println("Billionarie name is not null or more than at least 4 charactors ");
		}
	}
	
	// displayDetails
	static void displayDetails()
	{
		for(int i=0;i<billionaries.length;i++)
		{
			System.out.println("billionaries name is:"+billionaries[i]);
		}
	}
	
	// find elements in an array
	static boolean find(String billionarie)
	{
		System.out.println("Finding billionarie name is : "+billionarie);
		for(int i=0;i<billionaries.length;i++)
		{
			String ref=billionaries[i];	
			if(ref==billionarie)
			{
				System.out.println("billionarie name is found : "+billionarie);
				return true;
			}
		}
		return false;
	}
	
	//update name
	static String update(String oldBillionarie,String newBillionarie)
	{
		System.out.println("update :naditha ede");
		if(oldBillionarie!=null && newBillionarie!=null)
		{
			if(newBillionarie.length()>=4)
			{
				System.out.println("entered name is valid ");
				for(int j=0;j<billionaries.length;j++)
				{
				String point=oldBillionarie;
				if(point==billionaries[j])
				{
				billionaries[j]=newBillionarie;
				}
				}
			}
			else
			{
				System.out.println("entered name is  not valid ");

			}
		
		}
		return null;
	}
	
	// update index
	static String update1(int index,String newBillionarie)
	{
		if(newBillionarie!=null)
		{
			System.out.println("*****************");
			String point=billionaries[index];
			billionaries[index]=newBillionarie;
			return newBillionarie;
		}
		return null;
	}
	
	static String delete(String Billionarie)
	{
		System.out.println("delete :naditha ede");
		if(Billionarie!=null)
		{
			if(Billionarie.length()>=4)
			{
				System.out.println("entered name is valid ");
				for(int j=0;j<billionaries.length;j++)
				{
				String point=Billionarie;
				if(point==billionaries[j])
				{
				billionaries[j]=null;
				}
				}
			}
			else
			{
				System.out.println("entered name is  not valid ");

			}
		
		}
		return null;
		
	}
	
	static void delete1(int index)
	{
		if(billionaries[index]!=null)
		{
			System.out.println("deleted");
			
			billionaries[index]=null;
			
		}
	
	}
}























