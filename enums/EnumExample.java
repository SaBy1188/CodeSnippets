package de.basics.enums;

public enum EnumExample {
    MONDAY(1,"Moontag",true),

    TUESDAY(2,"Tacco-Dienstag",true),

    WEDNSDAY(3,"Bergfest",true),

    THURSDAY(4,"Thunderday",true),

    FRIDAY(5,"FREItag",true),

    SATURDAY(6,"Spaßtag",true),

    SUNDAY(7,"SunnySunDay",true);

    private int     id;
    private String  fancyName;
    private boolean workDay;

    EnumExample(int id,String fancyName,boolean workDay) {
        this.id = id;
        this.fancyName = fancyName;
        this.workDay = workDay;
    }

    public int getId( ) {
        return id;
    }

    public String getFancyName( ) {
        return fancyName;
    }

    public boolean isWorkDay( ) {
        return workDay;
    }
}