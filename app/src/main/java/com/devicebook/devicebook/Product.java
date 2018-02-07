package com.devicebook.devicebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Collections;

public class Product extends AppCompatActivity {

    GridView gridView;

String listcaption;
    String phonecaptionlists[] = {"Device Repair", "Other Services", "Booking Details", "About Devicebook"};


    int deviceImages[] = {R.drawable.phonerepair2, R.drawable.tabletrepair, R.drawable.bookingdetails, R.drawable.contactus};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        gridView = (GridView) findViewById(R.id.productView);


        final Custom_Grid_Adapter adapter = new Custom_Grid_Adapter(Product.this, deviceImages, phonecaptionlists);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        String deviceselection = adapterView.getItemAtPosition(0).toString();



                if(phonecaptionlists[i]  == deviceselection){
                    startActivity(new Intent(Product.this,phone_avtivity.class));
                }



            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.product_menu, menu);
        return true;
    }

    public void productselected(View view) {


    }
}
