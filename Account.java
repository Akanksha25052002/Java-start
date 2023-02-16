class Amount{
private int acno,balance;
private String acname,actype;

Amount (int acno,String acname,String actype, int bal)
{
this.acno=acno;
this.acname=acname;
this.actype=actype;
balance=bal;
}
void deposit(int amt){
balance+=amt;
System.out.println("Amount deposited: "+balance);
}
void withdrawl(int amt){
{
if(balance>amt){
balance-=amt;
System.out.println("Amount withdrawl: "+balance);
}
else{
System.out.println("Not enough balance");
}
}
}
void statement(){
System.out.println(acno+"\t"+acname+"\t"+actype+"\t"+balance);
}
}

public class Account{
public static void main(String args[]){
Amount ac1=new Amount(1001,"sujit","s",23000);
Amount ac2=new Amount(1002,"Aman","s",80000);

ac1.deposit(4500);
ac1.deposit(5000);
ac2.deposit(1000);
ac2.withdrawl(50000);
ac1.statement();
ac2.statement();
}
}

