package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int d=0;
        while (number!=0){
            d=d*10+number%10;
            number=number/10;
        }
        System.out.println(d);
    }
}
