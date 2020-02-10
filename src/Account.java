public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;
    public Account (String first,String last,double balance){
        acctNum=(int)(Math.random()*999+1);
        this.first=first;
        this.last=last;
        this.balance=balance;
    }
    public Account(Account dupaccount){
        this(dupaccount.first, dupaccount.last,dupaccount.balance);
    }
    public Account(){
        this("","",0.0);
    }
    public String getFirst(){
        return first;
    }
    public String getlast(){
        return last;
    }

    public double getBalance() {
        return balance;
    }
    public int getAcctNum() {
        return acctNum;
    }
    public void setFirst(String first){
        this.first=first;
    }
    public void setLast(String last){
        this.last=last;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void deposit (double designatedamount){
        balance+=designatedamount;
    }
    public boolean withdrawal(double designatedamount){
        if(balance-designatedamount>=0){
            balance-=designatedamount;
            return true;
        }
            else
                return false;
        }
    public String toString (){
        return "Customer Name: "+first+" "+last+"\nAccount #: "+acctNum+"\nCurrent Balance: $"+balance;
    }
}
