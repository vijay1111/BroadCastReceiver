package com.example.vijay.broadcastreceiver.BR3CustomIntent;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.vijay.broadcastreceiver.R;

public class BroadCastReceiver3 extends AppCompatActivity {
    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receiver3);
        broadcastReceiver=new MyBroadCastRecceiver3();
    }

    public void view_click(View view) {
        switch (view.getId())
        {
            case R.id.custom_intent:
                Intent intent=new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action.tag.fordemo");
                sendBroadcast(intent);
                break;
        }

    }
}
