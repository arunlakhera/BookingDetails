package com.pikchillytechnologies.bookingdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class SelectAddressActivity extends AppCompatActivity {

    ListView listviewAddressList;
    SelectAddressAdapter customAdapter;
    List<UserAddressModel> userAddressList;
    UserAddressModel userAddress;
    String intentAddressActionType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_address);


        listviewAddressList = findViewById(R.id.listview_AddressList);
        userAddressList = new ArrayList<>();

        userAddressList.add(new UserAddressModel("John Doe","9889999123","hello@youremail.com","202 anshul apartments, 105 Geeta Nagar"));
        userAddressList.add(new UserAddressModel("Priyank Jain","8970122331","hello@youremail.com","204 anshul apartments, 105 Geeta Nagar"));
        userAddressList.add(new UserAddressModel("Dinesh","7895771123","hello@youremail.com","206 anshul apartments, 105 Geeta Nagar"));

        customAdapter = new SelectAddressAdapter(getApplicationContext(), userAddressList);
        listviewAddressList.setAdapter(customAdapter);








        findViewById(R.id.btn_AddNewAddress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent addressUpdateIntent = new Intent(SelectAddressActivity.this, AddNewAddressActivity.class);
                addressUpdateIntent.putExtra("addressActionType","Add New Address");
                startActivity(addressUpdateIntent);;
            }
        });

    }

}
