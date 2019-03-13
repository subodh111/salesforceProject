class Customer {
    
    private static String name = "blank";
    private static String id = "blank";
    private static String address = "blank";
    
    public Customer(String name)
    {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Customer.name = name;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Customer.id = id;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Customer.address = address;
    }
    
}
