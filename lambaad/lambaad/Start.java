package lambaad;

public class Start {

	public static void main (String[] args)
	   {
	Cake c1 = new Cake();
	c1.icingFlavour = "chocolate";
	c1.numberOfCandles = 5;
	c1.message = "Happy Birthday";

	Cake c2 = new Cake();
	c2.icingFlavour = "Vanilla";
	c2.numberOfCandles = 50;
	c2.message = "Congratulations";
		
	Cake c3 = new Cake();
	c3.icingFlavour = "Rainbow";
	c3.numberOfCandles = 10;
	c3.message = "Get well soon!";
	
	Cake c4 = new Cake();
	c4.icingFlavour = "Plastic";
	c4.numberOfCandles = 0;
	c4.message = "Symtex";
		
	Cake c5 =  new Cake();
	c5.icingFlavour = "Mocha-Chocolatah";
	c5.numberOfCandles = 4;
	c5.message = "Real Lady Marmalade";
	
	Cake c6 = new Cake();
	c6.icingFlavour = "Keep Practicing";
	c6.numberOfCandles = 12;
	c6.message = "Almost there";
		
	Cake c7 = new Cake();
	c7.icingFlavour = "lucky"
	c7.numberOfCandles = 7;
	c7.message = "Les go";

	System.out.println(c1.describeCake());

	System.out.println(c2.describeCake());
		
	System.out.println(c3.describeCake());
	
	System.out.println(c4.describeCake());
	
	System.out.println(c5.describeCake());
	
	   }
	}
