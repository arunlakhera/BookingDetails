package com.pikchillytechnologies.bookingdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WalletActivity extends AppCompatActivity {


    ListView walletListview;
    WalletAdapter customAdapter;
    List<Wallet> walletTransactionList;
    Wallet walletTransaction;

    String mTransactionDate;
    String mTransactionDescription;
    String mTransactionAccountNumber;
    String mTransactionAmount;

    TextView txtTotalWalletAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        txtTotalWalletAmount = findViewById(R.id.txt_TotalWalletAmount);

        walletListview = findViewById(R.id.list_WalletTransaction);
        walletTransactionList = new ArrayList<>();

        walletTransactionList.add(new Wallet("27-Mar-2018","345610","1000","Add Money"));
        walletTransactionList.add(new Wallet("27-Mar-2018","345610","300","Paid for Transaction 01"));
        walletTransactionList.add(new Wallet("30-Mar-2018","4335610","5000","Add Money"));
        walletTransactionList.add(new Wallet("27-Mar-2018","345610","400","Paid for Transaction 02"));

        customAdapter = new WalletAdapter(getApplicationContext(), walletTransactionList);
        walletListview.setAdapter(customAdapter);

        updateWalletAmount();

    }

    public void updateWalletAmount() {

        Integer totalAmount = 0;

        for(int i = 0 ; i < walletTransactionList.size() ; i++) {

            if ((String.valueOf(walletTransactionList.get(i).getmTransactionDescription())).contains("Add")) {
                totalAmount += Integer.valueOf(walletTransactionList.get(i).getmTransactionAmount());
            }else {
                totalAmount -= Integer.valueOf(walletTransactionList.get(i).getmTransactionAmount());
            }


        }

        txtTotalWalletAmount.setText("Rs. " + totalAmount);

    }

}
