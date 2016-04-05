package com.varye.metakart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends AppCompatActivity {

    private List<Product> productList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        initialiseData();
        initialiseAdapter();
        final GestureDetector mGestureDetector = new GestureDetector(ProductList.this, new GestureDetector.SimpleOnGestureListener() {

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });


        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (child != null && mGestureDetector.onTouchEvent(motionEvent)) {
                    Intent intent = new Intent(ProductList.this, ProductDetails.class);
                    intent.putExtra("data", productList.get(recyclerView.getChildPosition(child)));
                    startActivity(intent);
                    return true;
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }
        });
    }

    private void initialiseAdapter() {
        RVAdapter rvadapter = new RVAdapter(productList);
        recyclerView.setAdapter(rvadapter);

    }

    private void initialiseData() {
        productList = new ArrayList<>();
        productList.add(new Product("Electronic", "Sony", 125, 4.5, R.drawable.elex));
        productList.add(new Product("Book", "dcdc", 125, 3.6, R.drawable.book));
        productList.add(new Product("Fashino", "cdcdcvv", 125, 5, R.drawable.fashion));
        productList.add(new Product("Game", "EA", 125, 4.4, R.drawable.games));
    }
}
