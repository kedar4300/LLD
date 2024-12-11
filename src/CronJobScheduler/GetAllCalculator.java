package CronJobScheduler;

public class GetAllCalculator extends Calculations{
    GetAllCalculator(Calculations calculations) {
        super(calculations);
    }

    @Override
    public void move(String time, int low, int high,String pattern) {
        if(pattern.equals("*")){
            System.out.print(time+" :");
            for(int i=low;i<=high;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else{
            super.move(time, low, high, pattern);
        }
    }
}
