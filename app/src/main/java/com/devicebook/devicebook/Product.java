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
    String phonecaptionlists[] = {"Phone Repair", "Tablets Repair", "Booking Details", "Contact us"};

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


        String mobilephoneselection = adapterView.getItemAtPosition(0).toString();
        String tabletselection = adapterView.getItemAtPosition(1).toString();
                String laptopselection = adapterView.getItemAtPosition(2).toString();
                String gemeselection = adapterView.getItemAtPosition(3).toString();

                if(phonecaptionlists[i]  == mobilephoneselection){
                    startActivity(new Intent(Product.this,phone_avtivity.class));
                }
                else if(phonecaptionlists[i] == tabletselection){
                    startActivity(new Intent(Product.this,tablet_activity.class));
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
