import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] values = { 26, 10, 40, 88, 32,};
        String[] cars = {"BMW", "Toyota", "Jeep", "Fiat"};
        String[][] teamsSoccer = {{"Real Madrid", "Milan", "Napoli"}, {"Borussia", "Roma", "Lazio"}};
        Arrays.sort(values);

        int value = (int)Math.round(Math.random() * 100000);

        System.out.println("O vencedor so sorteio é:" + value);

        System.out.println(Arrays.toString(values));
        System.out.println(values.length);
        System.out.println(cars[3]);
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.deepToString(teamsSoccer));
    }
}