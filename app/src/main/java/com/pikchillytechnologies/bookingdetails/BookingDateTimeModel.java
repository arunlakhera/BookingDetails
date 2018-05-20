package com.pikchillytechnologies.bookingdetails;

public class BookingDateTimeModel {

    private String mDate;
    private String mDay;

    public BookingDateTimeModel(String bookDate, String day) {

        this.mDate = bookDate;
        this.mDay = day;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmDay() {
        return mDay;
    }

    public void setmDay(String mDay) {
        this.mDay = mDay;
    }
}
