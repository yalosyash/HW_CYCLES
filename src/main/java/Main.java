import ru.netology.services.MonthsOfRest;

public class Main {
    public static void main(String[] args) {
        MonthsOfRest service = new MonthsOfRest();
        System.out.println(service.monthsOfRest(100_000, 60_000, 150_000));
    }
}