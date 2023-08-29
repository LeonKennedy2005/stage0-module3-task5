package lang.print.gaps.task5;
import java.util.logging.*;

public class ThreeStuckVars {
    private static final Logger logger = Logger.getLogger(ThreeStuckVars.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        int first;
        int second;
        int third;
        first=1;
        second=10;
        third=100;
        String text = first+""+second+""+third;
        logger.log(Level.INFO, text);
    }
}
