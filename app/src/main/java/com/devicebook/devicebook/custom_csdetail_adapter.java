package com.devicebook.devicebook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sam on 07/02/2018.
 */

public class custom_csdetail_adapter extends ArrayAdapter<display_object_adapter> {
    private static final String tag = "csdetailadapter";
   private Context cscontext;
    int csresource;
    LayoutInflater inflater;



    public custom_csdetail_adapter(Context context, int resource, ArrayList<display_object_adapter> objects) {
        super(context, resource, objects);
        cscontext = context;
        csresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
       String name = getItem(position).getName();
         String phoneNumber = getItem(position).getPhoneNumber();
        String email  = getItem(position).getEmail();
         String addressline1 = getItem(position).getAddressline1();
        String city = getItem(position).getCity();
         String country = getItem(position).getCountry();

         Button editbutton1 = getItem(position).getEditbutton1();

     String csdeviceType = getItem(position).getCsdeviceType();
     String csdeviceModel= getItem(position).getCsdeviceModel();
     String csdeviceBrand  = getItem(position).getCsdeviceBrand();
     String csfaultspinner = getItem(position).getCsfaultspinner();
     String cscolorspinner = getItem(position).getCscolorspinner();
     String csCollectionOptions = getItem(position).getCsCollectionOptions();

     Button edibutton2 = getItem(position).getEditbutton2();
     Button csConfirmButton = getItem(position).getCsConfirmButton();

        
        inflater = LayoutInflater.from(cscontext);
        convertView = inflater.inflate(csresource,parent,false);



        final EditText tvname = convertView.findViewById(R.id.csName);
        final EditText tvnumber = convertView.findViewById(R.id.csPhoneNumber);
        final EditText tvemail = convertView.findViewById(R.id.csEmail);
        final EditText tvaddress = convertView.findViewById(R.id.csAddress);
        final  EditText tvcity = convertView.findViewById(R.id.csCity);
        final  EditText  tvcountry = convertView.findViewById(R.id.csCountry);
        final Button btn1 = convertView.findViewById(R.id.csEditButton1);



        final EditText tvdevicetype = convertView.findViewById(R.id.csdeviceType);
        final EditText tvmodel = convertView.findViewById(R.id.csModel);
        final EditText tvbrand = convertView.findViewById(R.id.csBrand);
        final EditText tvfault = convertView.findViewById(R.id.csFault);
        final EditText tvcolor = convertView.findViewById(R.id.deviceColor);
        final EditText tvcollectionOptions = convertView.findViewById(R.id.deviceRecieveMethod);
        final Button btn2 = convertView.findViewById(R.id.csEditButton2);
        final Button csConfirmbtn = convertView.findViewById(R.id.csConfirmButton);


        tvname.setText(name);
        tvnumber.setText(phoneNumber);
        tvemail.setText(email);
        tvaddress.setText(addressline1);
        tvcity.setText(city);
        tvcountry.setText(country);

       

        tvdevicetype.setText(csdeviceType);
        tvmodel.setText(csdeviceModel);
        tvbrand.setText(csdeviceBrand);
        tvfault.setText(csfaultspinner);
        tvcolor.setText(cscolorspinner);
        tvcollectionOptions.setText(csCollectionOptions);


        tvname.setFocusable(false);
        tvnumber.setFocusable(false);
        tvemail.setFocusable(false);
        tvaddress.setFocusable(false);
        tvcity.setFocusable(false);
        tvcountry.setFocusable(false);
        tvdevicetype.setFocusable(false);
        tvmodel.setFocusable(false);
        tvbrand.setFocusable(false);
        tvfault.setFocusable(false);

        tvcolor.setFocusable(false);
        tvcollectionOptions.setFocusable(false);

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        tvname.setText("Sam hey");
    }
});

btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});

csConfirmbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        
    }
});

        return convertView;


    }


}

