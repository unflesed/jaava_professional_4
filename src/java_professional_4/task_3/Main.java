package java_professional_4.task_3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        age(1995, 5, 5, 17, 15, 33);
    }
    static void age(int year, int month, int day, int hours, int minutes, int seconds){
        LocalDateTime lBefore = LocalDateTime.of(year, month, day, hours, minutes, seconds);
        LocalDateTime lNow = LocalDateTime.now();
        boolean check = false;
        if(lNow.getSecond() - lBefore.getSecond() >= 0)
            seconds = lNow.getSecond() - lBefore.getSecond();
        else{
            seconds = 60 + lNow.getSecond() - lBefore.getSecond();
            check = true;
        }
        if (check) {
            if(lNow.getMinute() - 1 - lBefore.getMinute() >= 0){
                minutes = lNow.getMinute() - 1 - lBefore.getMinute();
                check = false;
            }else{
                minutes = 60 + lNow.getMinute() - 1 - lBefore.getMinute();
            }
        }else{
            if(lNow.getMinute() - lBefore.getMinute() >= 0) {
                minutes = lNow.getMinute() - lBefore.getMinute();
            }else{
                minutes = 60 + lNow.getMinute() - lBefore.getMinute();
                check = true;
            }
        }
        if (check) {
            if(lNow.getHour() - 1 - lBefore.getHour() >= 0){
                hours = lNow.getHour() - 1 - lBefore.getHour();
                check = false;
            }else{
                hours = 24 + lNow.getHour() - 1 - lBefore.getHour();
            }
        }else{
            if(lNow.getHour() - lBefore.getHour() >= 0) {
                hours = lNow.getHour() - lBefore.getHour();
            }else{
                hours = 24 + lNow.getHour() - lBefore.getHour();
                check = true;
            }
        }
        if (check) {
            if(lNow.getDayOfMonth() - 1 - lBefore.getDayOfMonth() >= 0){
                day = lNow.getDayOfMonth() - 1 - lBefore.getDayOfMonth();
                check = false;
            }else{
                day = lNow.getMonthValue() + lNow.getDayOfMonth() - 1 - lBefore.getDayOfMonth();
            }
        }else{
            if(lNow.getDayOfMonth() - lBefore.getDayOfMonth() >= 0) {
                day = lNow.getDayOfMonth() - lBefore.getDayOfMonth();
            }else{
                day = lNow.getMonthValue() + lNow.getDayOfMonth() - lBefore.getDayOfMonth();
                check = true;
            }
        }
        if (check) {
            if(lNow.getMonth().getValue() - 1 - lBefore.getMonth().getValue() >= 0){
                month = lNow.getMonth().getValue() - 1 - lBefore.getMonth().getValue();
                check = false;
            }else{
                month = 12 + lNow.getMonth().getValue() - 1 - lBefore.getMonth().getValue();
            }
        }else{
            if(lNow.getDayOfMonth() - lBefore.getDayOfMonth() >= 0) {
                month = lNow.getMonth().getValue() - lBefore.getMonth().getValue();
            }else{
                month = 12 + lNow.getMonth().getValue() - lBefore.getMonth().getValue();
                check = true;
            }
        }
        if (check) {
            year = lNow.getYear() - 1 - lBefore.getYear();
        }else{
            year = lNow.getYear() - lBefore.getYear();
        }
        System.out.printf("Вам исполнилось %d лет, %d месяца, %d дней, %d часа, %d минут и %d секунд",
                year, month, day, hours, minutes, seconds);
    }
}
