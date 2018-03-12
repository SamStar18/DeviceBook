package com.devicebook.devicebook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

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
    TextView tvcustomerusername;
    TextView tvcustomerfullname;
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
        String customerusername = getItem(position).getMyCustomerUsername();
        String customerfullname = getItem(position).getMyCustomerfullname();
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
        tvcustomerusername = convertView.findViewById(R.id.customerusername);
        tvcustomerfullname = convertView.findViewById(R.id.customerfullname);
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
        tvcustomerusername.setText( customerusername);
        tvcustomerfullname.setText(customerfullname);
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














        return convertView;

    }


}
