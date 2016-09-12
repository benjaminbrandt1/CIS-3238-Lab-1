/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author tue94788
 */
public class Date {

    private int year, month, day;

    public Date(int year, int month, int day) throws Exception{
        if (year < 0) {
            throw new Exception();
        } else {
            this.year = year;
        }
        if (month < 0 || month > 12) {
            throw new Exception();
        } else {
            this.month = month;
        }
        if (day > 30 || day < 0) {
            throw new Exception();
        } else {
            this.day = day;
        }
    }
    
    public int getYear(){
        return this.year;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getDay(){
        return this.day;
    }

    public int daysBetween(Date day2) {
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
