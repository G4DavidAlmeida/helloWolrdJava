package app;

class Pessoa {
    private double weight;

    private double height;

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double calcImc () {
        return this.weight / (this.height * this.height);
    }

    public String statusImc(double imc){
        if (imc < 18.5) {
            return "Déficit de massa corporal \n" +
            "risco de outros tipos de doença";
        } else if (imc < 25) {
            return "Massa corporal normal \n" + 
            "Baixas chances de doeças relacionadas ao peso";
        } else if (imc < 30) {
            return "Sobrepeso \n" + 
            "Risco de doenças elevado";
        } else if (imc < 35) {
            return "Obesidade leve \n" + 
            "Risco de doenças alto";
        } else if (imc < 40) {
            return "Obesidade média \n" + 
            "Risco de doenças muito alto";
        }
        else return "Obesidade mórbida, risco iminente";
    }
}