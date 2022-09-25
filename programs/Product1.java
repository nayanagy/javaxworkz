class Product{
	public static void main(String Item[]){
		
		int Sugar=45;
		int Toor_dal=128;
		int Green_gram=135;
		int Urad_dal=130;
		int Channa_dal=80;
		int Tamarld=150;
		int Garlic_Large=180;
		int Gold_Winner=110;
		float Split_gram_lentil=57.50f;
		int Kadalal_paruppu=22;
		float Pepper=42.70f;
		float Cumin=25.60f;
		int Mustard=9;
		float Vendhayam=8.60f;
		float Tamarind=35.50f;
		int Pottu_Kadalal=22;
		float Chilly=25.20f;
		int Coriander=24;
		float Turmeric_Powder=12.90f;
		int Tea_Powder=24;
		int Salt=8;
		int Pattal=3;
		float Sombu=6.50f;
		int Chilly_Powder=25;
		float Handling_charges=4.90f;
		float Gunny_Bag=3.60f;
		int Shampoo=20;
		int Toothpaste=10;
		int Soap=25;
		int Toothbrush=20;
		int Blender=50;
		int Biscuits=20;
		int Bed=2500;
		int Headphones=1500;
		int comb=45;
		int Knife=30;
		int Razor=75;
		int Toaster=54;
		int Address_Book=100;
		int Alarm_Clock=150;
		int Book=80;
		int Chairs=300;
		int Cloths=1000;
		int carpet=2000;
		int Glasses=250;
		int Lamp=500;
		int Towel=250;
		int Ribbon=20;
		int Juice=55;
		int Ketchup=30;
		
		
		int grocery1[]={Sugar,Toor_dal,Green_gram,Urad_dal,Channa_dal,Tamarld,Garlic_Large,Gold_Winner,
		Kadalal_paruppu,Mustard,Pottu_Kadalal,Coriander,Tea_Powder,Headphones,comb,Knife,Razor,
		Salt,Pattal,Chilly_Powder,Shampoo,Toothpaste,Soap,Toothbrush,Blender,Biscuits,Bed,Toaster,Address_Book,Alarm_Clock,Book,
		Chairs,Cloths,carpet,Glasses,Lamp,Towel,Ribbon,Juice,Ketchup};
		
		int total=grocery1.length;
		System.out.println(total);
		
		float grocery2[]={Split_gram_lentil,Pepper,Cumin,Vendhayam,Tamarind,Chilly,Turmeric_Powder,Sombu,Handling_charges,Gunny_Bag};
		
		float total2=grocery2.length;
		System.out.println(total2);
		
		float count=total+total2;
		System.out.println(count);
		
		System.out.println("Price of Sugar:"+grocery1[0]);
		System.out.println("Price of Green gram:"+grocery1[2]);
		System.out.println("Price of Garlic Large:"+grocery1[6]);
		System.out.println("Price of Gold Winner:"+grocery1[7]);
		System.out.println("Price of Handling_charges:"+grocery2[8]);
		System.out.println("Price of Gunny_Bag:"+grocery2[9]);
		
		
		
		
	}
}
