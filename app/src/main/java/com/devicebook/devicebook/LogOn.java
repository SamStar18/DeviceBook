package com.devicebook.devicebook;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LogOn extends AppCompatActivity {

    EditText nameEntry;
    private mydbhandler dbHelper;
    Button nameEntryButton;
    SQLiteDatabase mDatabase;
    public Boolean namereturn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_on);

        dbHelper = new mydbhandler(LogOn.this);
        mDatabase = dbHelper.getReadableDatabase();

        nameEntryButton = findViewById(R.id.nameEntryButton);
        nameEntry = findViewById(R.id.nameEntry);

        // final ArrayList<display_order_method> customerObject = dbHelper.findCustomer();

    }

    public Boolean entrycheck(View view) {
        String namechecker = nameEntry.getText().toString();
        boolean namecheck =dbHelper.checkcustomer(namechecker) ;
dbHelper.findCustomer();

boolean mynamecheck = dbHelper.checkcustomer(namechecker).equals(dbHelper.findCustomer());

        if (namechecker.isEmpty()) {
            Toast.makeText(LogOn.this, "Cannot retrieve data ", Toast.LENGTH_SHORT).show();
            return false;

        }

        else if(mynamecheck) {
            Intent LogIntent = new Intent(LogOn.this, Display_Order_Activity.class);

            LogIntent.putExtra("Name", nameEntry.getText().toString().trim());
            emptynametext();
            startActivity(LogIntent);
        }

        else {
            Toast.makeText(LogOn.this, "Cannot retrieve data ", Toast.LENGTH_SHORT).show();
            return false;
        }


        return true;
    }

    private void emptynametext() {
        nameEntry.setText(null);
        dbHelper = new mydbhandler(LogOn.this);
        String empty = "";


        //if (nameEntry.getText().toString().contentEquals(csname)) {


    }
}