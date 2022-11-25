package pr3.Converter;

public class Convertor {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    Convertor(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }
    public Convertor(){
        rateUSD = 60.47;
        rateEUR = 62.87;
        rateJPY = 0.43;
    }

    public void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Стоимость покупки в долларах " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Стоимость покупки в евро " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Стоимость покупки в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
