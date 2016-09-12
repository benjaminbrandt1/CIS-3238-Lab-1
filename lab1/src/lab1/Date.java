/*
 Benjamin Brandt
Date class for Lab 1
ASSUMPTIONS: Every year has 365 days, every month has 30 days
 */
package lab1;

/**
 *
 * @author tue94788
 */
public class Date {

    private int year, month, day;

    /* Constructors */
    public Date(int year, int month, int day) throws Exception{
        // Exception if year is negative, days is not within 1-30, months is not within 1-12
        if (year < 0) {
            throw new Exception();
        } else {
            this.year = year;
        }
        if (month <= 0 || month > 12) {
            throw new Exception();
        } else {
            this.month = month;
        }
        if (day > 30 || day <= 0) {
            throw new Exception();
        } else {
            this.day = day;
        }
    }
    
    /*Getters */
    public int getYear(){
        return this.year;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getDay(){
        return this.day;
    }

    /* Methods */
    public int daysBetween(Date day2) {
        //Calculates the amount of days between each date
        int yearDif = day2.getYear() - this.getYear();
        int total = yearDif * 365;
        
        int monthDif = day2.getMonth() - this.getMonth();
        total += (monthDif * 30);
        
        int dayDif = day2.getDay() - this.getDay();
        total += (dayDif);
        
         if(total > 0){
            System.out.println("Day 1 is " + total + " days before Day 2");
        } else {
            System.out.println("Day 1 is " + Math.abs(total) + " days after Day 2");
        } 
        return Math.abs(total);
    }
}
