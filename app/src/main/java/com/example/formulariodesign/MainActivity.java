package com.example.formulariodesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText cajatextomail = (EditText)findViewById(R.id.email);
        cajatextomail.setOnFocusChangeListener(new FocusListener(this));


    }
}
