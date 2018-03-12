package com.devicebook.devicebook;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;


public class productanduserdetails extends AppCompatActivity {

    private Spinner countrySpinner;
    private EditText username;
    private EditText fullname;
    private EditText address1;
    private EditText city;
    private EditText email;
    SQLiteDatabase mDatabase;
    private mydbhandler dbHelper = new mydbhandler(productanduserdetails.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productanduserdetails);
//this bellow adds the back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        countrySpinner = findViewById(R.id.countrySpinner);
        username = findViewById(R.id.username);
       fullname = findViewById(R.id.fullname);
        address1 = findViewById(R.id.address1);
        city = findViewById(R.id.city);
        email = findViewById(R.id.email);

        Locale[] myLocation = Locale.getAvailableLocales();

        ArrayList<String> myCountry = new ArrayList<>();
        for (Locale locale : myLocation){

            String country = locale.getDisplayCountry();
            if(country.trim().length()>0 && !myCountry.contains(country)){
                myCountry.add(country);
            }
        }

        Collections.sort(myCountry);
        countrySpinner.setPrompt("Select Country");


        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,myCountry);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);


        countrySpinner.setAdapter(countryAdapter);










    }
    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent menuintent = new Intent(productanduserdetails.this,Product.class);
        switch (item.getItemId()) {
        case android.R.id.home:
        onBackPressed();
            return true;
        }
        startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }
    public void padbuttonpressed (View view){

        String Username = username.getText().toString();
        dbHelper.getWritableDatabase();
        dbHelper.findCustomer(Username);

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if(username.getText().toString().contentEquals("")){
           Toast.makeText(productanduserdetails.this,"Please Enter your Full Name " , Toast.LENGTH_SHORT).show();
            return;
        }



        if(dbHelper.checkusername(Username)) {
            Toast.makeText(productanduserdetails.this,"User already exists" +
                    " " , Toast.LENGTH_SHORT).show();
            emptynametext();
            return;
        }
        else if(fullname.getText().toString().contentEquals("")){
            Toast.makeText(productanduserdetails.this,"Please Enter your fullname " , Toast.LENGTH_SHORT).show();
            return;
        }

        else if(email.getText().toString().contentEquals("")){
            Toast.makeText(productanduserdetails.this,"Please Enter your Email address " , Toast.LENGTH_SHORT).show();
            return;
        }

        else if(!email.getText().toString().matches(emailPattern)){
            Toast.makeText(productanduserdetails.this,"Please Enter a valid email address " , Toast.LENGTH_SHORT).show();
            return;
        }
        else if(address1.getText().toString().contentEquals("")){
            Toast.makeText(productanduserdetails.this,"Please Enter address prefix " , Toast.LENGTH_SHORT).show();
            return;
        }


        else if(city.getText().toString().contentEquals("")){
            Toast.makeText(productanduserdetails.this,"Please Enter your city name " , Toast.LENGTH_SHORT).show();
            return;
        }
        else{

            Intent bookingdetailsintent = getIntent();

            String csdeviceType = bookingdetailsintent.getStringExtra("csdeviceType");
            String csmodel = bookingdetailsintent.getStringExtra("csmodel");
            String csbrand = bookingdetailsintent.getStringExtra("csbrand");
            String csfault = bookingdetailsintent.getStringExtra("csfault");
            String cscolor = bookingdetailsintent.getStringExtra("cscolor");
            String cscollection = bookingdetailsintent.getStringExtra("cscollection");




            Intent csdetailsintent = new Intent(getApplicationContext(),displayActivity.class);

            csdetailsintent.putExtra("csusername",username.getText().toString());
            csdetailsintent.putExtra("csfullname",fullname.getText().toString());
            csdetailsintent.putExtra("csemail",email.getText().toString());
            csdetailsintent.putExtra("csaddress",address1.getText().toString());
            csdetailsintent.putExtra("cscity",city.getText().toString());
            csdetailsintent.putExtra("cscountry",countrySpinner.getSelectedItem().toString());

            csdetailsintent.putExtra("csdeviceintent2",csdeviceType);
            csdetailsintent.putExtra("csmodelintent2",csmodel);
            csdetailsintent.putExtra("csbrandintent2",csbrand);
            csdetailsintent.putExtra("csfaultintent2",csfault);
            csdetailsintent.putExtra("cscolorintent2",cscolor);
            csdetailsintent.putExtra("cscollectionintent2",cscollection);




            startActivity(csdetailsintent);

        }
        return;
    }
    private void emptynametext() {
        username.setText(null);
        dbHelper = new mydbhandler(productanduserdetails.this);
        String empty = "";


        //if (nameEntry.getText().toString().contentEquals(csname)) {


    }
}
