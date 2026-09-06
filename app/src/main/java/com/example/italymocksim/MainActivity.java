package com.example.italymocksim;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        TextView s = findViewById(R.id.status);
        s.setText(
            "Mock profile:\n\n" +
            "SIM present: YES (mock)\n" +
            "Country: Italy\n" +
            "ISO country: IT\n" +
            "MCC: 222\n\n" +
            "Important: these values are shown by this test app only. " +
            "Android's system TelephonyManager is not modified by an ordinary APK."
        );
    }
}
