package com.pikchillytechnologies.bookingdetails;

public class UserAddressModel {

    private String mName;
    private String mPhone;
    private String mEmail;
    private String mAddress;

    public UserAddressModel(String name,String phone,String email,String address ) {

        this.mName = name;
        this.mPhone = phone;
        this.mEmail = email;
        this.mAddress = address;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
}
