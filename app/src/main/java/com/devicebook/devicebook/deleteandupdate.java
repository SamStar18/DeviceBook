package com.devicebook.devicebook;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class deleteandupdate extends AppCompatActivity {
SQLiteDatabase mDatabase;
mydbhandler dbHelper;
Button alterDelete;
EditText alterEntry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleteandupdate);
        //this bellow adds the back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        alterDelete = findViewById(R.id.alterDeleteButton);
//add to database
        dbHelper = new mydbhandler(deleteandupdate.this);
        mDatabase = dbHelper.getWritableDatabase();

        alterEntry= findViewById(R.id.alterEntry);

    }
    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent menuintent = new Intent(deleteandupdate.this,Product.class);

        startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }

    public Boolean alterDelete(View view){


        String entry = alterEntry.getText().toString();

 if(entry.isEmpty()) {
            Toast.makeText(deleteandupdate.this, "Table doesnt exist ", Toast.LENGTH_SHORT).show();
            return false;
        }

         else if((dbHelper.checkcustomerdelete(entry))){
            dbHelper.deletecustomer(entry);

            Toast.makeText(deleteandupdate.this, "Table Deleted ", Toast.LENGTH_SHORT).show();
            Intent returntodatabase = new Intent(deleteandupdate.this,Product.class);
            startActivity(returntodatabase);

        }


        else {
             Toast.makeText(deleteandupdate.this, "Table doesnt exist ", Toast.LENGTH_SHORT).show();
             return false;

         }






return true;
    }
}
