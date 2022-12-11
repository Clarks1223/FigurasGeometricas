import java.util.Scanner;

public class Calculos {
    Geometria_UchuariPablo cal = new Geometria_UchuariPablo();
    Scanner sc=new Scanner(System.in);
    public void area_Cuad(){
        double lado, tot, form;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado=sc.nextDouble();
        form=Math.pow(lado,2);
        tot=form;
        cal= new Geometria_UchuariPablo (lado, form, tot);
        System.out.println("El area es: "+tot);
    }
    public void area_Cir(){
        double PI=3.14, radio, tot, form;
        System.out.print("Ingrese el lado del cuadrado: ");
        radio=sc.nextDouble();
        form=PI*Math.pow(radio,2);
        tot=form;
        cal= new Geometria_UchuariPablo (PI, radio, form, tot);
        System.out.println("El area es: "+tot);
    }
    public void area_Romb(){
        double diag1, diag2, tot, form;
        System.out.print("Ingrese la diagonal mayor: ");
        diag1=sc.nextDouble();
        System.out.print("Ingrese la diagonal menor: ");
        diag2=sc.nextDouble();
        form=(diag1*diag2)/2;
        tot=form;
        cal= new Geometria_UchuariPablo (diag1, diag2, form, tot);
        System.out.println("El area es: "+tot);
    }

    public void Per_cuad(){
        double lado, form, tot;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado=sc.nextDouble();
        form=lado+lado+lado+lado;
        tot=form;
        cal= new Geometria_UchuariPablo (lado, form, tot);
        System.out.println("El perimetro es: "+tot);
    }
    public void Per_circ(){
        double PI=3.14, radio, form, tot;
        System.out.print("Ingrese el radio del circulo: ");
        radio=sc.nextDouble();
        form=PI*2*radio;
        tot=form;
        cal= new Geometria_UchuariPablo (PI, radio, form, tot);
        System.out.println("El perimetro es: "+tot);
    }
    public void Per_Rom(){
        double lado, form, tot;
        System.out.print("Ingrese el lado del rombo: ");
        lado=sc.nextDouble();
        form=lado+lado+lado+lado;
        tot=form;
        cal= new Geometria_UchuariPablo (lado, form, tot);
        System.out.println("El perimetro es: "+tot);
    }
    public void volum_cub(){
        double lado,form, tot;
        System.out.print("Ingrese el lado del cubo: ");
        lado=sc.nextDouble();
        form=Math.pow(lado,3);
        tot=form;
        cal = new Geometria_UchuariPablo(lado, form, tot);
        System.out.println("El volumen es: "+tot);
    }
    public void volum_cil(){
        double PI=3.14, radio, alt, form, tot;
        System.out.println("Ingrese el radio");
        radio=sc.nextDouble();
        System.out.println("Ingrese la altura");
        alt=sc.nextDouble();
        form=PI*radio*alt;
        tot=form;
        cal=new Geometria_UchuariPablo(PI, radio, alt, form, tot);
        System.out.println("El volumen es: "+tot);
    }
    public void volum_esf(){
        double cons=3/4, PI=3.14, radio, form, tot;
        System.out.print("Ingrese el radio: ");
        radio=sc.nextDouble();
        form=cons*PI*Math.pow(radio, 2);
        tot=form;
        cal = new Geometria_UchuariPablo(cons, PI, radio, form, tot);
        System.out.println("El volumen es: "+tot);
    }
}
