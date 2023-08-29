package lang.print.gaps.task5;


public class NumberDivider {
    void divide(float toBeDivided) {
        float newNumber = toBeDivided/5;
        System.out.println(newNumber);
    }
    public static void main(String[] args)
    {
        NumberDivider divider= new NumberDivider();
        float tobeDivided = 19;
        divider.divide(tobeDivided);
    }
}
