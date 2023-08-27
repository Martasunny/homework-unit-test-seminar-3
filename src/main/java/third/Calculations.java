package third;

public class Calculations {
    // 3. Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100): возвращает true,если попадает, и false, если нет.
    public static boolean numberInInterval(int n) {
        if (n > 25 && n < 100) return true;
        return false;
    }
}
