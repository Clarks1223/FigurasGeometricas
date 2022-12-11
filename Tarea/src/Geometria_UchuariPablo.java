public class Geometria_UchuariPablo {
    double formula;
    double total;
    double var1;
    double var2;
    double var3;
    public Geometria_UchuariPablo(){
        formula=0;
        var1=0;
        var2=0;
        var3=0;
        total=0;
    }
    //figuras con 1 variable
    public Geometria_UchuariPablo(double dat1,double form, double tot){
        formula=form;
        var1=dat1;
        total=tot;
    }
    public Geometria_UchuariPablo(double dat1, double dat2, double form, double tot){
        formula=form;
        total=tot;
        var1=dat1;
        var2=dat2;
    }
    public Geometria_UchuariPablo(double dat1, double dat2, double dat3, double form, double tot){
        formula=form;
        total=tot;
        var1=dat1;
        var2=dat2;
        var3=dat3;
    }
    public double getFormula() {
        return formula;
    }

    public void setFormula(double formula) {
        this.formula = formula;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    public double getVar3() {
        return var3;
    }

    public void setVar3(double var3) {
        this.var3 = var3;
    }
}