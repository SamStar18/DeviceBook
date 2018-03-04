package com.devicebook.devicebook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class displayActivity extends AppCompatActivity {

    ListView customerListView;

    mydbhandler dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    //this bellow adds the back button
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button csConfirmButton = findViewById(R.id.csConfirmButton);
        Button editbutton1 = findViewById(R.id.csEditButton1);
        Button editbutton2 = findViewById(R.id.csEditButton2);
        Button csDeleteButton1 = findViewById(R.id.csDeleteButton1);
        Button csDeleteButton2 = findViewById(R.id.csDeleteButton1);

    Intent csdetailsintent = getIntent();



       String csid = "id";

        String  csfname = csdetailsintent.getStringExtra("csfname");
        String cslname = csdetailsintent.getStringExtra("cslname");
        String csemail = csdetailsintent.getStringExtra("csemail");
        String csaddress = csdetailsintent.getStringExtra("csaddress");
        String cscity = csdetailsintent.getStringExtra("cscity");
        String cscountry = csdetailsintent.getStringExtra("cscountry");



        String csdeviceType = csdetailsintent.getStringExtra("csdeviceintent2");
        String csbrand = csdetailsintent.getStringExtra("csbrandintent2");
        String csmodel = csdetailsintent.getStringExtra("csmodelintent2");
        String csfault = csdetailsintent.getStringExtra("csfaultintent2");
        String cscolor = csdetailsintent.getStringExtra("cscolorintent2");
        String cscollection = csdetailsintent.getStringExtra("cscollectionintent2");








        display_object_adapter csObject = new display_object_adapter(csid,csfname,cslname,csemail,csaddress,cscity,cscountry,editbutton1,csDeleteButton1,csdeviceType,csbrand,csmodel,csfault,cscolor,cscollection,editbutton2,csDeleteButton2,csConfirmButton);


        ArrayList<display_object_adapter> customerArray = new ArrayList<>();
customerArray.add(csObject);




        customerListView = findViewById(R.id.customerListView);

        custom_csdetail_adapter csadapter = new custom_csdetail_adapter (this, R.layout.customerdisplay_adapter, customerArray);
        customerListView.setAdapter(csadapter);
    }

    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent menuintent = new Intent(displayActivity.this,Product.class);
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }





}
