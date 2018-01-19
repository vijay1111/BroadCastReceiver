package com.example.vijay.broadcastreceiver.BR1Manifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReceiver1 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast1 Receiver Triggered",Toast.LENGTH_SHORT).show();

    }
}
