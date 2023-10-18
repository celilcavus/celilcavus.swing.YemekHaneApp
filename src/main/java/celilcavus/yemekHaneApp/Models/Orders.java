
package celilcavus.yemekHaneApp.Models;

import java.util.Date;


public class Orders {
    private int id;
    private int CustomerId;
    private long OrderDate;
    private float TotalAmount;

    public Orders(){
        OrderDate = new Date().getTime();
    }
    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public long getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(long OrderDate) {
        this.OrderDate = OrderDate;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }
    
}
