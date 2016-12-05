package com.example.cryptogram.petrolapp.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.cryptogram.petrolapp.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){

        switch(view.getId()){
            case R.id.fillupbutton:
                Intent i = new Intent(MainActivity.this,FillUp.class);
                startActivity(i);
                break;
        }

    }

}
