package com.devicebook.devicebook;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Display_Order_Activity extends AppCompatActivity {

    TextView tvcsid;
    TextView tvcsname;
    TextView tvcsnumber;
    TextView tvcsemail;
    TextView tvcsaddress;
    TextView tvcscity;
    TextView tvcscountry;
    TextView tvcsdevice;
    TextView tvcsbrand;
    TextView tvcsmodel;
    TextView tvcsfault;
    TextView tvcscolor;
    TextView tvcsrecieve;

    Button deleteButton;
    mydbhandler dbHelper;
    SQLiteDatabase mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_order_view);
        //this bellow adds the back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView display_order_listview;
        deleteButton = findViewById(R.id.deleteOrder);
//add to database
dbHelper = new mydbhandler(Display_Order_Activity.this);
        //display data in listview
        Intent LogIntent = getIntent();
String findName = LogIntent.getStringExtra("Name");
         mDatabase = dbHelper.getWritableDatabase();





       ArrayList listCustomers = new ArrayList<>();
       listCustomers.clear();
       listCustomers.addAll(dbHelper.findCustomer(findName));


        display_order_listview = findViewById(R.id.display_order_listview);
        customer_order_adapter orderAdapter = new customer_order_adapter(this, R.layout.display_order, listCustomers);
        display_order_listview.setAdapter(orderAdapter);




    }

    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent menuintent = new Intent(Display_Order_Activity.this,Product.class);
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }

    public void delete(View view){
        Intent gotoalter = new Intent(Display_Order_Activity.this,deleteandupdate.class);
        startActivity(gotoalter);
    }


    }








