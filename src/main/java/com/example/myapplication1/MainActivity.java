package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int choseN;

   Button button11;
   Button button22;
   Button button33;
   Button button44;
   Button button55;
   Button button66;
   Button go3act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       button11 =  findViewById(R.id.button2);
       button22 =  findViewById(R.id.button3);
       button33 = findViewById(R.id.button4);
       button44 =  findViewById(R.id.button5);
       button55 =  findViewById(R.id.button6);
       button66 =  findViewById(R.id.button7);
       go3act= findViewById(R.id.Redakt);


        button11.setOnClickListener(this);
        button22.setOnClickListener(this);
        button33.setOnClickListener(this);
        button44.setOnClickListener(this);
        button55.setOnClickListener(this);
        button66.setOnClickListener(this);
        go3act.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
       // i = new Intent(this, Main2Activity.class);
       // startActivity(i);


        switch (view.getId()) {
            case R.id.Redakt:
                i = new Intent(this,Main3Activity.class);
                startActivity(i);
                break;
            case R.id.button2:
                choseN = 1;
                i = new Intent(this, Main2Activity.class);
                i.putExtra("chosend", choseN);
                startActivity(i);
                break;
            case R.id.button3:
                choseN = 2;
                i = new Intent(this, Main2Activity.class);
                i.putExtra("chosend", choseN);
                startActivity(i);
                break;
            case R.id.button4:
                choseN = 3;
                i = new Intent(this, Main2Activity.class);
                i.putExtra("chosend", choseN);
                startActivity(i);
                break;
            case R.id.button5:
                choseN = 4;
                i = new Intent(this, Main2Activity.class);
                i.putExtra("chosend", choseN);
                startActivity(i);
                break;
            case R.id.button6:
                choseN = 5;
                i = new Intent(this, Main2Activity.class);
                i.putExtra("chosend", choseN);
                startActivity(i);
                break;
            case R.id.button7:
                choseN = 6;
                i = new Intent(this, Main2Activity.class);
                i.putExtra("chosend", choseN);
                startActivity(i);
                break;
            case R.id.button8 :
                i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;

        }
    }
}


