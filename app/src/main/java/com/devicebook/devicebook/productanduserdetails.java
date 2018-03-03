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
    private EditText fname;
    private EditText lname;
    private EditText address1;
    private EditText city;
    private EditText email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productanduserdetails);




        countrySpinner = findViewById(R.id.countrySpinner);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
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

    public void padbuttonpressed (View view){



        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if(fname.getText().toString().contentEquals("")){
           Toast.makeText(productanduserdetails.this,"Please Enter your Full Name " , Toast.LENGTH_SHORT).show();
            return;
        }
        else if(lname.getText().toString().contentEquals("")){
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

            Intent bookingdetailsintent = getIntent();

            String csdeviceType = bookingdetailsintent.getStringExtra("csdeviceType");
            String csmodel = bookingdetailsintent.getStringExtra("csmodel");
            String csbrand = bookingdetailsintent.getStringExtra("csbrand");
            String csfault = bookingdetailsintent.getStringExtra("csfault");
            String cscolor = bookingdetailsintent.getStringExtra("cscolor");
            String cscollection = bookingdetailsintent.getStringExtra("cscollection");




            Intent csdetailsintent = new Intent(getApplicationContext(),displayActivity.class);

            csdetailsintent.putExtra("csfname",fname.getText().toString());
            csdetailsintent.putExtra("cslname",lname.getText().toString());
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
    }
}
