class ToothPasteRunner{
	public static void main(String[] paste)
	{
		System.out.println("main : nadita ede");
		
		
		ToothPaste.setName("Colgate");
		System.out.println(ToothPaste.getName());
		
		ToothPaste.setTypeOfSalts("sodium chloride");
		System.out.println(ToothPaste.getTypeOfSalts());
		
		ToothPaste.setColor("White");
		System.out.println(ToothPaste.getColor());
		
		ToothPaste.setDensity(23.4d);
		System.out.println(ToothPaste.getDensity());
		
		ToothPaste.isContainsWater(true);
		System.out.println(ToothPaste.isContainsWater());
		
		ToothPaste.isSaltContent(true);
		System.out.println(ToothPaste.isSaltContent());
		
		ToothPaste.isOdor(false);
		System.out.println(ToothPaste.isOdor());
		
		ToothPaste.setBoilingPoint(95.3d);
		System.out.println(ToothPaste.getBoilingPoint());
		
		ToothPaste.setMeltingPoint(85.3d);
		System.out.println(ToothPaste.getMeltingPoint());
		
		ToothPaste.isContainsFluoride(true);
		System.out.println(ToothPaste.isContainsFluoride());
		
		ToothPaste.setMolarMass(65.8d);
		System.out.println(ToothPaste.getMolarMass());
		
		ToothPaste.setpH(7d);
		System.out.println(ToothPaste.getpH());
		
		ToothPaste.isAcidContent(true);
		System.out.println(ToothPaste.isAcidContent());
		
		ToothPaste.setManufactureYear(2018);
		System.out.println(ToothPaste.getManufactureYear());
		
		ToothPaste.setExpiryYear(2022);
		System.out.println(ToothPaste.getExpiryYear());
		
		System.out.println("main : mugitu");
		
		
	}
}