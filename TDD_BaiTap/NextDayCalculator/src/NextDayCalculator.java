public class NextDayCalculator {
    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
    public static String NextDay(int day, int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31){
                    System.out.println("Error");
                } else {
                    if (month == 12 && day == 31){
                            day = 1;
                            month = 1;
                            year += 1;
                        } else if (day == 31){
                            day = 1;
                            month+=1;
                    } else {
                        day += 1;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30){
                    System.out.println("Error");
                } else {
                    if (day == 30) {
                        day = 1;
                        month+=1;
                    }else {
                        day += 1;
                    }
                }
                break;
            case 2:
                if(isLeapYear(year)) {
                    if (day == 29) {
                        day = 1;
                        month+=1;
                    } else {
                        day += 1;
                    }
                }else {
                    if (day == 28){
                        day = 1;
                        month+=1;
                    } else {
                        day +=1;
                    }
                }
                break;
        }
        return "Next day is: " +
                day +
                "/" + month +
                "/" + year;
    }
}
