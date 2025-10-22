public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Este programa cuenta los dígitos de un número.");
            System.out.print("Introduzca un número entero: ");
            long num = Long.parseLong(System.console().readLine());
            int digitosNum = 1;
            long n = Math.abs(num);
            while (n > 10) {
                digitosNum++;
                n /= 10;
            }
            System.out.println("El número introducido, " + num + ", tiene " + digitosNum + " dígito/s.");
        } catch (NumberFormatException ex) {
            System.out.println("Introduce un número valido por favor.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
}
