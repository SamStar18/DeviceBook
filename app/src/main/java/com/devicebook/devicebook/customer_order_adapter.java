package com.devicebook.devicebook;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sam on 20/02/2018.
 */

public class customer_order_adapter extends ArrayAdapter<display_order_method> {
    mydbhandler dbHelper;
    private Context cscontext;
    int csresource;
    LayoutInflater myinflater;
SQLiteDatabase mdatabase;
    ArrayList<display_order_method> customerlist;

    TextView tvcsid;
    TextView tvcsname;
    TextView tvcsnumber;
    TextView tvcsemail;
    TextView tvcsaddress;
    TextView tvcscity;
    TextView tvcscountry;
    TextView tvcsdevice;
    TextView tvcsbrand;
    TextView tvcsmodel;
    TextView tvcsfault;
    TextView tvcscolor;
    TextView tvcsrecieve;
    Button deleteOrderbtn;


    public customer_order_adapter(Context context, int resource, ArrayList<display_order_method> objects ) {
        super(context, resource, objects);
        cscontext = context;
        csresource = resource;

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        myinflater = LayoutInflater.from(cscontext);
        convertView = myinflater.inflate(csresource, parent, false);

        String customerId = getItem(position).getMyCustomerId();
        String customerName = getItem(position).getMyCustomerName();
        String customerNumber = getItem(position).getMyCustomerNumber();
        String customerEmail = getItem(position).getMyCustomerEmail();
        String customerAddress = getItem(position).getMyCustomerAddress();
        String customerCity = getItem(position).getMyCustomerCity();
        String customerCountry = getItem(position).getMyCustomerCountry();
        String customerDevice = getItem(position).getMycustomerDevice();
        String customerBrand = getItem(position).getMycustomerBrand();
        String customerModel = getItem(position).getMycustomerModel();
        String customerFault = getItem(position).getMycustomerFault();
        String customerColor = getItem(position).getMycustomerColor();
        String customerRecieve = getItem(position).getMycustomerRecieve();




        tvcsid = convertView.findViewById(R.id.customerId);
        tvcsname = convertView.findViewById(R.id.customerName);
        tvcsnumber = convertView.findViewById(R.id.customerNumber);
        tvcsemail = convertView.findViewById(R.id.customerEmail);
        tvcsaddress = convertView.findViewById(R.id.customerAddress);
        tvcscity = convertView.findViewById(R.id.customerCity);
        tvcscountry = convertView.findViewById(R.id.customerCountry);
        tvcsdevice = convertView.findViewById(R.id.customerDevice);
        tvcsbrand = convertView.findViewById(R.id.customerBrand);
        tvcsmodel = convertView.findViewById(R.id.customerModel);
        tvcsfault = convertView.findViewById(R.id.customerFault);
        tvcscolor = convertView.findViewById(R.id.customerColor);
        tvcsrecieve = convertView.findViewById(R.id.customerRecieve);



        tvcsid.setText(customerId);
        tvcsname.setText( customerName);
        tvcsnumber.setText(customerNumber);
        tvcsemail.setText(customerEmail);
        tvcsaddress.setText(customerAddress);
        tvcscity.setText(customerCity);
        tvcscountry.setText(customerCountry);
        tvcsdevice.setText(customerDevice);
        tvcsbrand.setText(customerBrand);
        tvcsmodel.setText(customerModel);
        tvcsfault.setText(customerFault);
        tvcscolor.setText(customerColor);
        tvcsrecieve.setText(customerRecieve);

        deleteOrderbtn = convertView.findViewById(R.id.deleteOrder);


        deleteOrderbtn.setText("Delete Order");












        return convertView;

    }


}
