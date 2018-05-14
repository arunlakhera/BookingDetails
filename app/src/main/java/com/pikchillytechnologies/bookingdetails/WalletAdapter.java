package com.pikchillytechnologies.bookingdetails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WalletAdapter extends ArrayAdapter<Wallet> {

    LayoutInflater inflter;
    Wallet wallet;

    public WalletAdapter(Context context, List<Wallet> walletTransaction){
        super(context,0, walletTransaction);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = inflter.from(getContext()).inflate(R.layout.activity_wallet_listview,parent,false);
        }

        wallet = getItem(position);

        TextView txtTransactionDate = convertView.findViewById(R.id.txt_TransactionDate);
        TextView txtTransactionDescription = convertView.findViewById(R.id.txt_TransactionDescription);
        TextView txtTransactionAccountNumber = convertView.findViewById(R.id.txt_AccountNumber);
        TextView txtTransactionAmount = convertView.findViewById(R.id.txt_TransactionAmount);
        ImageView imgTrasactionImage = convertView.findViewById(R.id.img_TrasactionImage);

        txtTransactionDate.setText(String.valueOf(wallet.getmTransactionDate()));
        txtTransactionDescription.setText(String.valueOf(wallet.getmTransactionDescription()));
        txtTransactionAccountNumber.setText("Rs. " + String.valueOf(wallet.getmTransactionAmount()));
        txtTransactionAmount.setText(String.valueOf(wallet.getmTransactionAmount()));

        if ((String.valueOf(wallet.getmTransactionDescription())).contains("Add")) {
            imgTrasactionImage.setImageResource(R.drawable.ruppe_ico);
        }else{
            imgTrasactionImage.setImageResource(R.drawable.rupee_ico02);
        }

        return convertView;

    }

}
