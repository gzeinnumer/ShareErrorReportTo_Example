package com.gzeinnumer.shareerrorreportto_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gzeinnumer.sert.ShareErrorDialog;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            textView.setText("");
        } catch (Exception e){
            String error = e.getLocalizedMessage();
            new ShareErrorDialog(getSupportFragmentManager()).builder().setErrorMessage(error).show();
        }
    }
}