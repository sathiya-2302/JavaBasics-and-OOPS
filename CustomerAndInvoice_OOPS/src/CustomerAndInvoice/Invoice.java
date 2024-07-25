package CustomerAndInvoice;

public class Invoice  {

int id;
Customer Customer;
Double Amount;
    Invoice(int id,Customer Customer,Double Amount){
        this.id= id;
       this.Customer = Customer;
       this.Amount = Amount;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return Customer;
    }
    public void setCustomer(Customer Customer){
         this.Customer=Customer;
    }
    public Double getAmount(){
        return Amount;
    }
    public void setAmount(Double Amount){
         this.Amount=Amount;
    }
    public int getCustomerId(){
        return Customer.getId();
    }
    public String getCustomerName(){
        return Customer.getName();
    }
    public int getCustomerDiscount(){
        return Customer.getDiscount();
    }
    public Double getAmountAfterDiscount(){
        Double discountValue=Amount*(Customer.getDiscount()*0.01);

        return Amount-discountValue;
    }

    public String toString() {
        return "Invoice[id=" + id + ",customer=" + Customer + ",amount=" + Amount + "]";
    }
}
