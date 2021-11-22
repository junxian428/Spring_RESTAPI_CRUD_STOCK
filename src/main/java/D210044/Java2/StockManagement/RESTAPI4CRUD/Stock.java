package D210044.Java2.StockManagement.RESTAPI4CRUD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
    private Integer id;
    private String name;
    private float price;
    private float quantity;

    public Stock(){

    }
    public Stock(Integer id, String name, float price, float quantity) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getQuantity() {
        return quantity;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


}
