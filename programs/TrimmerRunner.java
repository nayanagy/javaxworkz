class TrimmerLite{
	public static void main(String[] beard){
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warrantyInYear);
		
		
		for(int index=0;index<Trimmer.totalSettings.length;index++)
		{
			String ref=Trimmer.totalSettings[index];
			System.out.println(ref);
		}
		
	}
}
