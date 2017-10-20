package com.appsomniac.refood.adapter.dashboard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appsomniac.refood.R;

import java.util.ArrayList;

public class DashboardRviewholder extends RecyclerView.ViewHolder {

    public ImageView item_image;
    public TextView postedBy;
    public TextView contact;

    public Context mContext;

    public DashboardRviewholder(LayoutInflater inflater, ViewGroup parent,  Context context) {

        super(inflater.inflate(R.layout.item_dashboard, parent, false));
        item_image = itemView.findViewById(R.id.item_image);
        contact = itemView.findViewById(R.id.contact);
        postedBy = itemView.findViewById(R.id.posted_by);

        this.mContext = context;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){


            }
        });
    }
}