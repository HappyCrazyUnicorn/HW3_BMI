public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); //создаем объект из класса BmiService
        double height = 1.8; //объявляем переменную роста в метрах
        long mass = 70; //объявляем переменную веса в кг
        double bmi = service.calculate(height, mass); //вызываем метод calculate из класса BmiService, передаем на вход рост и вес
        System.out.printf("Индекс массы тела равен %.2f\n", bmi); //выводим индекс массы тела, оставляя 2 знакак после запятой
    }
}