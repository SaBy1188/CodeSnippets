package de.basics.enums.weekdays;

public class Main {
    public static void main(String[] args) {
        EnumType firstDay = new EnumType(EnumExampleDays.MONDAY);
        firstDay.tellItLikeItIs();
        EnumType thirdDay = new EnumType(EnumExampleDays.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumType fifthDay = new EnumType(EnumExampleDays.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumType sixthDay = new EnumType(EnumExampleDays.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumType seventhDay = new EnumType(EnumExampleDays.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}