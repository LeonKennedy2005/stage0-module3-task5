package lang.print.gaps.task5;


public class NumberDivider {
    void divide(int toBeDivided) {
        float newNumber = toBeDivided/5;
        System.out.println("New number is: "+ newNumber);
    }
    public static void main(String[] args)
    {
        NumberDivider divider= new NumberDivider();
        int tobeDivided = 32;
        divider.divide(tobeDivided);
    }
}
