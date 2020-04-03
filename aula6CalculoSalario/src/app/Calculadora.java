package app;

public class Calculadora {
    private double salarioBruto;
    private double horasTrabalhadas;
    private double inss;
    private double ir;

    // sets
    public void setSalarioBruto (double salarioHora, int qtdDependentes) {
        double calc = this.horasTrabalhadas * salarioHora + (50 * qtdDependentes);
        this.salarioBruto = calc;
        this.calcINSS();
        this.calcIR();
    }
    public void setHorasTrabalhadas (double value) {
        this.horasTrabalhadas = value;
    }
    // operations
    private void calcINSS () {
        if (this.salarioBruto <= 100){
            this.inss = this.salarioBruto * 8.5 / 100;
        } else {
            this.inss = this.salarioBruto * 9 / 100;
        }
    }
    private void calcIR () {
        if (this.salarioBruto <= 500) this.ir = 0;
        else if (this.salarioBruto > 500 && this.salarioBruto <= 100) {
            this.ir = this.salarioBruto * 5 / 100 ;
        } else {
            this.ir = this.salarioBruto * 7 / 100 ;
        }
    }
    // gets
    public double getSalarioLiquido () {
        return this.salarioBruto - this.inss - this.ir;
    }
    public double getSalarioBruto () {return this.salarioBruto;}
    public double getHorasTrabalhadas () {return this.horasTrabalhadas;}
    public double getINSS () {return this.inss;}
    public double getIR () {return this.ir;}
}