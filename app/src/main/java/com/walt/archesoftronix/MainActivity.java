package com.walt.archesoftronix;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        Bundle resultIntent = getIntent().getExtras();
        if(resultIntent != null) {
            String Token = resultIntent.getString("token");
            textView.setText(Token);

        }


    }
}