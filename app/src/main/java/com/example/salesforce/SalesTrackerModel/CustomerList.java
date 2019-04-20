package com.example.salesforce.SalesTrackerModel;

/**
 *
 * @author Tim
 */

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import java.util.List;

public class CustomerList implements Parcelable {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static List<Customer> customerList;


    protected CustomerList(Parcel in) {
        in.readList(customerList, CustomerList.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(customerList);
    }

    public static final Creator<CustomerList> CREATOR = new Creator<CustomerList>() {
        @Override
        public CustomerList createFromParcel(Parcel in) {
            return new CustomerList(in);
        }

        @Override
        public CustomerList[] newArray(int size) {
            return new CustomerList[size];
        }
    };
}
