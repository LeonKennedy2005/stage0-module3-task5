package lang.print.gaps.task5;
import java.util.logging.*;


public class NumberDivider {
    private static final Logger logger = Logger.getLogger(NumberDivider.class.getName());

    void divide(float toBeDivided) {
        logger.setLevel(Level.INFO);
        float newNumber = toBeDivided/5;
        String text = "New number is: "+ newNumber;
        logger.log(Level.INFO, text);
    }
    public static void main(String[] args)
    {

        NumberDivider divider= new NumberDivider();
        float tobeDivided = 32;
        divider.divide(tobeDivided);
    }
}
