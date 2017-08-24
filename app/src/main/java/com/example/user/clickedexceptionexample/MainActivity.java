package com.example.user.clickedexceptionexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button exceptionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exceptionButton = (Button)findViewById(R.id.exceptionButton);

        exceptionButton.setOnClickListener(v -> exceptionButtonClick(null));
    }

    private <T>void exceptionButtonClick(T value) {
        try{
            System.out.println(value.toString());
        }
        catch (NullPointerException e){
            Toast.makeText(getApplicationContext(), "NullPointerException", Toast.LENGTH_LONG).show();
        }
    }
}
