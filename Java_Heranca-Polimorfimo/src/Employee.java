//Superclasse da Hierarquia/ Classe Pai
//Se usar final ela não poderá ter herdeiros. Para tal, define ela como sealed passando quais que tem permissão
//Abstract não ter istancia
//Sealed delimita as classes que podem herdar dela suando a permits
public sealed abstract class Employee permits Manager, Salesma{
    private String code;
    private String nome;
    private String adress;
    private int age;
    private double salary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }
    // Um metodo abastrato não pode ter corpo
    // A responsabilidade de implementar é de quem chama ele
    public abstract double getFullSalary();
}
