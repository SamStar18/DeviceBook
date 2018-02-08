package com.devicebook.devicebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class displayActivity extends AppCompatActivity {

    ListView customerListView;

    private TextView csName;
    private TextView csPhoneNumber;
    private TextView csEmail;
    private TextView csAddress;
    private TextView csCity;
    private TextView csCountry;

    private TextView csDeviceType;
    private TextView csBrand;
    private TextView csModel;
    private TextView csFault;
    private TextView csColor;
    private TextView csRecieveMethod;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        csName = findViewById(R.id.csName);
        csPhoneNumber = findViewById(R.id.csPhoneNumber);
        csEmail = findViewById(R.id.csEmail);
        csAddress = findViewById(R.id.csAddress);
        csCity = findViewById(R.id.csCity);
        csCountry = findViewById(R.id.csCountry);

       csDeviceType = findViewById(R.id.csdeviceType);
        csModel = findViewById(R.id.csModel);
        csBrand = findViewById(R.id. csBrand);
        csFault = findViewById(R.id.csFault);
        csColor = findViewById(R.id.csColor);
        csRecieveMethod = findViewById(R.id.csRecieveMethod);

    Intent csdetailsintent = getIntent();


        String  csname = csdetailsintent.getStringExtra("csname");
        String csmobile = csdetailsintent.getStringExtra("csmobile");
        String csemail = csdetailsintent.getStringExtra("csemail");
        String csaddress = csdetailsintent.getStringExtra("csaddress");
        String cscity = csdetailsintent.getStringExtra("cscity");
        String cscountry = csdetailsintent.getStringExtra("cscountry");



        String csdeviceType = csdetailsintent.getStringExtra("csdeviceintent2");
        String csmodel = csdetailsintent.getStringExtra("csmodelintent2");
        String csbrand = csdetailsintent.getStringExtra("csbrandintent2");
        String csfault = csdetailsintent.getStringExtra("csfaultintent2");
        String cscolor = csdetailsintent.getStringExtra(" cscolorintent2");
        String cscollection = csdetailsintent.getStringExtra("cscollectionintent2");








        display_object_adapter csObject = new display_object_adapter(csname,csmobile,csemail,csaddress,cscity,cscountry,csdeviceType,csmodel,csbrand,csfault,cscolor,cscollection);


        ArrayList<display_object_adapter> customerArray = new ArrayList<>();
customerArray.add(csObject);




        customerListView = findViewById(R.id.customerListView);

        custom_csdetail_adapter csadapter = new custom_csdetail_adapter (this, R.layout.customerdisplay_adapter, customerArray);
        customerListView.setAdapter(csadapter);
    }
}
