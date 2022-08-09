import java.util.*;
public class ATM
{
 private double totalBal=100;
 Scanner input= new Scanner(System.in);

 public int userAccount()
 {
  System.out.println();
  System.out.print("Enter your account number : ");
  int account;
  account=input.nextInt();
  System.out.println();
  return account;
 }

 public int userPin()
 {
  System.out.print("Enter your pin number : ");
  int pin;
  pin=input.nextInt();
  System.out.println();
  return pin;
 } 

 public void startAtm()
 {
  userAccount();
  userPin();
  drawMainMenu();
 }

 public void drawMainMenu()
 {
  int selection;
  System.out.println(" *---------------------------------------*");
  System.out.println(" |***************************************|");
  System.out.println(" |---------------------------------------|");
  System.out.println(" |*|         ATM Main Menu             |*|");
  System.out.println(" |*|                                   |*|");
  System.out.println(" |*|  1 - View Account Balance..       |*|");
  System.out.println(" |*|  2 - Withdraw Funds..             |*|");
  System.out.println(" |*|  3 - Add Funds..                  |*|"); 
  System.out.println(" |*|  4 - Terminate Transaction..      |*|"); 
  System.out.println(" |---------------------------------------|");
  System.out.println(" |***************************************|");
  System.out.println(" *---------------------------------------*"); 
  System.out.print("Choice : ");
  selection = input.nextInt();
  System.out.println();

  switch(selection)
  {
   case 1:
   viewAccountInfo();
   break;
   case 2:
   withdraw();
   break;
   case 3:
   addFunds();
   break;
   case 4:
   System.out.println("Thank you for using this ATM!! GoodDay..");
  } 
 }
 
 public void viewAccountInfo()
 {
  System.out.print("Account Information : ");
  System.out.println(" - Total Balance : "+totalBal+"Rs");
  System.out.println();
  drawMainMenu();
 }

 public void deposit(int depAmount)
 {
  System.out.println("Please insert amount of your money...");
  totalBal=totalBal+depAmount;
  System.out.println();
  drawMainMenu();
 }

 public void checkNsf(int withdrawAmount)
 {
  if(totalBal - withdrawAmount < 0)
  System.out.println("\n ***ERROR!! Insufficient funds in your     Account***");
  else
      {
       totalBal=totalBal - withdrawAmount;
       System.out.println("\n***Please take your money now***");
      }
 }

 public void addFunds()
 {
  int addSelection;
  
  System.out.print("Deposit Funds : ");
  System.out.println(" 1 - 20Rs");
  System.out.println("               2 - 40Rs");
  System.out.println("               3 - 60Rs");
  System.out.println("               4 - 100Rs");
  System.out.println("               5 - Back to main menu");
  System.out.println("Choice : ");
  addSelection=input.nextInt();
  
  switch(addSelection)
  {
   case 1:
   deposit(20);
   drawMainMenu();
   break;
   case 2:
   deposit(40);
   drawMainMenu();
   break;
   case 3:
   deposit(60);
   drawMainMenu();
   break;
   case 4:
   deposit(100);
   drawMainMenu();
   break;
   case 5:
   drawMainMenu();
   break;
  }
 }

 public void withdraw()
 {
  int withdrawSelection;
  
  System.out.print("Withdraw money : ");
  System.out.println(" 1 - 20Rs");
  System.out.println("                2 - 40Rs");
  System.out.println("                3 - 60Rs");
  System.out.println("                4 - 100Rs");
  System.out.println("                5 - Back to main menu");
  System.out.print("Choice : ");
  withdrawSelection=input.nextInt();
  System.out.println();
  
  switch(withdrawSelection)
  {
   case 1:
   checkNsf(20);
   drawMainMenu();
   break;
   case 2:
   checkNsf(40);
   drawMainMenu();
   break;
   case 3:
   checkNsf(60);
   drawMainMenu();
   break;
   case 4:
   checkNsf(100);
   drawMainMenu();
   break;
   case 5:
   drawMainMenu();
   break;
  }
 }

 
  public static void main(String...args)
  {
   ATM myATM = new ATM();
   myATM.startAtm();
  }








}






















