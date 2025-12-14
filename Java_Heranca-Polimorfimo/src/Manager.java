//Essa classe herda tudo da classe Employee(Colaborador)

// Classes que estão na deia de herança como sealed elas podem ser:
//Non-sealed == permite que herdem
//Sealed == restinge quem herda
//Final == não permite que herdem
public non-sealed class Manager extends Employee {

    private String login;
    private String password;
    private double commission;
    double salarioTotal;

    public  double test(){
        return 0;
    }
    //Sobrescrevendo um metodo
    @Override
    public  double getFullSalary() {
        return salarioTotal = super.getSalary() + commission;

    }
    //Sobrecarregando o metodo
    public  double getFullSalary(double extra) {
        return salarioTotal = super.getSalary() + commission + extra;
    }

    public String getCode() {
        return "MN " + super.getCode();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
