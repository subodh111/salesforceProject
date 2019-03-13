public class Agent {
    private int sales = -1;
    private String name = "blank";
    private String number = "blank";
    
    public Agent(String name)
    {
        this.name = name;
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
    
}
