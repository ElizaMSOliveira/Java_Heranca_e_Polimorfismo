public non-sealed class Seller extends Employee {
    private int vendas;

    @Override
    public boolean adm() {
        return false;
    }
    public int consultarVendas() {
        return this.vendas;
    }
    public void vendas() {
        this.vendas += 1;

    }
}
