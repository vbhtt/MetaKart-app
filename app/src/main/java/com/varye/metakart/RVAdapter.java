package com.varye.metakart;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Varun on 07-03-2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ProductViewHolder> {

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        static ImageView productImage;
        static TextView productTitle;
        static TextView price;


        public ProductViewHolder(View itemView) {
            super(itemView);

            cv = (CardView) itemView.findViewById(R.id.cv);
            productImage = (ImageView) itemView.findViewById(R.id.product_image);
            productTitle = (TextView) itemView.findViewById(R.id.product_title);
            price = (TextView) itemView.findViewById(R.id.price_text);
        }
    }

    List<Product> products;
    Context context;

    RVAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context=context;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_card, viewGroup, false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Picasso.with(context).load(products.get(position).image).placeholder(R.drawable.stock).into(ProductViewHolder.productImage);
        ProductViewHolder.productTitle.setText(products.get(position).name);
        ProductViewHolder.price.setText(String.format("Rs. %s",products.get(position).price));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
