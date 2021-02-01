import java.util.Calendar;
//mentions that we cannot add other data members..does that mean we cannot add
// the parameters in the isValid function?? stupid question
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(String date) { //taking mm/dd/yyyy and create a Date object
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);

    }

    public void setYear(int year) {

        this.year = year;
    }

    public void setMonth(int month) {

        this.month = month;
    }
    public void setDay(int day) {

        this.day = day;
    }
    public int getMonth(int month) {

        return this.month;
    }
    public int getDay(int day) {

        return this.day;
    }
    public int getYear(int year) {

        return this.year;
    }
    public Date () // create object with today's date (see Calendar class)
    {
        Date cal = new Date();
        if(isValid(day,month,year)) {
            cal.getYear(year);
            cal.getDay(day);
            cal.getMonth(month);
        }

    }

    public boolean isValid(int day, int month, int year)
    {  //check whether the date is valid or not.
        //check the months(no of days) leap year etc
        boolean leap = false;
        if(year < 1900 || year > 2021) {
            return false;
        }

        if(year % 4 == 0) { //step 1
            if(year %100 == 0) { //step 2
                if(year % 400 == 0) { //step 3
                    leap = true; //step 4
                }else {
                    leap = false; //step 5
                }
            }else {
                leap = true; //step 4
            }
        }else {
            leap = false; // step5
        }

        switch(month) {

            case 1:
                if ( day < 1 || day > 31 ) {
                    return false;
                }
                break;
            case 2:
                if(leap) {
                    if(day <1 || day > 29) {
                        return false;
                    }
                }else if(day < 1 || day > 28) {
                    return false;
                }

                break;
            case 3:
                if(day <1 || day > 31) {
                    return false;
                }
                break;
            case 4:
                if(day <1 || day > 30) {
                    return false;
                }
                break;

            case 5:
                if(day <1 || day > 31) {
                    return false;
                }
                break;

            case 6:
                if(day <1 || day > 30) {
                    return false;
                }
                break;

            case 7:
                if(day <1 || day > 31) {
                    return false;
                }
                break;

            case 8:
                if(day <1 || day > 31) {
                    return false;
                }
                break;

            case 9:
                if(day <1 || day > 30) {
                    return false;
                }
                break;

            case 10:
                if(day <1 || day > 31) {
                    return false;
                }
                break;
            case 11:
                if(day <1 || day > 30) {
                    return false;
                }
                break;
            case 12:
                if(day <1 || day > 31) {
                    return false;
                }
                break;

            default:
                return false;

        }


        return true;
    }
}



