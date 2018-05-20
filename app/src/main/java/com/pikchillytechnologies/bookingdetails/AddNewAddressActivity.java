package com.pikchillytechnologies.bookingdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class AddNewAddressActivity extends AppCompatActivity {

    String addressActionType;

    EditText editTextAddress, editTextLandmark, editTextPhone;

    Bundle addressActionBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_address);

        addressActionBundle = getIntent().getExtras();
        addressActionType = addressActionBundle.getString("addressActionType");

        TextView txtAddressActionType = findViewById(R.id.txt_AddressType);
        txtAddressActionType.setText(addressActionType);

        if(addressActionType.equals("Edit Address")){
            updateAddressFields();
        }else {
            clearAddressFields();
        }

    }

    public void updateAddressFields() {

        String address, landmark, phone;

        editTextAddress = findViewById(R.id.edittext_Address);
        editTextLandmark = findViewById(R.id.edittext_Landmark);
        editTextPhone = findViewById(R.id.edittext_Phone);

        address = addressActionBundle.getString("userAddress");
        landmark = addressActionBundle.getString("userLandmark");
        phone = addressActionBundle.getString("userPhone");

        editTextAddress.setText(address);
        editTextLandmark.setText(landmark);
        editTextPhone.setText(phone);

    }

    public void clearAddressFields() {

        editTextAddress = findViewById(R.id.edittext_Address);
        editTextLandmark = findViewById(R.id.edittext_Landmark);
        editTextPhone = findViewById(R.id.edittext_Phone);

        editTextAddress.setText("");
        editTextLandmark.setText("");
        editTextPhone.setText("");

        editTextAddress.requestFocus();

    }

}
