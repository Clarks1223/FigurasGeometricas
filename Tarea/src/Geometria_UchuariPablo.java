public class Geometria_UchuariPablo {
    /*area*/
    double lado;
    double radio;
    double diag_ma;
    double diag_men;
    /*Perimetro*/
    double PI;
    /*Volumen*/
    public Geometria_UchuariPablo(){
        lado=0;
        radio=0;
        diag_ma=0;
        diag_men=0;
        PI=3.14;
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiag_ma() {
        return diag_ma;
    }

    public void setDiag_ma(double diag_ma) {
        this.diag_ma = diag_ma;
    }

    public double getDiag_men() {
        return diag_men;
    }

    public void setDiag_men(double diag_men) {
        this.diag_men = diag_men;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
}
