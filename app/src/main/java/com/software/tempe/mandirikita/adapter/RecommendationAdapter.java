package com.software.tempe.mandirikita.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.software.tempe.mandirikita.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecommendationAdapter extends RecyclerView.Adapter<RecommendationAdapter.ViewAdapter> {


    private ArrayList<String> imgName = new ArrayList<>();
    private ArrayList<String> imgPrice = new ArrayList<>();
    private ArrayList<String> imgLink = new ArrayList<>();

    private Context context;

    public RecommendationAdapter(ArrayList<String> imgName, ArrayList<String> imgPrice, ArrayList<String> imgLink, Context context) {
        this.imgName = imgName;
        this.imgPrice = imgPrice;
        this.imgLink = imgLink;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recommendation_item, viewGroup, false);
        return new ViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter viewAdapter, int i) {
        int count = 0;

        viewAdapter.content_desc.setText(imgName.get(i));
        viewAdapter.content_price.setText(imgPrice.get(i));

        Picasso.get()
                .load(imgLink.get(i))
                .into(viewAdapter.itemImgView);
    }

    @Override
    public int getItemCount() {
        return imgName.size();
    }

    public class ViewAdapter extends RecyclerView.ViewHolder {
        ImageView itemImgView;
        TextView content_desc;
        TextView content_price;
        ProgressBar loading_image;


        public ViewAdapter(@NonNull View itemView) {
            super(itemView);

            itemImgView = itemView.findViewById(R.id.itemImgView);
            content_desc = itemView.findViewById(R.id.content_desc);
            content_price = itemView.findViewById(R.id.content_price);
            loading_image = itemView.findViewById(R.id.loading_image);
        }
    }
}
