import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Hour hour = new Hour(23, "Sunny hour");
        System.out.println(hour.getPassagersCount() + "\t" + hour.getComment());

        Hour[] hours = {
                new Hour(23, "some text"),
                new Hour(28, "some text1"),
                new Hour(49, "some text2"),
                new Hour(34, "some text3"),
                new Hour(38, "some text4")
        };

        MetroStation station = new MetroStation("Heroes of work", 1997, hours);

        System.out.println(station.getName() + "\t" + station.getYear());

        StringTokenizer st = new StringTokenizer(station.getHours()[0].getComment());
        int sum = 0, min = station.getHours()[0].getPassagersCount(), index_of_longest = 0;
        for (int i = 0; i < station.getHours().length; i++) {
            StringTokenizer check_st = new StringTokenizer(station.getHours()[i].getComment());
            sum += station.getHours()[i].getPassagersCount();
            if (min > station.getHours()[i].getPassagersCount())
                min = station.getHours()[i].getPassagersCount();
            if (st.countTokens() < check_st.countTokens()) {
                index_of_longest = i;
                st = new StringTokenizer(station.getHours()[index_of_longest].getComment());
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Index of the longest: " + (index_of_longest + 1));

    }
}