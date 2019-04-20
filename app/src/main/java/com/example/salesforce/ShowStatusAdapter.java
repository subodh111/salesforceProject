package com.example.salesforce;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class ShowStatusAdapter {
    private ArrayList<Object> list;

    public static class StatusViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public StatusViewHolder(View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.abstract_recycleview_list);
        }
    }

    public ShowStatusAdapter(ArrayList<Object> list){
        this.list = list;
    }

    public StatusViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_list, parent, false);
        StatusViewHolder statusViewHolder = new StatusViewHolder(view);
        return statusViewHolder;
    }

    public void onBindViewHolder(StatusViewHolder holder, int position) {
        Object currentItem = list.get(position);
        holder.textView.setText(currentItem.toString());
    }
}
