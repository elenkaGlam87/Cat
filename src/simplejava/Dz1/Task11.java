package simplejava.Dz1;

/**
 * Задание 11
 * У Деда Мороза есть часы, которые в секундах показывают, сколько осталось до каждого Нового года. Так как Дед
 * Мороз – человек уже в возрасте, то некоторые математические операции он быстро выполнять не в состоянии.
 * Помогите Деду Морозу определить, сколько полных дней, часов, минут и секунд осталось до следующего Нового года,
 * если известно сколько осталось секунд. Т. е. разложите время в секундах на полное количество дней, часов, минут
 * и секунд. Выведите результат на консоль.
 * Пример, как должен выглядеть вывод результата: 10 дней, 14 часов, 5 минут и 33 секунды
 */
public class Task11 {
    public static void main(String[] args) {
        int time=2_000_000;
        int sec=time%60;
        System.out.println(sec);
        int tempMin=time/60;
        int min=tempMin%60;
        System.out.println(min);
        int tempHour=tempMin/60;
        int hour=tempHour%60;
        System.out.println(hour);
        int days=tempHour/24;
        System.out.println(days);
        System.out.printf("%d дней, %d часов, %d минут, %d секунд", days, hour, min, sec);
    }
}
