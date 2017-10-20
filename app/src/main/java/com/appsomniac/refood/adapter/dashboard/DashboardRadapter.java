package com.appsomniac.refood.adapter.dashboard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.appsomniac.refood.R;
import com.appsomniac.refood.adapter.uploadActivity.RviewHolder;
import com.appsomniac.refood.model.FoodPost;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DashboardRadapter extends RecyclerView.Adapter<DashboardRviewholder> {

    public static ArrayList<FoodPost> all_posts;
    public Context context;

    public DashboardRadapter(Context context, ArrayList<FoodPost> all_posts) {

        this.context = context;
        this.all_posts = all_posts;
    }

    @Override
    public DashboardRviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new DashboardRviewholder(LayoutInflater.from(parent.getContext()), parent, context);

    }

    @Override
    public void onBindViewHolder(DashboardRviewholder holder, int position) {

        try {
            Bitmap image = decodeFromFirebaseBase64(all_posts.get(position).getAl_imageEncoded().get(0));
            holder.item_image.setImageBitmap(image);

        } catch (IOException e) {
            e.printStackTrace();
        }

        String postedBy = all_posts.get(position).getFoodPostedByName();
        String contact = all_posts.get(position).getContact();

        holder.postedBy.setText(postedBy);
        holder.contact.setText(contact);

        Log.e("position holder: ", String.valueOf(position));

    }

    public static Bitmap decodeFromFirebaseBase64(String image) throws IOException {
        byte[] decodedByteArray = android.util.Base64.decode(image, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(decodedByteArray, 0, decodedByteArray.length);
    }

    @Override
    public int getItemCount() {

        return all_posts.size();

    }

}
