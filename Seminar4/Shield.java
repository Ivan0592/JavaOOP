package Seminar4;

public abstract class Shield implements Protection {
    protected static int number;
    private String name;
    private static int protection;

    static {
        number = 0;
        protection = 0;
    }

    public Shield(int protection, String name) {
        this.protection = protection;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProtection() {
        return protection;
    }

    public int protection() {
        return protection;
    }
}
