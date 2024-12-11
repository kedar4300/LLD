package CronJobScheduler;

public class JumpCalculator extends Calculations{

    JumpCalculator(Calculations calculations) {
        super(calculations);
    }

    @Override
    public void move(String time, int low, int high, String pattern) {
        if(pattern.length()>2 && pattern.charAt(0)=='*' && pattern.charAt(1)=='/'){
            int jump=Integer.parseInt(pattern.substring(2));
            System.out.print(time+" :");
            for(int i=low;i<high;i+=jump){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else{
            super.move(time, low, high, pattern);
        }
    }
}
