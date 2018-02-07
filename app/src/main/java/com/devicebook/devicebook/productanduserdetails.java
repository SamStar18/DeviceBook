package com.devicebook.devicebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    private EditText name;
    private EditText mobileHint;
    private EditText address1;
    private EditText city;
    private EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productanduserdetails);

        countrySpinner = (Spinner) findViewById(R.id.countrySpinner);
        name = (EditText) findViewById(R.id.name);
        mobileHint = (EditText) findViewById(R.id.mobileHint);
        address1 = (EditText)findViewById(R.id.address1);
        city = (EditText) findViewById(R.id.city);
        email = (EditText) findViewById(R.id.email);

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

    public void padbuttonpressed (View view){



        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if(name.getText().toString().contentEquals("")){
           Toast.makeText(productanduserdetails.this,"Please Enter your Full Name " , Toast.LENGTH_SHORT).show();
            return;
        }
        else if(mobileHint.getText().toString().contentEquals("")){
            Toast.makeText(productanduserdetails.this,"Please Enter your Mobile Number " , Toast.LENGTH_SHORT).show();
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
            startActivity(new Intent(productanduserdetails.this,displayActivity.class));
        }
    }
}
