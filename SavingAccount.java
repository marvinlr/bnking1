public class SavingAccount extends Account {
  private double interestRate;
  public SavingAccount(double interestRate,double balance){
    super(balance);
    this.interestRate=interestRate;
  }
 
  public double getInterestRate(){
      return interestRate;
  }
  
    public String toString() {
         return "con saldo de "+balance+" con una tasa de interes de " +interestRate+"%";
    }
        
}
