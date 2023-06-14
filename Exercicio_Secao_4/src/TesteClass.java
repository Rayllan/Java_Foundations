public class TesteClass {
    public static void main(String[] args) {
        ComputeMethods computeMethods = new ComputeMethods();

        double fahrenheit = 100.0;
        double celsius = computeMethods.fahrenheitParaCelsius(fahrenheit);
        System.out.println("Temperatura em Celsius é " + celsius);

        int ladoA = 8;
        int ladoB = 6;
        double hipotenusa = computeMethods.hipotenusa(ladoA, ladoB);
        System.out.println("Hipotenusa é " + hipotenusa);

        int valorDado1 = computeMethods.rolarDado();
        int valorDado2 = computeMethods.rolarDado();
        int soma = valorDado1 + valorDado2;
        System.out.println("A soma dos valores dos dados é " + soma);
    }
}