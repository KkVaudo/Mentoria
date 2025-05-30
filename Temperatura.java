import java.util.Scanner;

class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius ao usuário
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Converte para Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\nTemperatura em Celsius: " + String.format("%.2f", celsius) + " °C");
        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");
        System.out.println("Temperatura em Kelvin: " + String.format("%.2f", kelvin) + " K");

        scanner.close();
    }
}