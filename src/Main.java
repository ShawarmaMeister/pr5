import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Создать переменную, содержащую ваше любимое время года
        System.out.print("Введите ваше любимое время года (WINTER, SPRING, SUMMER, AUTUMN): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            Season favoriteSeason = Season.valueOf(input);
            System.out.println("Ваше любимое время года: " + favoriteSeason);
            System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
            System.out.println("Описание: " + favoriteSeason.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("Неверное время года!");
        }

        // 2) Метод, который принимает на вход переменную enum типа
        printSeasonMessage(Season.SUMMER);

        // 6) В цикле распечатать все времена года, среднюю температуру и описание времени года
        for (Season season : Season.values()) {
            System.out.println(season + " - Средняя температура: " + season.getAverageTemperature() + "°C, " + season.getDescription());
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}