package com.pikchillytechnologies.bookingdetails;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SelectAddressAdapter extends ArrayAdapter<UserAddressModel> {

    LayoutInflater inflter;
    UserAddressModel userAddress;

    public SelectAddressAdapter(Context context, List<UserAddressModel> userAddressList) {
        super(context, 0, userAddressList);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = inflter.from(getContext()).inflate(R.layout.activity_select_address_listview, parent, false);
        }

        userAddress = getItem(position);

        TextView txtName = convertView.findViewById(R.id.txt_Name);
        TextView txtPhoneEmail = convertView.findViewById(R.id.txt_PhoneEmail);
        TextView txtAddress = convertView.findViewById(R.id.txt_Address);
        TextView txtEdit = convertView.findViewById(R.id.txt_Edit);

        txtName.setText(String.valueOf(userAddress.getmName()));
        txtPhoneEmail.setText(String.valueOf(userAddress.getmPhone()) + " | " + String.valueOf(userAddress.getmEmail()));
        txtAddress.setText(String.valueOf(userAddress.getmAddress()));


        txtEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent addressUpdateIntent = new Intent(getContext(), AddNewAddressActivity.class);

                addressUpdateIntent.putExtra("addressActionType", "Edit Address");
                addressUpdateIntent.putExtra("userAddress", String.valueOf(getItem(position).getmAddress()));
                addressUpdateIntent.putExtra("userPhone", String.valueOf(getItem(position).getmPhone()));
                addressUpdateIntent.putExtra("userLandmark", "NA");

                getContext().startActivity(addressUpdateIntent);


            }
        });


        return convertView;

    }
}
