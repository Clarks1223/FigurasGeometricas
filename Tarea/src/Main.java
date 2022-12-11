import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        int menu=0;

    }
    static int Menu(){
        int op=0;
        System.out.println("Menu Principal");
        System.out.println("1. Areas");
        System.out.println("2. Perimietros");
        System.out.println("3. volumenes");
        System.out.println("0. Salir");
        op=sc.nextInt();
        while (op!=1 && op!=2 && op!=3 && op!=0){
            System.out.println("Dato incorrecto");
            op=sc.nextInt();
        }
        return op;
    }
}