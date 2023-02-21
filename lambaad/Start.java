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

	System.out.println(c1.describeCake());

	System.out.println(c2.describeCake());
	   }
	}