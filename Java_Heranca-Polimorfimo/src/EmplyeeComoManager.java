public class EmplyeeComoManager {

    public static void main(String[] args) {
        //Employee manager = new Manager();
        printEmployee(new Manager());//Chamando o metodo passando um Manager
        //printEmployee(new Salesma());//Chamando o Metodo passando um Salesma
       Salesma salesma = new Salesma(); //Forma comverncional
       printEmployee(salesma);
    }

    public static void printEmployee(Employee employee) {

        System.out.printf("===%s===\n", employee.getClass().getCanonicalName());
        //Velha forma de casting
        /*   if(employee instanceof Manager) {
            employee.setNome("Eliza");
            ((Manager) employee).setLogin("liz");//Fazendo o Casting
            ((Manager) employee).setPassword("12345");*/
        //Verificar se um objeto é uma instancia de uma determinada classe
        //Nova Forma de Casting
        //if (employee instanceof Manager manager) {
            //employee.setNome("Eliza");
            //manager.setLogin("liz");//Fazendo o Casting
           // manager.setPassword("12345");

            //System.out.println(employee.getClass());
            //System.out.println(employee.getClass().getCanonicalName());
           // System.out.println(employee.getNome());
           // System.out.println(manager.getLogin());
           // System.out.println(manager.getPassword());
       // }
        switch (employee){
            case Manager manager ->{
                manager.setCode("01");
                manager.setNome("Eliza");
                manager.setSalary(5000);
                manager.setLogin("liz");
                manager.setPassword("12345");
                manager.setCommission(1200);


                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getNome());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
                System.out.println(manager.getFullSalary());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesma salesma ->{
                salesma.setCode("02");
                salesma.setNome("Maria");
                salesma.setSalary(2800);
                salesma.setPercentPerSold(10);
                salesma.setSoldAmaunt(1000);

                System.out.println(salesma.getCode());
                System.out.println(salesma.getSalary());
                System.out.println(salesma.getNome());
                System.out.println(salesma.getPercentPerSold());
                System.out.println(salesma.getFullSalary());

            }


        }
        System.out.println("==========");
    }
}
