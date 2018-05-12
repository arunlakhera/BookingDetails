package com.pikchillytechnologies.bookingdetails;

public class FavouriteLabs {

    private String mLabName;
    private String mLabAddress;
    private String mPincode;

    public FavouriteLabs(String labName, String labAddress, String pincode){
        this.mLabName = labName;
        this.mLabAddress = labAddress;
        this.mPincode = pincode;
    }

    public String getmLabName() {
        return mLabName;
    }

    public void setmLabName(String mLabName) {
        this.mLabName = mLabName;
    }

    public String getmLabAddress() {
        return mLabAddress;
    }

    public void setmLabAddress(String mLabAddress) {
        this.mLabAddress = mLabAddress;
    }

    public String getmPincode() {
        return mPincode;
    }

    public void setmPincode(String mPincode) {
        this.mPincode = mPincode;
    }
}
