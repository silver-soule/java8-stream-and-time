package edu.knoldus.dateandtime;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Neelaksh on 21/8/17.
 */
class TimeIt {
    int year;
    int month;
    int day;

    private Period timeFromBirth() {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period;
    }

    public TimeIt(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public double getTimeInYears(int year, int month, int day) {
        Period timefromBirth = timeFromBirth();
        return timefromBirth.getYears() + (double)timefromBirth.getMonths()/12;
    }

    public double getTimeInMonths(int year, int month, int day){
        Period timefromBirth = timeFromBirth();
        return timefromBirth.getYears()*12 + timefromBirth.getMonths();
    }
}
