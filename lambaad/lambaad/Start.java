package lambaad;

public class Start {

	public static void main (String[] args)
	   {
	Cake c1 = new Cake();
	c1.icingFlavour = "chocolate";
	c1.numberOfCandles = 5;
	c1.message = "Happy Birthday";

	Cake c2 = new Cake();
	c2.icingFlavour = "I'm Sorry...";
	c2.numberOfCandles = 0;
	c2.message = "The cake was a lie";
		
	Cake c3 = new Cake();
	c3.icingFlavour = "Just Kidding";
	c3.numberOfCandles = 1;
	c3.message = "Here is some cake...";

	System.out.println(c1.describeCake());
	
	System.out.println(c2.describeCake());
		
	System.out.println(c3.describeCake());

	
	
	   }
	}
