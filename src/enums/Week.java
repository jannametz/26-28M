package enums;

public enum Week {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("nice"),
    SUNDAY("good");

    private String mood;

    Week(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    Week week;

    public Week getWeek() {
        return week;
    }

    public Today(Week week) {
        this.week = week;
    }

    void getDay() {
        switch (week) {
            case MONDAY, THURSDAY,
                    TUESDAY, FRIDAY,
                    WEDNESDAY -> System.out.println("Study JAVA");
            case SATURDAY, SUNDAY -> System.out.println("Relax");
        }
        System.out.println(week.getMood());
    }
}