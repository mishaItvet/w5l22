package ge.itvet.enums;

public class CurrencyCalculator {
    public static double toDollar(Currency currency, double amount) {
        return currency.getWeight() * amount;
    }

    public static double dollarToCurrency(double amount, Currency currency) {
        return amount / currency.getWeight();
    }

    public static double CurrencyToCurrency(double amount, Currency currencyFrom, Currency toAmount) {
        double toDollar = toDollar(currencyFrom, amount);
        return dollarToCurrency(toDollar, toAmount);
    }
}
