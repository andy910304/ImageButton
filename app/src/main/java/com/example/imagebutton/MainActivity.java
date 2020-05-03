package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MensajeOutlook(View view){

        Toast.makeText(this, "Button de Outlook", Toast.LENGTH_LONG).show();

    } public void MensajeOneNote(View view){

        Toast.makeText(this, "Button de Outlook", Toast.LENGTH_LONG).show();

    }

}
