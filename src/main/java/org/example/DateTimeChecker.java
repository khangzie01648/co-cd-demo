package org.example;

public class DateTimeChecker {

    public int daysInMonth(int month, int year) {
        int[] monthsWith31Days = {1, 3, 5, 7, 8, 10, 12};
        int[] monthsWith30Days = {4, 6, 9, 11};

        if (contains(monthsWith31Days, month)){
            return 31;
        } else if(contains(monthsWith30Days, month)){
            return 30;
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    public boolean isValidDate (int day, int month, int year){
        if(day < 1 || month < 1 || month > 12 || year < 1){
            return false;
        }
        return day <= daysInMonth(month, year);
    }


    public boolean contains(int[] arr, int num){
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}