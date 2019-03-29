/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesTrackerModel;

public class Customer {
    
    private String name = "blank";  // for some reason, making this static fucks up the Customer arraylist
    private String id = "blank";
    private String address = "blank";
    private Agent agentBooked = null;   // should probably only pass in Agent's ID for security purposes
    
    public Customer(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void bookAgent(Agent agent)
    {
        if(!agent.isBooked())
            this.bookAgent(agent);
    }

    @Override
    public String toString() {
        return "Customer: " + name;
    }
    
}
