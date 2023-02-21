package lambaad;

public class Cake {
    int numberOfCandles;
    String icingFlavour;
    String message;

    public String describeCake()
    {
      return "This cake has "+numberOfCandles+" number of candles, "
        +icingFlavour +" icing flavour and "+message+" as the message.";
    }
}
