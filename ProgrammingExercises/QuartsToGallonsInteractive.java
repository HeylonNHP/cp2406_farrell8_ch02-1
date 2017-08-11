import java.util.Scanner;

public class QuartsToGallonsInteractive {
    private static final int quartsPerGallon = 4;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the amount of paint required: ");
        String userInput = input.nextLine();

        int quartsOfPaintRequired = Integer.parseInt(userInput);

        int gallonsOfPaintRequired = quartsOfPaintRequired / quartsPerGallon;
        int excessQuartsRequired = quartsOfPaintRequired % quartsPerGallon;

        System.out.println(String.format("Whole gallons: %d Quarts: %d", gallonsOfPaintRequired, excessQuartsRequired));
    }
}
