package com.devicebook.devicebook;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        ListView display_order_listview;
        deleteButton = findViewById(R.id.deleteOrder);
//add to database
dbHelper = new mydbhandler(Display_Order_Activity.this);
        //display data in listview
        Intent LogIntent = getIntent();
String findName = LogIntent.getStringExtra("Name");
         mDatabase = dbHelper.getWritableDatabase();
        mDatabase = dbHelper.getWritableDatabase();




       ArrayList listCustomers = new ArrayList<>();
       listCustomers.clear();
       listCustomers.addAll(dbHelper.findCustomer(findName));


        display_order_listview = findViewById(R.id.display_order_listview);
        customer_order_adapter orderAdapter = new customer_order_adapter(this, R.layout.display_order, listCustomers);
        display_order_listview.setAdapter(orderAdapter);




    }

    public void delete(View view){
        Intent gotoalter = new Intent(Display_Order_Activity.this,deleteandupdate.class);
        startActivity(gotoalter);
    }


    }








