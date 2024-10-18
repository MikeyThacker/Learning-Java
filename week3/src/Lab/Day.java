package Lab;

public class Day {
    private int year;
    private int month;
    private int day;

    public Day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter Functions
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    // Setter Functions
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean isNewYear() {
        return day == 1 && month == 1;
    }

    public boolean isCentury() {
        return year % 100 == 0;
    }

    public boolean isLeapYear() {
        if (this.isCentury()) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }

    public String dayOfWeek() {
        String result = "Unknown";
        int century = this.year % 100;
        int centuryItem;

        int yearItem;

        int[] monthScore = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 4, 5};
        int monthItem = monthScore[month - 1];

        int dayItem = day;
        if (this.isLeapYear() && (month == 1 || month == 2)) {
            dayItem += 6;
        }

        int total = (centuryItem + yearItem + monthItem + dayItem) % 7;
        switch (total) {
            case 0: result = "Sunday"; break;
            case 1: result = "Monday"; break;
            case 2: result = "Tuesday"; break;
            case 3: result = "Wednesday"; break;
            case 4: result = "Thursday"; break;
            case 5: result = "Friday"; break;
            default: result = "Saturday"; break;
        }


        return result;
    }
}
