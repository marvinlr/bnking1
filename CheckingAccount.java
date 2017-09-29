public class CheckingAccount extends Account {
   private double overdraftProtection;
   private String date;
   public  CheckingAccount(double balance) {
  super(balance);
  date=" y sin proteccion sobregiros";
}
    public  CheckingAccount(double balance, double overdraftProtection) {
    super(balance);
    this.overdraftProtection=overdraftProtection;
    date=" "+getOverdraftProtection()+" en la sobreproteccion de sobregiros";
}  
    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public String getDate() {
        return date;
    }
   
    public boolean whithdrawl(double amt){
    if(balance>amt){
        super.whithdraw(amt);
     return true;   
    }
    else if (balance<amt&&balance+overdraftProtection>amt){
        setOverdraftP(amt);
        super.whithdraw(super.getBalance());
     return true;   
    }
    else{
     return false;   
    }
   }
    public double setOverdraftP(double amt){
    return overdraftProtection=-(amt-super.getBalance());
}   
}
