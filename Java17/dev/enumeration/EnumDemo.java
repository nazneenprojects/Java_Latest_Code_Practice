package dev.enumeration;

import java.util.Random;

public class EnumDemo {
    public static void main(String[] args) {
        WeekDays weekDay = WeekDays.FRI;
        System.out.println(weekDay);
        System.out.println(weekDay.ordinal());

        for (int i = 0; i < 7; i++) {
            weekDay = getRandomDay();
            System.out.printf("Today is %s, it comes as %d in the week %n" , weekDay.name(), weekDay.ordinal());
            if(weekDay == WeekDays.SUN){
                System.out.println("its Sunday!!");
            }
        }
    }

    public static WeekDays getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = WeekDays.values();

        return allDays[randomInteger];
    }

    private static void SwitchDay(WeekDays weekday){
        int weekDayInteger = weekday.ordinal()+1;
        switch (weekday) {
            case FRI -> System.out.println("Its Fri"+ weekDayInteger);
            case SAT -> System.out.println("Its Sat"+ weekDayInteger);
            case SUN -> System.out.println("Its Sun"+ weekDayInteger);
            default -> System.out.println("There is no Day ! :D ");


        }


    }

}
