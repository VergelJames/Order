public class Order {
    protected String Cname;
    protected int Cnumber,Quanti;
    protected double Uprice, Tprice;
    public Order(String cname,int cnumber, int quanti){
        Cname=cname;
        Cnumber=cnumber;
        Quanti=quanti;
        Uprice=32.65;
        computePrice(Quanti,Uprice);
        
       
    }
    public void computePrice(int quanti, double uprice){
        Tprice=quanti*uprice;
        
    }
     public void display(){
        System.out.println("Customer Number >> " + Cnumber + "\n" + 
                           "Customer Name   >> " + Cname   + "\n" + 
                           "Qauntity Order  >> " + Quanti  + "\n" + 
                           "Price each      >> $"+ Uprice  + "\n" + 
                           "The cost of your order is  $" + Tprice + "\n");
    }                  
    }
    

