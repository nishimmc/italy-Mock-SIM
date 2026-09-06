package com.example.italymocksim;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        TextView s = findViewById(R.id.status);
        s.setText("Mock profile:\n\nSIM present: YES (mock)\nCountry: Italy\nISO country: IT\nMCC: 222\n\nTesting only. This ordinary APK does not modify Android TelephonyManager or other apps.");
    }
}
