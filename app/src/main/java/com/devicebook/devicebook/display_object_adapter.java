package com.devicebook.devicebook;

import android.widget.TextView;

/**
 * Created by Sam on 07/02/2018.
 */

public class display_object_adapter {
   private String name;
    private String phoneNumber;
    private String email;
    private String addressline1;
    private String city;
    private String country;

    private String csdeviceType;
    private String csdeviceModel;
    private String csdeviceBrand;
    private String csfaultspinner;
    private String cscolorspinner;
    private String csCollectionOptions;


    public display_object_adapter(String name, String phoneNumber, String email, String addressline1, String city, String country, String csdeviceType, String csdeviceModel, String csdeviceBrand, String csfaultspinner, String cscolorspinner, String csCollectionOptions) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.addressline1 = addressline1;
        this.city = city;
        this.country = country;
        this.csdeviceType = csdeviceType;
        this.csdeviceModel = csdeviceModel;
        this.csdeviceBrand = csdeviceBrand;
        this.csfaultspinner = csfaultspinner;
        this.cscolorspinner = cscolorspinner;
        this.csCollectionOptions = csCollectionOptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCsdeviceType() {
        return csdeviceType;
    }

    public void setCsdeviceType(String csdeviceType) {
        this.csdeviceType = csdeviceType;
    }

    public String getCsdeviceModel() {
        return csdeviceModel;
    }

    public void setCsdeviceModel(String csdeviceModel) {
        this.csdeviceModel = csdeviceModel;
    }

    public String getCsdeviceBrand() {
        return csdeviceBrand;
    }

    public void setCsdeviceBrand(String csdeviceBrand) {
        this.csdeviceBrand = csdeviceBrand;
    }

    public String getCsfaultspinner() {
        return csfaultspinner;
    }

    public void setCsfaultspinner(String csfaultspinner) {
        this.csfaultspinner = csfaultspinner;
    }

    public String getCscolorspinner() {
        return cscolorspinner;
    }

    public void setCscolorspinner(String cscolorspinner) {
        this.cscolorspinner = cscolorspinner;
    }

    public String getCsCollectionOptions() {
        return csCollectionOptions;
    }

    public void setCsCollectionOptions(String csCollectionOptions) {
        this.csCollectionOptions = csCollectionOptions;
    }

}
