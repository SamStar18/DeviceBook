package com.devicebook.devicebook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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


        String csdeviceType;
       String csdeviceModel;
         String csdeviceBrand;
         String csfaultspinner;
        String cscolorspinner;
        String csCollectionOptions;

         csdeviceType = getItem(position).getCsdeviceType();
        csdeviceModel= getItem(position).getCsdeviceModel();
        csdeviceBrand  = getItem(position).getCsdeviceBrand();
        csfaultspinner = getItem(position).getCsfaultspinner();
        cscolorspinner = getItem(position).getCscolorspinner();
        csCollectionOptions = getItem(position).getCsCollectionOptions();


         display_object_adapter csobject = new display_object_adapter(name,phoneNumber,email,addressline1,city,country,csdeviceType,csdeviceModel,csdeviceBrand,csfaultspinner,cscolorspinner,csCollectionOptions);

        inflater = LayoutInflater.from(cscontext);
        convertView = inflater.inflate(csresource,parent,false);



        TextView tvname = convertView.findViewById(R.id.csName);
        TextView tvnumber = convertView.findViewById(R.id.csPhoneNumber);
        TextView tvemail = convertView.findViewById(R.id.csEmail);
        TextView tvaddress = convertView.findViewById(R.id.csAddress);
        TextView tvcity = convertView.findViewById(R.id.csCity);
        TextView  tvcountry = convertView.findViewById(R.id.csCountry);


        TextView tvdevicetype = convertView.findViewById(R.id.csdeviceType);
        TextView tvmodel = convertView.findViewById(R.id.csModel);
        TextView tvbrand = convertView.findViewById(R.id.csBrand);
        TextView tvfault = convertView.findViewById(R.id.csFault);
        TextView tvcolor = convertView.findViewById(R.id.csColor);
        TextView tvcollectionOptions = convertView.findViewById(R.id.csRecieveMethod);



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

        return convertView;
    }
}

