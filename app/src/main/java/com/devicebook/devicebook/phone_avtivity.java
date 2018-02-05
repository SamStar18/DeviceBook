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

    private Spinner phoneMake;
    private Spinner phoneModel;
    private Spinner faultSpinner;
    private Spinner colorSpinner;
    private RadioGroup collectionOptions;
    private Button continueButton;

    // this is used to call the arrays in the string list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_avtivity);

        faultSpinner = (Spinner) findViewById(R.id.faultSpinner);
        phoneMake = (Spinner) findViewById(R.id.phoneMake);
        phoneModel = (Spinner) findViewById(R.id.phoneModel);
        colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        collectionOptions = (RadioGroup) findViewById(R.id.CollectionOptions);
        continueButton = (Button) findViewById(R.id.continueButton);

        final ArrayList<String> makeArray = new ArrayList<String>();
        Collections.addAll(makeArray, "Select Brand", "Samsung", "Apple", "Lg", "Sony");

        ArrayList<String> faultArray = new ArrayList<>();
        Collections.addAll(faultArray, "", "Speaker Problem", "Will not turn on", "Broken Screen", "Water Damage", "Overheating", "Charging Problem", "Other");
        Collections.sort(faultArray);
        ArrayList<String> defaultlist = new ArrayList<>();
        defaultlist.add("Model");
        ArrayList<String> samsungArray = new ArrayList<>();
        Collections.addAll(samsungArray, "Select Samsung Model", "Samsung Galaxy S8", "Samsung Galaxy S7", "Samsung Galaxy S6", "Samsung Galaxy S5", "Samsung Galaxy A4", "Samsung Galaxy J3");

        ArrayList<String> appleArray = new ArrayList<>();
        Collections.addAll(appleArray, "Select Apple Model", "Iphone X", "Iphone 8", "Iphone 7", "Iphone 6", "Iphone 5", "Iphone SE");

        ArrayList<String> lgArray = new ArrayList<>();
        Collections.addAll(lgArray, "Select Lg Model", "Lg k10", "Lg k8", "Lg G6", "Lg G5", "Lg G4");

        ArrayList<String> sonyArray = new ArrayList<>();
        Collections.addAll(sonyArray, "Select Sony Model", "Sony XY", "Sony XZ", "Sony Z4", "Sony Z3", "Sony Z2", "Sony Z");

        ArrayList<String> colorArray = new ArrayList<>();
        Collections.addAll(colorArray, "", "Red", "Black", "White", "Grey", "Rose Gold", "Grey");
        Collections.sort(colorArray);


        ArrayAdapter<String> makeAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, makeArray);

        makeAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);


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

        final ArrayAdapter<String> faultAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, faultArray);
        faultAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

        ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, colorArray);
        colorAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);


        phoneMake.setAdapter(makeAdapter);
        faultSpinner.setAdapter(faultAdapter);
        colorSpinner.setAdapter(colorAdapter);

        phoneMake.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                String selectedphone = phoneMake.getSelectedItem().toString();

                if (selectedphone.contentEquals("Samsung")) {

                    phoneModel.setAdapter(samsungAdapter);
                } else if (selectedphone.contentEquals("Apple")) {
                    phoneModel.setAdapter(appleAdapter);
                } else if (selectedphone.contentEquals("Lg")) {
                    phoneModel.setAdapter(lgAdapter);
                } else if (selectedphone.contentEquals("Sony")) {
                    phoneModel.setAdapter(sonyAdapter);
                } else
                    phoneModel.setAdapter(defaultadapter);

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void onContinueButtonPressed(View view) {



        Toast  mytoast = null;

        if(faultSpinner.getSelectedItem().toString().contentEquals("")){
            mytoast.makeText(phone_avtivity.this,"Please Select a fault " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(colorSpinner.getSelectedItem().toString().contentEquals("")){
            mytoast.makeText(phone_avtivity.this,"Please Select device color " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(collectionOptions.getCheckedRadioButtonId() == -1){
            mytoast.makeText(phone_avtivity.this,"Please Select a collection option " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            startActivity(new Intent(phone_avtivity.this,productanduserdetails.class));
        }

    }


}
