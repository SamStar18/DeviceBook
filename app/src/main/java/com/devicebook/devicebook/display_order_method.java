package com.devicebook.devicebook;

import android.widget.Button;

/**
 * Created by Sam on 20/02/2018.
 */

public class display_order_method {

    private String myCustomerName;
    private String myCustomerNumber;
    private String myCustomerEmail;
    private String myCustomerAddress;
    private String myCustomerCity;
    private String myCustomerCountry;

    private String mycustomerDeviceType;
    private String mycustomerBrandType;
    private String mycustomerModelType;
    private String mycustomerFaultType;
    private String mycustomerColorType;
    private String mycustomerRecieveType;
    private Button deleteOrder;

    public display_order_method(String myCustomerName, String myCustomerNumber, String myCustomerEmail, String myCustomerAddress, String myCustomerCity, String myCustomerCountry, String mycustomerDeviceType, String mycustomerBrandType, String mycustomerModelType, String mycustomerFaultType, String mycustomerColorType, String mycustomerRecieveType, Button deleteOrder) {
        this.myCustomerName = myCustomerName;
        this.myCustomerNumber = myCustomerNumber;
        this.myCustomerEmail = myCustomerEmail;
        this.myCustomerAddress = myCustomerAddress;
        this.myCustomerCity = myCustomerCity;
        this.myCustomerCountry = myCustomerCountry;
        this.mycustomerDeviceType = mycustomerDeviceType;
        this.mycustomerBrandType = mycustomerBrandType;
        this.mycustomerModelType = mycustomerModelType;
        this.mycustomerFaultType = mycustomerFaultType;
        this.mycustomerColorType = mycustomerColorType;
        this.mycustomerRecieveType = mycustomerRecieveType;
        this.deleteOrder = deleteOrder;

    }


    public String getMyCustomerName() {
        return myCustomerName;
    }

    public void setMyCustomerName(String myCustomerName) {
        this.myCustomerName = myCustomerName;
    }

    public String getMyCustomerNumber() {
        return myCustomerNumber;
    }

    public void setMyCustomerNumber(String myCustomerNumber) {
        this.myCustomerNumber = myCustomerNumber;
    }

    public String getMyCustomerEmail() {
        return myCustomerEmail;
    }

    public void setMyCustomerEmail(String myCustomerEmail) {
        this.myCustomerEmail = myCustomerEmail;
    }

    public String getMyCustomerAddress() {
        return myCustomerAddress;
    }

    public void setMyCustomerAddress(String myCustomerAddress) {
        this.myCustomerAddress = myCustomerAddress;
    }

    public String getMyCustomerCity() {
        return myCustomerCity;
    }

    public void setMyCustomerCity(String myCustomerCity) {
        this.myCustomerCity = myCustomerCity;
    }

    public String getMyCustomerCountry() {
        return myCustomerCountry;
    }

    public void setMyCustomerCountry(String myCustomerCountry) {
        this.myCustomerCountry = myCustomerCountry;
    }

    public String getMycustomerDeviceType() {
        return mycustomerDeviceType;
    }

    public void setMycustomerDeviceType(String mycustomerDeviceType) {
        this.mycustomerDeviceType = mycustomerDeviceType;
    }

    public String getMycustomerBrandType() {
        return mycustomerBrandType;
    }

    public void setMycustomerBrandType(String mycustomerBrandType) {
        this.mycustomerBrandType = mycustomerBrandType;
    }

    public String getMycustomerModelType() {
        return mycustomerModelType;
    }

    public void setMycustomerModelType(String mycustomerModelType) {
        this.mycustomerModelType = mycustomerModelType;
    }

    public String getMycustomerFaultType() {
        return mycustomerFaultType;
    }

    public void setMycustomerFaultType(String mycustomerFaultType) {
        this.mycustomerFaultType = mycustomerFaultType;
    }

    public String getMycustomerColorType() {
        return mycustomerColorType;
    }

    public void setMycustomerColorType(String mycustomerColorType) {
        this.mycustomerColorType = mycustomerColorType;
    }

    public String getMycustomerRecieveType() {
        return mycustomerRecieveType;
    }

    public void setMycustomerRecieveType(String mycustomerRecieveType) {
        this.mycustomerRecieveType = mycustomerRecieveType;
    }

    public Button getDeleteOrder() {
        return deleteOrder;
    }

    public void setDeleteOrder(Button deleteOrder) {
        this.deleteOrder = deleteOrder;
    }
}
