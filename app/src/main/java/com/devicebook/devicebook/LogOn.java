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

    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent menuintent = new Intent(LogOn.this,Product.class);

        startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }


    public Boolean entrycheck(View view) {

        String namechecker = nameEntry.getText().toString();


        dbHelper.findCustomer(namechecker);

         if(dbHelper.checkcustomer(namechecker)) {


            Intent LogIntent = new Intent(LogOn.this, Display_Order_Activity.class);

            LogIntent.putExtra("Name", nameEntry.getText().toString().trim());
            emptynametext();
            startActivity(LogIntent);

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