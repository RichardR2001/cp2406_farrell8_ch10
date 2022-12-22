// DemoCandles.java
public class DemoCandles
{
    public static void main(String[] args)
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        // Get details of the candles to test for the classes
        aCandle.setColor("pink");
        aCandle.setHeight(6);
        aScentedCandle.setColor("white");
        aScentedCandle.setScent("gardinia");
        aScentedCandle.setHeight(6);
        // Print the result based on the candles' details
        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() +
                " candle costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " +
                aScentedCandle.getScent() +
                " " + aScentedCandle.getColor() +
                " candle costs $" + aScentedCandle.getPrice());
    }
}
