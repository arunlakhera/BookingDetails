package com.pikchillytechnologies.bookingdetails;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Movie;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class BookingDateTimeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    private BookingDateAdapter mAdapter;
    LinearLayoutManager HorizontalLayout;

    private List<BookingDateTimeModel> dateList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_date_time);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BookingDateAdapter(dateList);

        //mLayoutManager = new LinearLayoutManager(getApplicationContext());
        //recyclerView.setLayoutManager(mLayoutManager);

        prepareDateData();

        HorizontalLayout = new LinearLayoutManager(BookingDateTimeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }

    public void prepareDateData(){

        Calendar calendarView = Calendar.getInstance();

        Integer currentMonth = Integer.valueOf(calendarView.get(Calendar.MONTH)) + 1;

        Integer startDayOfMonth;
        Integer currentDayOfMonth = Integer.valueOf(calendarView.get(Calendar.DAY_OF_WEEK));

        calendarView.set(Calendar.DAY_OF_MONTH, 1);

        startDayOfMonth = Integer.valueOf(calendarView.get(Calendar.DAY_OF_WEEK));


        String[] weekDays = {"S","M","T","W","T","F","S"};

        Integer numberOfDaysInMonth = 0;
        Integer weekDayNumber = 0;

        if(currentMonth.equals(4) || currentMonth.equals(6) || currentMonth.equals(9) || currentMonth.equals(11)) {
            numberOfDaysInMonth = 30;
        }else if(currentMonth.equals(2)) {

            // PUT CALCULATION FOR LEAP YEAR

            numberOfDaysInMonth = 28;

        }else {
            numberOfDaysInMonth = 31;
        }

        for(int i = 1 ; i <= numberOfDaysInMonth ; i++) {

            if(startDayOfMonth <= 7) {
                BookingDateTimeModel mDate1 = new BookingDateTimeModel(String.valueOf(i),String.valueOf(weekDays[startDayOfMonth - 1]));
                dateList.add(mDate1);
                startDayOfMonth++;
            }else {
                startDayOfMonth = 1;
            }


        }

        mAdapter.notifyDataSetChanged();
    }

}
