public class App {
    public static void main(String[] args) throws Exception {
        boolean correcto = false;
        long num = 0;
        do {
            try {
            System.out.println("Este programa cuenta los dígitos de un número.");
            System.out.print("Introduzca un número entero: ");
            num = Long.parseLong(System.console().readLine());
            correcto = true;
        } catch (NumberFormatException ex) {
            System.out.println("Introduce un número valido por favor.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
        } while (!correcto);
        int digitosNum = 0;
        long n = Math.abs(num);
            do {
                digitosNum++;
                n /= 10;
            } while (n != 0);
            System.out.printf("El número introducido, %d, tiene %d dígito/s", num, digitosNum);

    }
}
