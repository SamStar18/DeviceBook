package com.devicebook.devicebook;

import java.util.ArrayList;

/**
 * Created by Sam on 20/02/2018.
 */

public class display_order_method extends ArrayList<display_order_method> {

    private String myCustomerId;
    private String myCustomerUsername;
    private String myCustomerfullname;
    private String myCustomerEmail;
    private String myCustomerAddress;
    private String myCustomerCity;
    private String myCustomerCountry;
    private String mycustomerDevice;
    private String mycustomerBrand;
    private String mycustomerModel;
    private String mycustomerFault;
    private String mycustomerColor;
    private String mycustomerRecieve;

    public display_order_method() {

    }


    public display_order_method(String mycustomerId, String myCustomerUsername, String myCustomerfullname, String myCustomerEmail, String myCustomerAddress, String myCustomerCity, String myCustomerCountry, String mycustomerDevice, String mycustomerBrand, String mycustomerModel, String mycustomerFault, String mycustomerColor, String mycustomerRecieve) {
        myCustomerId = mycustomerId;
        this.myCustomerUsername = myCustomerUsername;
        this.myCustomerfullname = myCustomerfullname;
        this.myCustomerEmail = myCustomerEmail;
        this.myCustomerAddress = myCustomerAddress;
        this.myCustomerCity = myCustomerCity;
        this.myCustomerCountry = myCustomerCountry;
        this.mycustomerDevice= mycustomerDevice;
        this.mycustomerBrand = mycustomerBrand;
        this.mycustomerModel = mycustomerModel;
        this.mycustomerFault = mycustomerFault;
        this.mycustomerColor = mycustomerColor;
        this.mycustomerRecieve = mycustomerRecieve;
    }

    public display_order_method( String myCustomerUsername, String myCustomerfullname, String myCustomerEmail, String myCustomerAddress, String myCustomerCity, String myCustomerCountry, String mycustomerDevice, String mycustomerBrand, String mycustomerModel, String mycustomerFault, String mycustomerColor, String mycustomerRecieve) {


        this.myCustomerUsername = myCustomerUsername;
        this.myCustomerfullname = myCustomerfullname;
        this.myCustomerEmail = myCustomerEmail;
        this.myCustomerAddress = myCustomerAddress;
        this.myCustomerCity = myCustomerCity;
        this.myCustomerCountry = myCustomerCountry;
        this.mycustomerDevice= mycustomerDevice;
        this.mycustomerBrand = mycustomerBrand;
        this.mycustomerModel = mycustomerModel;
        this.mycustomerFault = mycustomerFault;
        this.mycustomerColor = mycustomerColor;
        this.mycustomerRecieve = mycustomerRecieve;
    }

    public String getMyCustomerId() {
        return myCustomerId;
    }

    public void setMyCustomerId(String myCustomerId) {
        this.myCustomerId = myCustomerId;
    }

    public String getMyCustomerUsername() {
        return myCustomerUsername;
    }

    public void setMyCustomerUsername(String myCustomerUsername) {
        this.myCustomerUsername = myCustomerUsername;
    }

    public String getMyCustomerfullname() {
        return myCustomerfullname;
    }

    public void setMyCustomerfullname(String myCustomerfullname) {
        this.myCustomerfullname = myCustomerfullname;
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

    public String getMycustomerDevice() {
        return mycustomerDevice;
    }

    public void setMycustomerDevice(String mycustomerDevice) {
        this.mycustomerDevice = mycustomerDevice;
    }

    public String getMycustomerBrand() {
        return mycustomerBrand;
    }

    public void setMycustomerBrand(String mycustomerBrand) {
        this.mycustomerBrand = mycustomerBrand;
    }

    public String getMycustomerModel() {
        return mycustomerModel;
    }

    public void setMycustomerModel(String mycustomerModel) {
        this.mycustomerModel = mycustomerModel;
    }

    public String getMycustomerFault() {
        return mycustomerFault;
    }

    public void setMycustomerFault(String mycustomerFault) {
        this.mycustomerFault = mycustomerFault;
    }

    public String getMycustomerColor() {
        return mycustomerColor;
    }

    public void setMycustomerColor(String mycustomerColor) {
        this.mycustomerColor = mycustomerColor;
    }

    public String getMycustomerRecieve() {
        return mycustomerRecieve;
    }

    public void setMycustomerRecieve(String mycustomerRecieve) {
        this.mycustomerRecieve = mycustomerRecieve;
    }
}


