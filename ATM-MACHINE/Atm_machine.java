import java.util.*;
class Atm_machine{
public static void main(String args[]){
int pin, deposit, balance=2000, withdraw, amount,card,choice;
Scanner sc = new Scanner(System.in);
System.out.println("-------WELCOME TO ATM MACHINE-------");
System.out.print("Enter your card number:");
card=sc.nextInt();
if(card==15156){
System.out.print("Enter your PIN:");
pin=sc.nextInt();
if(pin==1234){
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Balance");
System.out.println("4. Exit");
System.out.print("Enter your choice:");
choice=sc.nextInt();
switch(choice){

case 1:  //Deposite 
System.out.print("Enter Deposit Amount:");
deposit=sc.nextInt();
balance+=deposit;
System.out.println("Your Current Balance is:"+balance);
break;

case 2:   //Withdraw
System.out.print("Enter Withdraw Amount:");
withdraw=sc.nextInt();
if(withdraw<=balance){
System.out.println("Successfully Withdrawal");
balance-=withdraw;
System.out.println("Your Current Balance is:"+balance);
}
else{
System.out.println("Unsufficient Balance\nYour Current Balance is:"+balance);
}
break;

case 3:   //Balance
System.out.println("Your Balance is:"+balance);
break;

case 4:    //Exit
break;

default:
System.out.println("--------Invalid Choice------");

};
}
else{
System.out.println("Enter correct PIN");
}
}
else{
System.out.println("Please enter correct Card No....");
}
}
}