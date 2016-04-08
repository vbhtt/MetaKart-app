package com.varye.metakart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void elexCardClick(View view) {
        Intent intent = new Intent(this, ProductList.class);
        intent.putExtra("category","electronics");
        startActivity(intent);
    }
    public void fashionCardClick(View view) {
        Intent intent = new Intent(this, ProductList.class);
        intent.putExtra("category","fashion");
        startActivity(intent);
    }
    public void bookCardClick(View view) {
        Intent intent = new Intent(this, ProductList.class);
        intent.putExtra("category","books");
        startActivity(intent);
    }
    public void gameCardClick(View view) {
        Intent intent = new Intent(this, ProductList.class);
        intent.putExtra("category","games");
        startActivity(intent);
    }
}
