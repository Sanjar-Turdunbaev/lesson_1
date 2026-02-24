public class Lesson_2_3 {
    public static void main(String[] args) {

        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();
        addition(4, 5, "Cумма чисел");
        addition(10, 45,"Результат сложения");
        calculatePerimeter(4.5f, 6.0f, "Аудитория 2");
        calculatePerimeter(3.5f, 4, "Кухня 2");
        calculatePerimeter(7, 5.5f, "Холл 2");
        int area0fAuditory2 = calculateArea(4.5f, 6.0f);
        int area0fKitchen = calculateArea(3.5f, 4);
        int area0fHall = calculateArea(7, 5.5f);
        System.out.println("Площадь комнаты Аудитория 2: "
                           + area0fAuditory2 + " квадратных " + getUnit() + ".");
        System.out.println("Площадь комнаты Кухня: "
                           + area0fKitchen + " квадратных " + getUnit() + ".");
        System.out.println("Площадь комнаты Холл: "
                           + area0fHall + " квадратных " + getUnit() + ".");
        System.out.println("ОБЩАЯ ПЛОЩАДЬ: "
                + (area0fAuditory2 + area0fKitchen + area0fHall)
                + " квадратных " + getUnit() + ".");
    }

    public static String getUnit() {
        // невозвращаемый метод без параметров
        return "см";
    }

    public static int calculateArea(float length, float width) {
        // невозвращаемый метод c параметрами
        int area = Math.round(length * width);
        return area;
    }

    public static void calculatePerimeter(float length, float width, String room) {
        // невозвращаемый метод без параметров
        float perimeter = (length + width) * 2;
        System.out.println("Периметер комнаты " + room + ": "
                           + perimeter + " " + getUnit() + ".");
    }

    public static void addition(int num1, int num2, String phrase){
        // невозвращаемый метод без параметров
        System.out.println(phrase + ": " + (num1 + num2));
    }

    public static void duration() {
        // невозвращаемый метод без параметров
        System.out.println("Процесс занял: 10 минут");
    }

    public static void makeTea(){
        // невозвращаемый метод без параметров
        System.out.println("Вскипиятить воду");
        System.out.println("Насыпать зоварку");
        System.out.println("Залтиь кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко / сахар по-вкусу");
        duration();
    }
    // End of program
}
