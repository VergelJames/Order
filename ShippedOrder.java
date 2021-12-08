public class ShippedOrder extends Order {
    private double Charge=4.00;
    private String Choice;
   public ShippedOrder(String cname, int cnumber, int quanti){
       super(cname,cnumber,quanti);
       computePrice(Quanti,Uprice);
   }
    @Override
    public void computePrice(int quanti, double uprice){
        Tprice=quanti*uprice+Charge;            
    }
    public void display(){
        System.out.println("Customer Number >> " + Cnumber + "\n" + 
                           "Customer Name   >> " + Cname   + "\n" + 
                           "Qauntity Order  >> " + Quanti  + "\n" + 
                           "Price each      >> $"+ Uprice  + "\n" + 
                           "The cost of your order is  " + Tprice + "\n");
    }
    
    
}
