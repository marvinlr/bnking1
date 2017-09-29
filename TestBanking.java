
public class TestBanking {
public static void main(String[] args) {
    Account cuenta[]= new Account[3];
    //cuenta 1
    cuenta[0]= new Account(500.00);
    cuenta[0]=new SavingAccount(3.00,cuenta[0].getBalance());
    cuenta[0]=new CheckingAccount(cuenta[0].getBalance());
    //cuenta 2
    cuenta[1]= new Account(500.00);
    cuenta[1]=new SavingAccount(0.00,cuenta[1].getBalance());
    cuenta[1]=new CheckingAccount(cuenta[1].getBalance());
    //cuenta 3
    cuenta[2]= new Account(500.00);
    cuenta[2]=new SavingAccount(0.00,cuenta[2].getBalance());
    cuenta[2]=new CheckingAccount(cuenta[2].getBalance(),500.00);
    
  System.out.println("creacion de cliente jane smith\ncreacion de cuenta de ahorros con un saldo de "
   +cuenta[0].getBalance()+" y el  3% de interes");
  
   System.out.println("\ncreacion de cliente owen bryant\ncreacion de cuenta corriente con un saldo de "
   +cuenta[1].getBalance()+""+(((CheckingAccount)cuenta[1]).getDate()));
   System.out.println("\ncreacion de cliente tim soley\ncreacion de cuenta de corriente con un saldo de "
   +cuenta[2].getBalance()+""+(((CheckingAccount)cuenta[2]).getDate() ));
   System.out.println("\ncreacion de maria soley\nmaria comparte su cuenta corriente con su esposo Tim");

    System.out.println("\nrecuperando el clinete jane smith con su cuenta de ahorros\n");
    System.out.println("retirar: 150.00:"+cuenta[0].whithdraw(150.00));
    System.out.println("retirar: 22.50:"+cuenta[0].deposit(22.50));
    System.out.println("retirar: 47.62:"+cuenta[0].whithdraw(47.62));
    System.out.println("retirar: 400.00:"+cuenta[0].whithdraw(400.00));
    System.out.println("el cliente[smith,jane] tine un saldo de "+cuenta[0].getBalance());
    System.out.println("\nrecuperando el clinete owen bryant con su cuenta corriente sin proteccion de sobregiros\n");
    System.out.println("retirar: 150.00:"+cuenta[1].whithdraw(150.00));
    System.out.println("retirar: 22.50:"+cuenta[1].deposit(22.50));
    System.out.println("retirar: 47.62:"+cuenta[1].whithdraw(47.62));
    System.out.println("retirar: 400.00:"+cuenta[1].whithdraw(400.00));
    System.out.println("el cliente[bryant,owen] tine un saldo de "+cuenta[1].getBalance());
    System.out.println("\nrecuperando el clinete tim soley con su cuenta de cheques que contienen proteccion conta sobregiros\n");
    System.out.println("retirar: 150.00:"+cuenta[2].whithdraw(150.00));
    System.out.println("depocito: 22.50:"+cuenta[2].deposit(22.50));
    System.out.println("retirar: 47.00:"+cuenta[2].whithdraw(47.62));
    System.out.println("retirar: 400.00:"+(((CheckingAccount)cuenta[2]).whithdrawl(400.00)));
    System.out.println("\nrecuperando a el clinete maria soley con su cuenta de cheques con su esposo Tim\n");
    System.out.println("deposito: 150.00"+cuenta[2].deposit(150.00));
    System.out.println("retirar: 750.00"+(((CheckingAccount)cuenta[2]).whithdrawl(750.00)));
    System.out.println("el cliente[smith,jane] tine un saldo de "+cuenta[2].getBalance());
}   
}
