package com.devicebook.devicebook;

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

public class tablet_activity extends AppCompatActivity {

    private Spinner tabletBrand;
    private Spinner operatingSystem;
    private Spinner tabletColor;
    private Spinner tabletFault;
    private RadioGroup tabletCollection;
    private Button tabletContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_activity);

        tabletFault = (Spinner) findViewById(R.id.tabletFault);
        tabletBrand = (Spinner) findViewById(R.id.tabletBrand);
        operatingSystem = (Spinner) findViewById(R.id.operatingSystem);
        tabletColor = (Spinner) findViewById(R.id.tabletColor);
        tabletCollection = (RadioGroup) findViewById(R.id.tabletCollection);
        tabletContinueButton = (Button) findViewById(R.id.tabletcontinueButton);

        ArrayList<String> tabletbrandarray = new ArrayList<>();
        Collections.addAll(tabletbrandarray,"Select Brand","Samsung Tablet","Toshiba Tablet","Huwawei","Apple","lg Tablet");

        ArrayList<String> tabletOsArray = new ArrayList<>();
        Collections.addAll(tabletOsArray,"Select Tablet OS","Windows ","Android","Linux");

        ArrayList<String> appleOsarray = new ArrayList<>();
        Collections.addAll(appleOsarray ,"Select Apple Os","IOS 8","IOS 9","IOS 10","IOS 10.5");

        ArrayList<String> tabletfaultarray = new ArrayList<>();
        Collections.addAll(tabletfaultarray, "", "Speaker Problem", "Will not turn on", "Broken Screen", "Water Damage", "Overheating", "Charging Problem", "Other");
        Collections.sort(tabletfaultarray);

        ArrayList<String> tabletcolorArray = new ArrayList<>();
        Collections.addAll(tabletcolorArray, "", "Red", "Black", "White", "Grey", "Rose Gold", "Grey");
        Collections.sort(tabletcolorArray);

        ArrayAdapter<String> brandAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, tabletbrandarray);

       brandAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        final ArrayAdapter<String> tabletosAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, tabletOsArray);

        tabletosAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        final ArrayAdapter<String> appleosAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, appleOsarray);

       appleosAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        ArrayAdapter<String> tabletfaultAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, tabletfaultarray);

        tabletfaultAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);



        ArrayAdapter<String> tabletcolorAdapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,  tabletcolorArray);

        tabletcolorAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);

       tabletFault.setAdapter(tabletfaultAdapter);
        tabletColor.setAdapter(tabletcolorAdapter);
        tabletBrand.setAdapter(brandAdapter);

        tabletBrand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String selectedtablet = tabletBrand.getSelectedItem().toString();

                if(selectedtablet.contentEquals("Apple")){
                    operatingSystem.setAdapter(appleosAdapter);
                }
                else {
                    operatingSystem.setAdapter(tabletosAdapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void tabletContinueButtonPressed(View view){


        Toast mytoast = null;

        if(tabletFault.getSelectedItem().toString().contentEquals("")){
            mytoast.makeText(tablet_activity.this,"Please Select a fault " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(tabletColor.getSelectedItem().toString().contentEquals("")){
            mytoast.makeText(tablet_activity.this,"Please Select device color " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else if(tabletCollection.getCheckedRadioButtonId() == -1){
            mytoast.makeText(tablet_activity.this,"Please Select a collection option " ,Toast.LENGTH_SHORT).show();
            return;
        }
        else{

        }


    }
}
