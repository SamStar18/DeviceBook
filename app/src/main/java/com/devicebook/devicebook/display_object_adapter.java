package com.devicebook.devicebook;

import android.widget.Button;

/**
 * Created by Sam on 07/02/2018.
 */

public class display_object_adapter {
    private String csid;
   private String name;
    private String phoneNumber;
    private String email;
    private String addressline1;
    private String city;
    private String country;

    private Button editbutton1;
    private Button csDeleteButton1;
    private String csdeviceType;

    private String csdeviceBrand;
    private String csdeviceModel;
    private String csfaultspinner;
    private String cscolorspinner;
    private String csCollectionOptions;
    private Button editbutton2;
    private Button csDeleteButton2;
    private Button csConfirmButton;


    public display_object_adapter(String csid,String name, String phoneNumber, String email, String addressline1, String city, String country, Button editbutton1,Button csDeleteButton1, String csdeviceType,String csdeviceBrand, String csdeviceModel,  String csfaultspinner, String cscolorspinner, String csCollectionOptions, Button editbutton2,Button csDeleteButton2,Button csConfirmButton) {
        this.csid = csid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.addressline1 = addressline1;
        this.city = city;
        this.country = country;
        this.editbutton1 = editbutton1;
        this.csDeleteButton1 = csDeleteButton1;
        this.csdeviceType = csdeviceType;
        this.csdeviceBrand = csdeviceBrand;
        this.csdeviceModel = csdeviceModel;

        this.csfaultspinner = csfaultspinner;
        this.cscolorspinner = cscolorspinner;
        this.csCollectionOptions = csCollectionOptions;
        this.editbutton2 = editbutton2;
        this.csDeleteButton2 = csDeleteButton2;
        this.csConfirmButton = csConfirmButton;
    }

    public String getCsid() {
        return csid;
    }

    public void setCsid(String csid) {
        this.csid = csid;
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

    public Button getEditbutton1() {
        return editbutton1;
    }

    public void setEditbutton1(Button editbutton1) {
        this.editbutton1 = editbutton1;
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

    public Button getEditbutton2() {
        return editbutton2;
    }

    public void setEditbutton2(Button editbutton2) {
        this.editbutton2 = editbutton2;
    }

    public Button getCsConfirmButton() {
        return csConfirmButton;
    }

    public void setCsConfirmButton(Button csConfirmButton) {
        this.csConfirmButton = csConfirmButton;
    }

    public Button getCsDeleteButton1() {
        return csDeleteButton1;
    }

    public void setCsDeleteButton1(Button csDeleteButton1) {
        this.csDeleteButton1 = csDeleteButton1;
    }

    public Button getCsDeleteButton2() {
        return csDeleteButton2;
    }

    public void setCsDeleteButton2(Button csDeleteButton2) {
        this.csDeleteButton2 = csDeleteButton2;
    }
}
