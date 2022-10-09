import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner S = new Scanner(System.in);
      System.out.println("Insira a temperatura em graus Fahrenheit");
      Float fahrenheit = S.nextFloat();

      // transformar em graus celsius
      Float celsius = 5 * ( ( fahrenheit-32 ) /9);
      System.out.println(fahrenheit+ "Graus Fahrenheit, equivalem a " + celsius + "graus celsius."  );

    }
}
