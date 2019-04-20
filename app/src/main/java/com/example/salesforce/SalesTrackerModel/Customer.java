package com.example.salesforce.SalesTrackerModel;

import android.os.Parcel;
import android.os.Parcelable;

public class Customer implements Parcelable {
    
    private String name = "blank";
    private static String id = "blank";
    private static String address = "blank";
    
    public Customer(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Customer: " + name;
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(id);
        dest.writeString(address);
    }
}
