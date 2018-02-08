package com.devicebook.devicebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class phone_avtivity extends AppCompatActivity {
    private Spinner deviceType;
    private Spinner deviceBrand;
    private Spinner deviceModel;
    private Spinner faultSpinner;
    private Spinner colorSpinner;
    private RadioGroup collectionOptions;
    private Button continueButton;

    // this is used to call the arrays in the string list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_avtivity);

        faultSpinner = findViewById(R.id.faultSpinner);
        deviceBrand = findViewById(R.id.deviceBrand);
        deviceModel = findViewById(R.id.deviceModel);
        colorSpinner = findViewById(R.id.colorSpinner);
        collectionOptions = findViewById(R.id.CollectionOptions);
        continueButton = findViewById(R.id.continueButton);
        deviceType = findViewById(R.id.deviceType);

        ArrayList<String> deviceArray = new ArrayList<>();
        Collections.addAll(deviceArray,"","Phone","Tablet");

        final ArrayList<String>phonebrandArray = new ArrayList<String>();
        Collections.addAll(phonebrandArray,  "Samsung", "Apple", "Lg", "Sony");

        ArrayList<String> faultArray = new ArrayList<>();
        Collections.addAll(faultArray, "", "Speaker Problem", "Will not turn on", "Broken Screen", "Water Damage", "Overheating", "Charging Problem", "Other");
        Collections.sort(faultArray);

        ArrayList<String> defaultlist = new ArrayList<>();
        defaultlist.add("");

        ArrayList<String> samsungArray = new ArrayList<>();
        Collections.addAll(samsungArray,  "Samsung Galaxy S8", "Samsung Galaxy S7", "Samsung Galaxy S6", "Samsung Galaxy S5", "Samsung Galaxy A4", "Samsung Galaxy J3");

        ArrayList<String> appleArray = new ArrayList<>();
        Collections.addAll(appleArray,  "Iphone X", "Iphone 8", "Iphone 7", "Iphone 6", "Iphone 5", "Iphone SE");

        ArrayList<String> lgArray = new ArrayList<>();
        Collections.addAll(lgArray,  "Lg k10", "Lg k8", "Lg G6", "Lg G5", "Lg G4");

        ArrayList<String> sonyArray = new ArrayList<>();
        Collections.addAll(sonyArray,  "Sony XY", "Sony XZ", "Sony Z4", "Sony Z3", "Sony Z2", "Sony Z");

        ArrayList<String> colorArray = new ArrayList<>();
        Collections.addAll(colorArray, "", "Red", "Black", "White", "Grey", "Rose Gold", "Grey");
        Collections.sort(colorArray);


        ArrayAdapter<String>deviceAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,deviceArray);
        deviceAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);


        final ArrayAdapter<String> phoneBrandAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, phonebrandArray);

        phoneBrandAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);


        final ArrayAdapter<String> samsungAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, samsungArray);

        samsungAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

        final ArrayAdapter<String> appleAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, appleArray);

        appleAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

        final ArrayAdapter<String> lgAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, lgArray);

        lgAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

        final ArrayAdapter<String> sonyAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, sonyArray);

        sonyAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

        final ArrayAdapter<String> defaultadapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, defaultlist);

        ArrayAdapter<String> faultAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,faultArray);

        faultAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        ArrayAdapter<String> colorAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,  colorArray);

        colorAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);









        ArrayList<String> tabletbrandarray = new ArrayList<>();
        Collections.addAll(tabletbrandarray,"Samsung Tablet","Toshiba Tablet","Apple Tablet","Lg Tablet");

        ArrayList<String> tabletOsArray = new ArrayList<>();
        Collections.addAll(tabletOsArray,"Windows Os ","Android Os","Linux Os");

        ArrayList<String> appleOsarray = new ArrayList<>();
        Collections.addAll(appleOsarray ,"IOS 8","IOS 9","IOS 10","IOS 10.5");


        final ArrayAdapter<String> tabletbrandAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, tabletbrandarray);
        tabletbrandAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        final ArrayAdapter<String> tabletosAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, tabletOsArray);
        tabletosAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        final ArrayAdapter<String> appleosAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, appleOsarray);
        appleosAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

        deviceType.setAdapter(deviceAdapter);
        faultSpinner.setAdapter(faultAdapter);
        colorSpinner.setAdapter(colorAdapter);

        deviceType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                String selectedDevice = deviceType.getSelectedItem().toString();

                if(selectedDevice.contentEquals("Phone")){
                    deviceBrand.setAdapter(phoneBrandAdapter);
                }
                else if(selectedDevice.contentEquals("Tablet")){
                    deviceBrand.setAdapter(tabletbrandAdapter);
                }

                else
                    deviceBrand.setAdapter(defaultadapter);

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        deviceBrand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                String selectedphone = deviceBrand.getSelectedItem().toString();


                if (selectedphone.contentEquals("Samsung")) {

                    deviceModel.setAdapter(samsungAdapter);
                } else if (selectedphone.contentEquals("Apple")) {
                    deviceModel.setAdapter(appleAdapter);
                } else if (selectedphone.contentEquals("Lg")) {
                    deviceModel.setAdapter(lgAdapter);
                } else if (selectedphone.contentEquals("Sony")) {
                    deviceModel.setAdapter(sonyAdapter);
                }

                else
                    deviceModel.setAdapter(defaultadapter);

                String selectedtablet = deviceBrand.getSelectedItem().toString();

                if(selectedtablet.contentEquals("Apple Tablet")){
                    deviceModel.setAdapter(appleosAdapter);
                }
                else if(selectedtablet.contentEquals("Samsung Tablet")){
                    deviceModel.setAdapter(tabletosAdapter);
                }
                else if(selectedtablet.contentEquals("Lg Tablet")){
                    deviceModel.setAdapter(tabletosAdapter);
                }
                else if(selectedtablet.contentEquals("Toshiba Tablet")){
                    deviceModel.setAdapter(tabletosAdapter);
                }



            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void onContinueButtonPressed(View view) {



        Toast  mytoast = null;

        if(faultSpinner.getSelectedItem().toString().contentEquals("")){
            Toast.makeText(phone_avtivity.this,"Please Select a fault " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(colorSpinner.getSelectedItem().toString().contentEquals("")){
            Toast.makeText(phone_avtivity.this,"Please Select device color " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(deviceType.getSelectedItem().toString().contentEquals("")){
            Toast.makeText(phone_avtivity.this,"Please Select device type " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(deviceBrand.getSelectedItem().toString().contentEquals("")){
            Toast.makeText(phone_avtivity.this,"Please Select device brand " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(deviceModel.getSelectedItem().toString().contentEquals("")){
            Toast.makeText(phone_avtivity.this,"Please Select device model " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(collectionOptions.getCheckedRadioButtonId() == -1){
            Toast.makeText(phone_avtivity.this,"Please Select a collection option " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else{

            Intent bookingdetailsintent = new Intent(getApplicationContext(),productanduserdetails.class);
            bookingdetailsintent.putExtra("csdeviceType",deviceType.getSelectedItem().toString());
            bookingdetailsintent.putExtra("csmodel",deviceModel.getSelectedItem().toString());
            bookingdetailsintent.putExtra("csbrand",deviceBrand.getSelectedItem().toString());
            bookingdetailsintent.putExtra("csfault",faultSpinner.getSelectedItem().toString());
            bookingdetailsintent.putExtra("cscolor",colorSpinner.getSelectedItem().toString());
            bookingdetailsintent.putExtra("cscollection",collectionOptions.getCheckedRadioButtonId());




            startActivity(bookingdetailsintent);

        }

    }


}
