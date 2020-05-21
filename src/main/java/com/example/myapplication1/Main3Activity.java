package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    //TextInputEditText Inputing;
    EditText Inputing;
    Button backToHome;
    Button Agre;
    Button Next;
    Button Last;
    TextView showThem;

    int chet;
    String []answer= new String [6];


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Inputing = findViewById(R.id.Input);
        backToHome = findViewById(R.id.Home);
        Next=findViewById(R.id.termHigh);
        Last=findViewById(R.id.termLess);
        Agre=findViewById(R.id.agree);
        Inputing = findViewById(R.id.Feeld);
        showThem=findViewById(R.id.itog);

        backToHome.setOnClickListener(this);
        Next.setOnClickListener(this);
        Last.setOnClickListener(this);
        Agre.setOnClickListener(this);

        answer[0]="погода";
        answer[1]="спрот";
        answer[2]="образование";
        answer[3]="кино";
        answer[4]="политика";
        answer[5]="искусство";

        chet=0;
        showThem.setText("Выбранная тема: "+ answer[chet]);



    }



    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {

            case R.id.Home:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.termLess:
                if(chet!=0) {
                    chet--;
                    showThem.setText("Выбранная тема: "+answer[chet]);
                }
                else
                    Toast.makeText(getApplicationContext(),"Sorry, end of list", Toast.LENGTH_LONG).show();
                break;
            case R.id.termHigh:
                if(chet!=5) {
                    chet++;
                    showThem.setText("Выбранная тема: "+answer[chet]);
                }
                else
                    Toast.makeText(getApplicationContext(),"Sorry, end of list", Toast.LENGTH_LONG).show();
                    break;
            case R.id.agree:
                i = new Intent(this, Main2Activity.class);
                String wasInput = Inputing.getText().toString();
                Toast.makeText(getApplicationContext(),"Вы ввели:"+wasInput, Toast.LENGTH_LONG).show();

                i.putExtra("NP", chet);
                i.putExtra("TXT", wasInput);

                startActivity(i);
                break;
        }
    }
}
