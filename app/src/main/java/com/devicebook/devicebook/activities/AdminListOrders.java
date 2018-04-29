package com.devicebook.devicebook.activities;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;

import com.devicebook.devicebook.R;
import com.devicebook.devicebook.adapter_class.AdminAdapter;
import com.devicebook.devicebook.database.MyDatabase;

import java.util.ArrayList;

public class AdminListOrders extends AppCompatActivity {
    MyDatabase dbhelper;
    SQLiteDatabase mDatabase;
    EditText SearchFilter;
    ArrayList listorders = new ArrayList<>();
    private AdminAdapter totalOrderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlistviewlayout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView total_order_listview = findViewById(R.id.adminlistview);
        SearchFilter = findViewById(R.id.searchPlace);

        // ArrayList ordersearch = new ArrayList<>();
        // ordersearch.add("Phones");
        //  ordersearch.add("Tablet");
        //  ordersearch.add("Samsung");
        // ordersearch.add("Apple");
        // ordersearch.add("Phones");
        // ordersearch.add("Phones");
        // ordersearch.add("Phones");
        // ordersearch.add("Phones");

        //searchAdapter = new  ArrayAdapter(this, R.layout.admin_list_orders, ordersearch);
        //total_order_listview.setAdapter(searchAdapter);


        final String searchFilter = SearchFilter.getText().toString();

        dbhelper = new MyDatabase(AdminListOrders.this);
        mDatabase = dbhelper.getWritableDatabase();


        listorders.clear();
        listorders.addAll(dbhelper.totalOrder());



        totalOrderAdapter = new  AdminAdapter(this, R.layout.admin_list_orders, listorders);
        total_order_listview.setAdapter(totalOrderAdapter);


        SearchFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                totalOrderAdapter.getFilter().filter(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    @Override
    public boolean  onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.devicebook_menu, menu);

       // MenuItem searchitem = menu.findItem(R.id.search);
        //SearchView mysearchview =(SearchView) MenuItemCompat.getActionView(searchitem);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        //Intent menuintent = new Intent(AdminListOrders.this,DisplayGridActivity.class);
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        // startActivity(menuintent);
        return super.onOptionsItemSelected(item);
    }

    //@Override
    //public boolean onQueryTextSubmit(String query) {
    //    return false;
    //}

    //@Override
    //public boolean onQueryTextChange(String newText) {
    //ArrayList<AdminObject> orderlist = new ArrayList<>();
    //for(AdminObject orders : listorders){

    // }
    // return false;
}

