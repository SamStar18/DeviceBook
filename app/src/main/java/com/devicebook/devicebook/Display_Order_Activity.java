package com.devicebook.devicebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Display_Order_Activity extends AppCompatActivity {



    ListView display_order_listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_order_view);
        String customerName = String.valueOf(findViewById(R.id.customerName));
        String customerNumber = String.valueOf(findViewById(R.id.customerNumber));
        String customerEmail = String.valueOf(findViewById(R.id.customerEmail));
        String customerAddress = String.valueOf(findViewById(R.id.customerAddress));
        String customerCity = String.valueOf(findViewById(R.id.customerCity));
        String customerCountry = String.valueOf(findViewById(R.id.customerCountry));

        String customerDeviceType = String.valueOf(findViewById(R.id.customerDeviceType));
        String customerBrandType = String.valueOf(findViewById(R.id.customerBrandType));
        String customerModelType = String.valueOf(findViewById(R.id.customerModelType));
        String customerFaultType = String.valueOf(findViewById(R.id.customerFaultType));
        String customerColorType = String.valueOf(findViewById(R.id.customerColorType));
        String customerRecieveType = String.valueOf(findViewById(R.id.customerRecieveType));

        Button deleteOrder = findViewById(R.id.deleteOrder);








        display_order_method orderObject = new display_order_method(customerName,customerNumber,customerEmail,customerAddress,customerCity,customerCountry,customerDeviceType,customerBrandType,customerModelType,customerFaultType,customerColorType,customerRecieveType,deleteOrder);

        ArrayList<display_order_method> orderArray = new ArrayList<>();
        orderArray.add(orderObject);

        display_order_listview = findViewById(R.id.display_order_listview);

        customer_order_adapter orderAdapter = new customer_order_adapter (this, R.layout.display_order, orderArray);
        display_order_listview.setAdapter(orderAdapter);

    }


}
