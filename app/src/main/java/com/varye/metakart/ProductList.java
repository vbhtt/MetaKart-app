package com.varye.metakart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
