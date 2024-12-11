package CronJobScheduler;

public abstract class Calculations {
    Calculations nextCalculations;
    Calculations (Calculations calculations){
        this.nextCalculations=calculations;
    }

    public void move(String time,int low,int high,String pattern){
        if(nextCalculations!=null){
            nextCalculations.move(time,low,high,pattern);
        }

    }
}
