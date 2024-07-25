package CustomerAndInvoice;

public class Customer {
    int id;
    String Name;
    int Discount;

    Customer(int id,String Name,int Discount){
        this.id=id;
        this.Name=Name;
        this.Discount=Discount;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getDiscount(){
        return Discount;
    }
    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }
    public String toString(){
        return Name+"("+id+")"+"("+Discount+"%)";
    }
}
