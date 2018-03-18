package ru.startandroid.p0691parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LOG_TAG, "getParcelableExtra");
        MyObject myObj = (MyObject) getIntent().getParcelableExtra(
                MyObject.class.getCanonicalName());
        Log.d(LOG_TAG, "myObj: " + myObj.s + ", " + myObj.i);
    }

}