package lang.print.gaps.task5;

public class TimeConvertor {

    public void convert(float minutes) {
        float seconds = minutes * 60;
        System.out.println(seconds);
    }
    public static void main(String[] args) {
        TimeConvertor convertor = new TimeConvertor();
        float minutes = 11.5f;
        convertor.convert(minutes);
    }

    }


