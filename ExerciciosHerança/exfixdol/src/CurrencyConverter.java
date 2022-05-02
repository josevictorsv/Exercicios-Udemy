public class CurrencyConverter {

    private static final double IOF = 6 / 100;


    public static double CurrencyConverter(double preco, double valor){
        double result = (preco * valor) + (valor * preco *(6.0 / 100));
        return result;
    }
}
