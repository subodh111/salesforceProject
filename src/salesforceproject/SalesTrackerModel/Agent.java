package SalesTrackerModel;

import java.util.ArrayList;
import java.util.List;

public class Agent {
    private List<Customer> customersDealtWith;
    private int sales = -1;
    private String name = "blank";
    private String number = "blank";
    private boolean booked = false;
    
    public Agent(String name)
    {
        this.name = name;
        customersDealtWith = new ArrayList<>();
    }
    
    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void customerHelped(Customer customer){
        customersDealtWith.add(customer);
    }

    public List<Customer> getCustomersDealtWith() {
        return customersDealtWith;
    }

    public void setCustomersDealtWith(List<Customer> customersDealtWith) {
        this.customersDealtWith = customersDealtWith;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Agent{" + "customersDealtWith=" + customersDealtWith + ", sales=" + sales + ", name=" + name + ", number=" + number + '}';
    }
    
    
}