package com.pikchillytechnologies.bookingdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class NotificationsActivity extends AppCompatActivity {


    // Reminder Switch
    Switch switchReminderEmail;
    Switch switchReminderPushNotification;
    Switch switchReminderTextMessage;

    // Reminder Switch
    Switch switchPromotionalEmail;
    Switch switchPromotionalPushNotification;
    Switch switchPromotionalTextMessage;

    // Reminder Switch
    Switch switchPolicyEmail;
    Switch switchPolicyPushNotification;
    Switch switchPolicyTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        // Initialize
        switchReminderEmail = findViewById(R.id.switch_ReminderEmail);
        switchReminderPushNotification = findViewById(R.id.switch_ReminderPushNotification);
        switchReminderTextMessage = findViewById(R.id.switch_ReminderTextMessage);

        switchPromotionalEmail = findViewById(R.id.switch_PromotionalEmail);
        switchPromotionalPushNotification = findViewById(R.id.switch_PromotionalPushNotification);
        switchPromotionalTextMessage = findViewById(R.id.switch_PromotionalTextMessage);

        switchPolicyEmail = findViewById(R.id.switch_PolicyEmail);
        switchPolicyPushNotification = findViewById(R.id.switch_PolicyPushNotification);
        switchPolicyTextMessage = findViewById(R.id.switch_PolicyTextMessage);


        switchReminderEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchReminderEmail.isChecked()){
                    switchReminderEmail.setThumbResource(R.drawable.right);
                }else {
                    switchReminderEmail.setThumbResource(R.drawable.exit);
                }
            }
        });


        switchReminderPushNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchReminderPushNotification.isChecked()){
                    switchReminderPushNotification.setThumbResource(R.drawable.right);
                }else {
                    switchReminderPushNotification.setThumbResource(R.drawable.exit);
                }
            }
        });

        switchReminderTextMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchReminderTextMessage.isChecked()){
                    switchReminderTextMessage.setThumbResource(R.drawable.right);
                }else {
                    switchReminderTextMessage.setThumbResource(R.drawable.exit);
                }
            }
        });

        switchPromotionalEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchPromotionalEmail.isChecked()){
                    switchPromotionalEmail.setThumbResource(R.drawable.right);
                }else {
                    switchPromotionalEmail.setThumbResource(R.drawable.exit);
                }
            }
        });


        switchPromotionalPushNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchPromotionalPushNotification.isChecked()){
                    switchPromotionalPushNotification.setThumbResource(R.drawable.right);
                }else {
                    switchPromotionalPushNotification.setThumbResource(R.drawable.exit);
                }
            }
        });

        switchPromotionalTextMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchPromotionalTextMessage.isChecked()){
                    switchPromotionalTextMessage.setThumbResource(R.drawable.right);
                }else {
                    switchPromotionalTextMessage.setThumbResource(R.drawable.exit);
                }
            }
        });

        switchPolicyEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchPolicyEmail.isChecked()){
                    switchPolicyEmail.setThumbResource(R.drawable.right);
                }else {
                    switchPolicyEmail.setThumbResource(R.drawable.exit);
                }
            }
        });


        switchPolicyPushNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchPolicyPushNotification.isChecked()){
                    switchPolicyPushNotification.setThumbResource(R.drawable.right);
                }else {
                    switchPolicyPushNotification.setThumbResource(R.drawable.exit);
                }
            }
        });

        switchPolicyTextMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchPolicyTextMessage.isChecked()){
                    switchPolicyTextMessage.setThumbResource(R.drawable.right);
                }else {
                    switchPolicyTextMessage.setThumbResource(R.drawable.exit);
                }
            }
        });

    }

}
