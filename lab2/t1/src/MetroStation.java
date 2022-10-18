public class MetroStation {
    private String name;
    private int year;
    private Hour[] hours;

    public MetroStation(String name, int year, Hour[] hours) {
        super();
        this.name = name;
        this.year = year;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Hour[] getHours() {
        return hours;
    }

    public void setHours(Hour[] hours) {
        this.hours = hours;
    }
}
