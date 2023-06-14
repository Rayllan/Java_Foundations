public class ComputeMethods {
    public double fahrenheitParaCelsius(double grausFahrenheit) {
        return (grausFahrenheit - 32) * 5 / 9;
    }

    public double hipotenusa(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public int rolarDado() {
        return (int) (Math.random() * 6) + 1;
    }
}