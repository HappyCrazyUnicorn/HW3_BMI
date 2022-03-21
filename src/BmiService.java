public class BmiService {
    public double calculate(double height, long mass) { //на вход даем рост в метрах и массу в кг

        double bodyMassIndex = mass / ((height * height)/10_000); //рассчет индекса массы тела, дополнительно делим на 10000, чтобы перевести из см в м
        return bodyMassIndex; //возвращаем индекс

    }
}
