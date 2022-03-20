public class BmiService {
    public double calculate(double height, long mass) { //на вход даем рост в метрах и массу в кг

        double bodyMassIndex = mass / (height * height); //рассчет индекса массы тела
        return bodyMassIndex; //возвращаем индекс

    }
}
