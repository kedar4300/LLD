package CronJobScheduler;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // string input
//        split it accotding to the psace
//         if(string =="*")getAll method of operations (Minute,)get all
//         if(*/ )
        Scanner sc=new Scanner(System.in);
        String command= sc.nextLine();
        String[] time=command.split(" ");
        Calculations calculations=new RangeCalculator(new GetAllCalculator(new JumpCalculator(new AllCalculator(null))));
//        for(String t:time)
//         System.out.println(t);
        //* */3 1-7 3,4 1 /usr/bin/find
        calculations.move("Minute",0,60,time[0]);
        calculations.move("Hour",0,24,time[1]);
        calculations.move("Day",1,30,time[2]);
        calculations.move("Month",1,12,time[3]);
        calculations.move("DayOfWeek",1,7,time[4]);
        System.out.println("Command: "+ time[5]);


    }
//    15 */3 1-7 3,4 1 /usr/bin/find
//    minute -15
//    hour 0 3 6 9 12
//    day -1,2,3,4,5,6,7
//    moth 3,4
//    dayofweek -1;
//    command- /usr/bin/find
//
//    opertaions -
//            giving the specific
//        generating values timepriod
//        generation between values
//        print all the values

           //timeperiod: minute hour day month dayofweek



}
