import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Sismos> sismo = new ArrayList <>();

        System.out.print("Ingrese la region: ");
        String Region = sc.nextLine();
        System.out.print("Ingrese el epicentro: ");
        String Epicentro = sc.nextLine();
        System.out.print("Ingrese la maginitud: ");
        float Magnitud = sc.nextFloat();

        try {
            sismo.add(new Sismos(Region, Epicentro, Magnitud));
            } catch (SismoInvalidoException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
         for (Sismos s : sismo) {
             System.out.println(s);
        }
         sc.close();
}
}