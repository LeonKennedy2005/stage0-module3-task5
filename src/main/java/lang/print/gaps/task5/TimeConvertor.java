package lang.print.gaps.task5;
import java.util.logging.*;

public class TimeConvertor {
    private static final Logger logger = Logger.getLogger(TimeConvertor.class.getName());

    public void convert(float minutes) {
        logger.setLevel(Level.INFO);
        float seconds = minutes * 60;
        String text = minutes + " minutes is equal to " + seconds + " seconds";
        logger.log(Level.INFO, text);
    }
    public static void main(String[] args) {
        TimeConvertor convertor = new TimeConvertor();
        float minutes = 3.25f;
        convertor.convert(minutes);
    }

    }


