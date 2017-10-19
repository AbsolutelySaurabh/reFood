package com.appsomniac.refood.dummy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.appsomniac.refood.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Radapter extends RecyclerView.Adapter<RviewHolder> {

    public static ArrayList<String> image_uris;
    public Context context;
    public static String movieORtv;

    public Radapter(Context context, ArrayList<String> image_uris, String movieORtv) {

        this.context = context;
        this.image_uris = image_uris;
        this.movieORtv = movieORtv;
    }

    @Override
    public RviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new RviewHolder(LayoutInflater.from(parent.getContext()), parent, image_uris, context);

    }

    @Override
    public void onBindViewHolder(RviewHolder holder, int position) {

        String Imag1 = image_uris.get(position);
        //holder.iv.setImageURI(Uri.parse(Imag1));

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.ic_online_courses_24dp);
        requestOptions.error(R.drawable.ic_online_courses_24dp);

        Glide.with(context).load(Imag1)
                .apply(requestOptions).thumbnail(0.5f).into(holder.media_poster);


        Log.e("position holder: ", String.valueOf(position));

    }
    @Override
    public int getItemCount() {

        return image_uris.size();

    }

}
