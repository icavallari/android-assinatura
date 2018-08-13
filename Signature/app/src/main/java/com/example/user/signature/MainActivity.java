package com.example.user.signature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear(View view){
        SignatureView signatureView = (SignatureView) findViewById(R.id.signatureView);
        signatureView.clear();
    }

}
