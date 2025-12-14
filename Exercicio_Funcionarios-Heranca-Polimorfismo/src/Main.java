/**Crie uma hierarquia de classe que definam os tipos de usuários de um sistema, use os seguintes requisitos:
- Classe Gerente que terá os seus atributos: Nome, Email, Senha, e um atributo que informa se ele é administrados, esse
ultimo dese ser semre verdadeiro.
- Classe vendedos qie terá os seguintes atributos; Nome, Email, Senha, Quantidade de Vendas e um atributo que informa
se ele é administrados, esse ultimo deve ser semore falso.
- Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Vakir em Caixa e um atributo que informa
se ele é administrador, esse ultimo dese ser sempre falso.
 Cada Classe deve ter seus respectivéis getters e setters( para atributos que façãm sentido ter) e as classes devem
 ter os seguintes metodos:
 - A Classe Vendedor : Realizar venda(incrementar o numero de vendas quando acionados), Consultar Vendas
 A Classe Atendente :  Receber Pagamentos(onde o metodo recebe um valor que deve ser incrementado
 no valor em caiza), Fechar o caixa.*/

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Attendant attendant = new Attendant();
        Seller seller = new Seller();

        manager.setSenha("123");
        manager.setEmail("a@gmail.com");

        attendant.setSenha("456");
        attendant.setEmail("B@hotmail.com");


        //System.out.println(attendant.login("B@hotmail.com", "456"));
       // System.out.println(seller.logoff());
        //System.out.println(manager.alterarDados());
        //System.out.println(attendant.alterarSenha());
        //System.out.println(seller.consultarVendas());
       // seller.vendas();
        //seller.vendas();
        //System.out.println(seller.consultarVendas());

        attendant.receberPagamento(200);
        attendant.receberPagamento(20);
        attendant.receberPagamento(30);
        System.out.println(attendant.fecharCaixa());



    }
}
