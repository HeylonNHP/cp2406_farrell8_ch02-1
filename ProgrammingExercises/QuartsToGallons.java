public class QuartsToGallons {
    private static final int quartsPerGallon = 4;
    public static void main(String[] args){
        int quartsOfPaintRequired = 69;

        int gallonsOfPaintRequired = quartsOfPaintRequired / quartsPerGallon;
        int excessQuartsRequired = quartsOfPaintRequired % quartsPerGallon;

        System.out.println(String.format("Whole gallons: %d Quarts: %d", gallonsOfPaintRequired, excessQuartsRequired));
    }
}
