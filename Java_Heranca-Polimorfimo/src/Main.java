public class Main {
    public static void main(String[] args) {

        //Pai - Employee
        //Manger e Salesma Filhas
       // Employee employee = new Employee(); Definil como classe abastrata, não pode etr instancia
        Manager manager = new Manager();// Mas pela Herança eu consigo ter acesso a classe
        Client client = new Client();
        Employee manager2 = new Manager();
        //Employee employee = new Employee();

        client.setNome("Teste");
        client.setAge(20);
        client.setLogin("54321");
        client.getCommission();

       manager.setNome("Eliza");//Da Herança
        manager.setAge(46);//Da Herança
        manager.setLogin("12345");//Da classe

        manager.test();

        System.out.println("===== Manager =====");
        System.out.println(manager.getNome());
        System.out.println(manager.getAge());
        System.out.println(manager.getLogin());
        System.out.println("===== Cliente =====");
        System.out.println(client.getNome());
        System.out.println(client.getAge());
        System.out.println(client.getLogin());
        System.out.println("********** Suas Classes **********");
        System.out.println(manager.getClass());
        System.out.println(client.getClass());


    }
}
