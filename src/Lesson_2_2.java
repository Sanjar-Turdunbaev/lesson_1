public class Lesson_2_2 {
    public static void main(String[] args) {
        int temperature = 20;
        int numberOfStudent = 15;
        boolean isSnowy = false;

        // логический оператор И (AND) - &&
        if(temperature > 10 && temperature <25) {
            System.out.println("Go to the park");
        }

        if (isSnowy && temperature > 10) {
            System.out.println("Go to Cafe");
        }

        // логический оператор ИЛИ (OR) - ||
        if (temperature < 25 || isSnowy) {
            System.out.println("Go to scool");
        }

        if(isSnowy) {
            // false && (true  true) && false  false =>
            // 0 * (1 + 1) * 0 + 0 => 0 * 1 * 0 + 0 = (FALSE)
            System.out.println("Go to mauntains");
        }

        if (!isSnowy) {
            System.out.println("Have a nice walk");
        }
        // логический оператор отрицания НЕ (NOT) = !
        if (!isSnowy) { // true
            System.out.println("Have a nice walk");
        }
    }
}
