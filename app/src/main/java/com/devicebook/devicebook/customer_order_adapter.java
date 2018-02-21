package com.devicebook.devicebook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

    private Context ordercontext;
    int orderresource;
    LayoutInflater myinflater;

    public customer_order_adapter(Context context, int resource, ArrayList<display_order_method> objects) {
        super(context, resource, objects);
        ordercontext = context;
        orderresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {


        String customerName = getItem(position).getMyCustomerName();
        String customerNumber = getItem(position).getMyCustomerNumber();
        String customerEmail = getItem(position).getMyCustomerEmail();
        String customerAddress = getItem(position).getMyCustomerAddress();
        String customerCity = getItem(position).getMyCustomerCity();
        String customerCountry = getItem(position).getMyCustomerCountry();

        String customerDeviceType = getItem(position).getMycustomerDeviceType();
       String customerBrandType = getItem(position).getMycustomerBrandType();
      String customerModelType = getItem(position).getMycustomerModelType();
       String customerFaultType = getItem(position).getMycustomerFaultType();
     String  customerColorType = getItem(position).getMycustomerColorType();
       String customerRecieveType = getItem(position).getMycustomerRecieveType();
       Button deleteOrder = getItem(position).getDeleteOrder();

        myinflater = LayoutInflater.from(ordercontext);
        convertView = myinflater.inflate(orderresource,parent,false);

        final TextView tvcsname = convertView.findViewById(R.id.customerName);
        final TextView tvcsnumber = convertView.findViewById(R.id.customerNumber);
        final TextView tvcsemail = convertView.findViewById(R.id.customerEmail);
        final TextView tvcsaddress = convertView.findViewById(R.id.customerAddress);
        final TextView tvcscity = convertView.findViewById(R.id.customerCity);
        final TextView tvcscountry = convertView.findViewById(R.id.customerCountry);

        final TextView tvcsdevice = convertView.findViewById(R.id.customerDeviceType);
        final TextView tvcsbrand = convertView.findViewById(R.id.customerBrandType);
        final TextView tvcsmodel = convertView.findViewById(R.id.customerModelType);
        final TextView tvcsfault = convertView.findViewById(R.id.customerFaultType);
        final TextView tvcscolor = convertView.findViewById(R.id.customerColorType);
        final TextView tvcsrecieve = convertView.findViewById(R.id.customerRecieveType);
        final Button deleteOrderbtn = convertView.findViewById(R.id.deleteOrder);

        tvcsname.setText(customerName);
        tvcsnumber.setText(customerNumber);
        tvcsemail.setText(customerEmail);
        tvcsaddress.setText(customerAddress);
        tvcscity.setText(customerCity);
        tvcscountry.setText(customerCountry);

        tvcsdevice.setText(customerName);
        tvcsbrand.setText(customerNumber);
        tvcsmodel.setText(customerEmail);
        tvcsfault.setText(customerAddress);
        tvcscolor.setText(customerCity);
        tvcsrecieve.setText(customerCountry);
deleteOrderbtn.setText("Delete Order");

        deleteOrderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return convertView;

    }


}
