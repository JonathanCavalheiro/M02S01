import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrosUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    List<Carros> carros = new ArrayList<>();
        Carros carro1 = new Carros ();
        Carros carro2 = new Carros ();

     for (int i = 0;i < 3; i++) {
         System.out.println("Informe o fabricante");
         String fabricante = input.next();
         System.out.println("Informe o modelo deo carro: ");
         String modelo = input.next();
         System.out.println("Informe a cor do carro: ");
         String cor = input.next();
         Carros carroAdicionado = new Carros(modelo, cor, fabricante);
         carros.add(carroAdicionado);
     }


        System.out.println(carros);




    }
}
