package com.varye.metakart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Intent intent = getIntent();
        Product p = (Product) intent.getSerializableExtra("data");

        ImageView productImageView = (ImageView) findViewById(R.id.header_image_view);
        Picasso.with(ProductDetails.this).load(p.image).fit().centerCrop().placeholder(R.drawable.elex).into(productImageView);

        TextView title = (TextView) findViewById(R.id.title_tv);
        assert title != null;
        title.setText(p.name);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        assert ratingBar != null;
        ratingBar.setRating(Float.parseFloat(p.rating));

        TextView description = (TextView) findViewById(R.id.description);
        assert description != null;
        description.setText(p.description);
    }
}
