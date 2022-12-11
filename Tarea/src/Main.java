import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        int menu=1;
        int submenu=1;
        while (menu !=0){
            menu=Menu();
            switch (menu){
                case 1:
                    System.out.println("SUB MENU AREAS");
                    while (submenu!=0){
                        submenu=Sub_Menu();
                        switch (submenu){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("SUB MENU PERIMETROS");
                    while (submenu!=0){
                        submenu=Sub_Menu();
                        switch (submenu){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 3:
                    while (submenu!=0){
                        submenu=Sub_Menu();
                        switch (submenu){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }
                    System.out.println("SUB MENU VOLUMENES");
                    break;
            }
        }

    }
    static int Menu(){
        int op=0;
        System.out.println("Menu Principal");
        System.out.println("1. Area");
        System.out.println("2. Perimietro");
        System.out.println("3. volumen");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        while (op!=1 && op!=2 && op!=3 && op!=0){
            System.out.println("Dato incorrecto");
            System.out.print("Opcion: ");
            op=sc.nextInt();
        }
        return op;
    }
    static int Sub_Menu(){
        int op=0;
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Rombo");
        System.out.println("0. Volver al menu principal");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        while (op!=1 && op!=2 && op!=3 && op!=0){
            System.out.println("Dato incorrecto");
            System.out.print("Opcion: ");
            op=sc.nextInt();
        }
        return op;
    }
}