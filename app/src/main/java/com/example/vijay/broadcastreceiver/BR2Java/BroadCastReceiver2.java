package com.example.vijay.broadcastreceiver.BR2Java;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.vijay.broadcastreceiver.R;

public class BroadCastReceiver2 extends AppCompatActivity {
    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receiver2);
        broadcastReceiver = new MyBroadCastReceiver2();
    }
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(broadcastReceiver, intentFilter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
}
