
public class SwiftDate {

    private int year;
    private int month;
    private int day;

    SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    boolean isLeapYear() {
        return this.year % 400 == 0 || (this.year % 100 != 0 && this.year % 4 == 0);
    }

    boolean isNewLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    int getCentury() {
        return this.year / 100 + 1;
    }

    int fromMonth(int year, int month, int day) {
        //calculate how many days till the end of current newYear
        int sum = 0;
        switch (month) {
            case 1:
                sum += 31;
            case 2:
                if (isNewLeapYear(year) == true) {
                    sum += 29;
                } else {
                    sum += 28;
                }
            case 3:
                sum += 31;
            case 4:
                sum += 30;
            case 5:
                sum += 31;
            case 6:
                sum += 30;
            case 7:
                sum += 31;
            case 8:
                sum += 31;
            case 9:
                sum += 30;
            case 10:
                sum += 31;
            case 11:
                sum += 30;
            case 12:
                sum += 31;
            default:
                break;
        }
        return sum - day;
    }

    int yearsSum(int year) {
        //calculate how many days in diff years
        int diff = this.year > year ? this.year - year-1 : year - this.year-1;
        int sum = 0;
        while (diff > 0) {
            diff--;
            if (isNewLeapYear(this.year > year ? this.year-diff : year - diff) == true) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        return sum;
    }

    int toMonth(int year, int month, int day) {
        //calculate days from begging of next newYear
        int sum = 0;
        switch (month - 1) {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                if (isNewLeapYear(year) == true) {
                    sum += 29;
                } else {
                    sum += 28;
                }
            case 1:
                sum += 31;
            default:
                break;
        }
        return sum + day;
    }

    int getDaysDifference(int newYear, int newMonth, int newDay) {
        int sum = 0;
        int diff = 0;

        if (this.year - newYear == 1 || newYear - this.year == 1) {
            //here we check if both years are neighbours;
            if (this.year > newYear) {
                sum = toMonth(this.year, this.month, this.day) + fromMonth(newYear, newMonth, newDay);
            } else {
                sum = toMonth(newYear, newMonth, newDay) + fromMonth(this.year, this.month, this.day);
            }
        } else {
            if (this.year > newYear) {
                sum = fromMonth(newYear, newMonth, newDay);
                sum += yearsSum(newYear);
                sum += toMonth(this.year, this.month, this.day);
            } else if (this.year < newYear) {
                sum += fromMonth(this.year, this.month, this.day);
                sum += yearsSum(newYear);
                sum += toMonth(newYear, newMonth, newDay);
            } else {
                if (this.month == newMonth) {
                    sum = (this.day > newDay ? this.day - newDay : newDay - this.day);
                } else if (this.month < newMonth) {
                    sum += fromMonth(this.year, this.month, this.day) - fromMonth(newYear, newMonth, newDay);
                } else {
                    sum += fromMonth(newYear, newMonth, newDay) - fromMonth(this.year, this.month, this.day);
                }
            }
        }
        //we will add one day for the firs day or last day into the interval as it will not be counted.
        return sum + 1;
    }

    String getInfo() {
        String newMonth = "";
        String newDay = "";
        if (this.month < 10) {
            newMonth = "0" + this.month;
        } else {
            newMonth = "" + this.month;
        }

        if (day < 10) {
            newDay = "0" + day;
        } else {
            newDay = "" + day;
        }

        return isLeapYear() == true ? this.year + " " + newMonth + " " + newDay + " - " + getCentury() + " century. It is LEAP year." : this.year + " " + newMonth + " " + newDay + " - " + getCentury() + " century.";
    }
}
