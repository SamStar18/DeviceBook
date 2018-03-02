package com.devicebook.devicebook;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam on 22/02/2018.
 */

public class mydbhandler extends SQLiteOpenHelper {

    mydbhandler dbHelper;

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "customerOrderDetails.db";
    private static final String TABLE_CUSTOMER = "customerTable";
    public static final String CustomerId_column = "Id";
    public static final String CustomerName_column = "Sam";
    public static final String CustomerNumber_column = " Number";
    public static final String CustomerEmail_column = "Email";
    public static final String CustomerAddress_column = "Address";
    public static final String CustomerCity_column = "City";
    public static final String CustomerCountry_column = "Country";
    public static final String customerDevice_column = "Device";
    public static final String customerBrand_column = "Brand";
    public static final String customerModel_column = "Model";
    public static final String customerFault_column = "Fault";
    public static final String customerColor_column = "Color";
    public static final String customerRecieve_column = "Recieve";
    private Context cscontext;

    public mydbhandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        cscontext = context;


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " +
                TABLE_CUSTOMER + "("
                + CustomerId_column + " INTEGER PRIMARY KEY, " +
                CustomerName_column + " TEXT, " +
                CustomerNumber_column + " TEXT, " +
                CustomerEmail_column + " TEXT, " +
                CustomerAddress_column + " TEXT, " +
                CustomerCity_column + " TEXT, " +
                CustomerCountry_column + " TEXT, " +
                customerDevice_column + " TEXT, " +
                customerModel_column + " TEXT, " +
                customerBrand_column + " TEXT, " +
                customerFault_column + " TEXT, " +
                customerColor_column + " TEXT, " +
                customerRecieve_column + " TEXT " +
                ")";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CUSTOMER);
        onCreate(db);
    }

    public void addcustomer(display_order_method customer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CustomerName_column, customer.getMyCustomerName());
        values.put(CustomerNumber_column, customer.getMyCustomerNumber());
        values.put(CustomerEmail_column, customer.getMyCustomerEmail());
        values.put(CustomerAddress_column, customer.getMyCustomerAddress());
        values.put(CustomerCity_column, customer.getMyCustomerCity());
        values.put(CustomerCountry_column, customer.getMyCustomerCountry());
        values.put(customerDevice_column, customer.getMycustomerDevice());
        values.put(customerBrand_column, customer.getMycustomerBrand());
        values.put(customerModel_column, customer.getMycustomerModel());
        values.put(customerFault_column, customer.getMycustomerFault());
        values.put(customerColor_column, customer.getMycustomerColor());
        values.put(customerRecieve_column, customer.getMycustomerRecieve());


        long cxInserted = db.insert(TABLE_CUSTOMER, null, values);

        if (cxInserted != -1) {
            Toast.makeText(cscontext, "Saved to database ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(cscontext, "Data not saved ", Toast.LENGTH_SHORT).show();
        }
        db.close();

        return;
    }



    public List<display_order_method> findCustomer() {

        SQLiteDatabase db = this.getReadableDatabase();


        String[] columns = {
                CustomerId_column,
                CustomerName_column,
                CustomerNumber_column,
                CustomerEmail_column,
                CustomerAddress_column,
                CustomerCity_column,
                CustomerCountry_column,
                customerDevice_column,
                customerBrand_column,
                customerModel_column,
                customerFault_column,
                customerColor_column,
                customerRecieve_column
        };
        // sorting orders
        String sortOrder = CustomerName_column + " ASC";

        List<display_order_method> customerList = new ArrayList<display_order_method>();


        Cursor cursor = db.query(TABLE_CUSTOMER, //Table to query
                columns,    //columns to return
                null,        //columns for the WHERE clause
                null,        //The values for the WHERE clause
                null,       //group the rows
                null,       //filter by row groups
                sortOrder); //The sort order


        if (cursor.moveToFirst()) {
            do {
                display_order_method customer = new display_order_method();
                customer.setMyCustomerId(cursor.getString(cursor.getColumnIndex(CustomerId_column)));
                customer.setMyCustomerName(cursor.getString(cursor.getColumnIndex(CustomerName_column)));
                //customer.setMyCustomerNumber(Integer.parseInt(cursor.getString(cursor.getColumnIndex(CustomerNumber_column))));
                customer.setMyCustomerEmail(cursor.getString(cursor.getColumnIndex(CustomerEmail_column)));
                customer.setMyCustomerAddress(cursor.getString(cursor.getColumnIndex(CustomerAddress_column)));
                customer.setMyCustomerCity(cursor.getString(cursor.getColumnIndex(CustomerCity_column)));
                customer.setMyCustomerCountry(cursor.getString(cursor.getColumnIndex(CustomerCountry_column)));
                customer.setMycustomerDevice(cursor.getString(cursor.getColumnIndex(customerDevice_column)));
                customer.setMycustomerBrand(cursor.getString(cursor.getColumnIndex(customerBrand_column)));
                customer.setMycustomerModel(cursor.getString(cursor.getColumnIndex(customerModel_column)));
                customer.setMycustomerFault(cursor.getString(cursor.getColumnIndex(customerFault_column)));
                customer.setMycustomerColor(cursor.getString(cursor.getColumnIndex(customerColor_column)));
                customer.setMycustomerRecieve(cursor.getString(cursor.getColumnIndex(customerRecieve_column)));


                // Adding user record to list
                customerList.add(customer);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        // return user list
        return customerList;

    }

    public Boolean checkcustomer(String name){

        String[] columns = {CustomerName_column};
        SQLiteDatabase db = this.getReadableDatabase();

        String selection = CustomerName_column + " = ?";

        String[] selectionArgs = {name};

        Cursor cursor = db.query(TABLE_CUSTOMER, //Table to query
                columns,                    //columns to return
                selection,                  //columns for the WHERE clause
                selectionArgs,              //The values for the WHERE clause
                null,                       //group the rows
                null,                      //filter by row groups
                null);                      //The sort order
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();

        if (cursorCount > 0) {
            return true;
        }




        return true;
    }



    public String deletecustomer(String id) {
        SQLiteDatabase db = this.getWritableDatabase();

        // db.delete(TABLE_CUSTOMER," WHERE =" ,new String[]{name});

        db.execSQL("DELETE FROM "+TABLE_CUSTOMER+" WHERE " + CustomerId_column + "=" +id);

        db.close();

        return id;
    }




}
