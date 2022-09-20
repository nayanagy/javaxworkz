class TabletRunner{
	
	public static void main(String[] matre){
		
		Tablet.printDetails();
        
      	Tablet.weight=0.3235d;
		Tablet.price=20;
		Tablet.mass=0.3020d;
		Tablet.cv=1d;
		
		String[] products={"lactose","dextrin","glucose","sucrose"};
		Tablet.ingredients=products;
		
		String[] types={" Compressed tablets","Sugar-coated Tablets","Film-Coated Tablets","Effervescent Tablets",
						"Enteric-coated Tablets","Chewable Tablets"};
		Tablet.type=types;
		
		Tablet.preservative=true;
		Tablet.dosage=100;
		Tablet.safetyForChildren=true;
		Tablet.shape="Round";
		Tablet.vitamins='b';
		
		String[] names={"Dolo650","paracetamol","b complex "};
		Tablet.name=names;
		Tablet.toxic="carbon monoxide";
		Tablet.manufactureYear=2000;
		Tablet.expiryYear=2022;
		Tablet.chewable=false;
		
		Tablet.printDetails();
		
	}
}