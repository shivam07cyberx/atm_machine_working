import java.util.*;
public class atm{
public static void main(String[] args) {
   int xx;
Scanner s=new Scanner(System.in);
System.out.println("enter your card number");
int a= s.nextInt();
if(a==1234){
    System.out.println("card verified");
    System.out.println("welcome shivam");
   System.out.println("please enter your 4 digit pin");
    int b=s.nextInt();
    if(b==6554){

System.out.println("pin verified");
System.out.println("welcome in boi atm ");
System.out.println("enter number 1. for saving a/c , 2. for currunt a/c ");
int number = s.nextInt();
int bal=1000;
int y;

switch (number) {
    case 1:
        System.out.println("saving selected");
        break;
    case 2:
        System.out.println("current selected");
        break;
  
    default:
        System.out.println("The number is neither 1, 2, nor 3");
}
System.out.println("press 1. for withdrow money");
System.out.println("press 2. for view balence");
int numb = s.nextInt();



switch (numb) {
    case 1:
   
        System.out.println("enter amount");

       int c=s.nextInt();
       if(c>bal){
        System.out.println("in sufficient balence");
       }
       else{
         y=bal-c;
        System.out.println("please wait........");
        System.out.println("trangistion proceed successful"+" avilable balence is "+y);
        
        System.out.println("thank you");
      }
       
      
        break;
    case 2:
    
    
        System.out.println(" balence is "+bal);
        break;
  
    default:
        System.out.println("invalid");
}







    }
     
    else{
        System.out.println("invalid tray again");
    }



}
else{
    System.out.println("invalid card");
}


s.close();


}



}


