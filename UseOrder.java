import java.util.Scanner;
public class UseOrder {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String name,choice;
        int quanti, number;
        
        System.out.print("Enter Customer Name >> ");
        name=k.nextLine();
        System.out.print("Enter Customer Number >> ");
        number=k.nextInt();
        System.out.print("Enter Quantity Order >> ");
        quanti=k.nextInt();
        k.nextLine();
        System.out.print("Do you want to ship the order? Y/N ");
        choice=k.nextLine();
        choice=choice.toUpperCase();
        if(choice.equals("Y")){
            ShippedOrder ship=new ShippedOrder(name,number,quanti);
            ship.display();
            
        }
        else if(choice.equals("N")){
            Order ord = new Order(name,number,quanti);
            ord.display();
        }
        
        
    }
    
}
