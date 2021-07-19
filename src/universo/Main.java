package universo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SuperHeroe[] heroes = new SuperHeroe[2];
        int i = 0;

        while(i<10){
            heroes[i] = agregarSuperHeroe();
            i++;
        }
    }

    public static SuperHeroe agregarSuperHeroe(){
        Scanner sc = new Scanner(System.in);
        SuperHeroe temp = new SuperHeroe();
        System.out.print("Digite el nombre del superheroe: ");
        temp.setNombre(sc.nextLine());

        System.out.print("Digite numero:");
        int error = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite el origen superheroe: ");
        temp.setMundoOrigen(sc.nextLine());

        System.out.print("Digite la identidad del superheroe: ");
        temp.setIdentidad(sc.nextLine());

        System.out.print("Digite el universo del superheroe: ");
        temp.setUniverso(sc.nextBoolean());
        sc.nextLine();
        return temp;
    }
}
