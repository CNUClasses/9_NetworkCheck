package com.example.keith.a9_network_connectioncheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConnectivityCheck myCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCheck = new ConnectivityCheck(this);

    }

    public void doNetworkCheck(View view) {
        String res =myCheck.isNetworkReachable()?"Network Reachable":"No Network";

        Toast.makeText(this, res,Toast.LENGTH_SHORT).show();
    }

    public void doWirelessCheck(View view) {
        String res =myCheck.isWifiReachable()?"WiFi Reachable":"No WiFi";
        Toast.makeText(this, res,Toast.LENGTH_SHORT).show();
    }
}
