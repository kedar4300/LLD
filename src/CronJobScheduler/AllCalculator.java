package CronJobScheduler;

public class AllCalculator extends Calculations{
    AllCalculator(Calculations calculations) {
        super(calculations);
    }

    @Override
    public void move(String time, int low, int high, String pattern) {
        String[] all=pattern.split(",");
        if(all.length>0) {
            System.out.print(time + " :");
            for (String s : all) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
//        else{
//            super.move(time, low, high, pattern);
//        }
    }


}
