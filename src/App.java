import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    //KELOKE
    static void imprimirMenu(){
        System.out.println("1. Mostrar todas las temperaturas");
        System.out.println("2. Mostrar las temperaturas menores que 10 grados");
        System.out.println("3. Mostrar las temperaturas en grados F");
        System.out.println("4. Mostrar cuantos meses tuvieron más de 20 grados");
        System.out.println("5. Mostrar las temperaturas entre 15 y 20 grados");
        System.out.println("6. Mostrar otra lista con 5 grados menos en cada temperatura");
        System.out.println("0. Salir");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i = 0;
        int opcion = 0;
        List<Double> temperaturas = new ArrayList<>();
        List<Double> farenheit = new ArrayList<>();


        while(i < 12){
        System.out.println("Introduce la temperatura del mes "+i);
        double temperatura = sc.nextDouble();
        temperaturas.add(temperatura);
        i++;
        }
        do{
            imprimirMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    temperaturas.stream().forEach(System.out::println);
                    break;
                case 2:
                    temperaturas.stream().filter(temp -> temp < 10).forEach(System.out::println);;
                    break;
                case 3:
                   temperaturas.stream().map(temp -> temp*5/9+32).forEach(System.out::println);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(opcion != 0);

    }
}

