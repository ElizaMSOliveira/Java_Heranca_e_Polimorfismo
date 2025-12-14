
public sealed abstract class Employee permits Manager, Seller, Attendant {
    private String nome;
    private String email;
    private String senha;
    private boolean adm;

    public String login(String email, String senha){
        String retorno = "";
        if((this.email).equals(email) && this.senha.equals(senha)){
            return retorno= "Login Efetuado com Sucesso!";
        }
        return retorno ="E-mail ou Senha Inválido";
    }
    public String logoff(){
        return "Logoff";
    }
    public String alterarDados(){
        return "Dados Alterados";
    }
    public String alterarSenha(){
        return "Senha Alterada";
    }

    public boolean getAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public abstract boolean adm();







}
