import java.math.BigDecimal;
import java.math.RoundingMode;

public class HumanTemperature {
    public static void main(String[] args) {

        float[] temperature = new float[30];
        int count = 0;

        float sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            count++;
            float personTemp = (float) (32 + 8 * Math.random());
            temperature[i] = personTemp;
            BigDecimal bd = new BigDecimal(temperature[i]).setScale(1, RoundingMode.HALF_EVEN);
            temperature[i] = bd.floatValue();
            System.out.print(" Пациент номер " + count + " с температурой: " + temperature[i]);
            if (temperature[i] >= 36.2 && temperature[i] <= 36.9)
            {
                System.out.println("\n" + " Пациент номер номер " + count + " с температурой " + temperature[i] + " здоров!");
            }
            sum += temperature[i];
        }
        System.out.println("\n" + " Средняя температура в больнице: " + sum/30);
    }

}
