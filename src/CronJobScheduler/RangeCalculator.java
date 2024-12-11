package CronJobScheduler;

public class RangeCalculator extends Calculations{
    RangeCalculator(Calculations calculations) {
        super(calculations);
    }

    @Override
    public void move(String time, int low, int high, String pattern) {
        if(pattern.contains("-")){
            System.out.print(time+" :");
            String[] range=pattern.split("-");
            int lowerLimit=Integer.parseInt(range[0]);
            int higherLimit=Integer.parseInt(range[1]);
            for(int i=lowerLimit;i<=higherLimit;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else{
            super.move(time, low, high, pattern);
        }
    }
}
