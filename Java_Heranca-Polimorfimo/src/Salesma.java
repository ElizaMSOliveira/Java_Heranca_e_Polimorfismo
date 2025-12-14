//Essa classe herda tudo da classe Employee(Colaborador)
//
public non-sealed class Salesma extends Employee {
    private double percentPerSold;
    private double soldAmaunt;
    double salarioTotal;

    //Sobrescrevendo um metodo
    @Override
    public String getCode() {
        return "SL " + super.getCode();
    }
    @Override
    public double getFullSalary() {
        return salarioTotal = super.getSalary() +  (soldAmaunt * percentPerSold)/100;
    }
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmaunt() {
        return soldAmaunt;
    }

    public void setSoldAmaunt(double soldAmaunt) {
        this.soldAmaunt = soldAmaunt;
    }
}
