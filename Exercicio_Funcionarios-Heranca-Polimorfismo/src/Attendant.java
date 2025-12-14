public non-sealed class Attendant extends Employee {
    private double valorCaixa;
    //private boolean adm = false;

    @Override
    public boolean adm() {
        return false;
    }
    public void receberPagamento(double valor) {
        this.valorCaixa += valor;
    }
    public  double fecharCaixa(){
        return  this.valorCaixa;
    }

}
