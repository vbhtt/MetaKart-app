package com.varye.metakart;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

    RVAdapter(List<Product> products) {
        this.products = products;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_card, viewGroup, false);
        ProductViewHolder pvh = new ProductViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //ProductViewHolder.productImage.setImageResource(products.get(position).thumb);
        ProductViewHolder.productImage.setImageResource(R.drawable.elex);
        ProductViewHolder.productTitle.setText(products.get(position).name);
        ProductViewHolder.price.setText("Rs." + products.get(position).price);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
