package Bank;

public class Bank {

    public static void main(String args[]) {

        Employee emp1=new Cashier(101,"Luid", 20000.0);
        Employee emp2=new Cashier(102,"Davi", 25000.0);
        Employee emp3=new Accountant(103,"Arthur", 30000.0);
        Employee emp4=new Accountant(104,"Murilo", 40000.0);

        Employee manager=new BankManager(100,"Mariano",100000.0);

        manager.add(emp1);
        manager.add(emp2);
        manager.add(emp3);
        manager.add(emp4);

        manager.print();
    }

}
