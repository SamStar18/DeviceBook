package com.devicebook.devicebook.activities;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.devicebook.devicebook.database.AdminDatabase;
import com.devicebook.devicebook.R;

public class AdminLogIn extends AppCompatActivity {
    SQLiteDatabase mDatabase;
    private AdminDatabase dbHelper;

    EditText adminusername;
    EditText adminpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dbHelper = new AdminDatabase(AdminLogIn.this);
        mDatabase = dbHelper.getReadableDatabase();

        adminusername = findViewById( R.id.adminusername);
        adminpassword = findViewById(R.id.adminpassword);
    }
    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent menuintent = new Intent(AdminLogIn.this,DisplayGridActivity.class);
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }

    public boolean adminloginbutton(View view) {

        String usernamechecker = "admin";
        String passwordchecker = "Password";

        //String musername  = adminusername.getText().toString();
        //String mpassword  = adminpassword.getText().toString();
        //String usernamechecker = String.valueOf(dbHelper.checkAdmin(musername));
        //String passwordchecker = String.valueOf(dbHelper.checkPassword(mpassword));

        if(adminusername.getText().toString().contentEquals(usernamechecker) && adminpassword.getText().toString().contentEquals(passwordchecker)) {
            Intent LogIntent = new Intent(AdminLogIn.this, AdminActivity.class);

            emptynametext();
            startActivity(LogIntent);
        }
        else if(adminusername.getText().toString().isEmpty() || adminpassword.getText().toString().isEmpty()){
            Toast.makeText(AdminLogIn.this,"Field is empty" , Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            Toast.makeText(AdminLogIn.this,"Username or Password not recognised " , Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void emptynametext() {
        adminusername.setText(null);
        adminpassword.setText(null);
        dbHelper = new AdminDatabase(AdminLogIn.this);


    }

}
