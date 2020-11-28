package com.example.telephony;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button messagePapa,messageMama,callPapa,callMama,messageRhea,callRhea,messageJonabel,callJonabel,messageErica,callErica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#205072"));
        actionBar.setBackgroundDrawable(colorDrawable);
        messageMama=(Button)findViewById(R.id.messageButtonMama);
        messagePapa=(Button)findViewById(R.id.messageButtonPapa);
        messageRhea=(Button)findViewById(R.id.messageButtonRhea);
        messageJonabel=(Button)findViewById(R.id.messageButtonJonabel);
        messageErica=(Button)findViewById(R.id.messageButtonErica);
        callMama=(Button)findViewById(R.id.phoneButtonMama);
        callPapa=(Button)findViewById(R.id.phoneButtonPapa);
        callRhea=(Button)findViewById(R.id.phoneButtonRhea);
        callJonabel=(Button)findViewById(R.id.phoneButtonJonabel);
        callErica=(Button)findViewById(R.id.phoneButtonErica);
        //sms
        messagePapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,papa.class);
                startActivity(intent1);
            }
        });
        messageMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,mama.class);
                startActivity(intent2);
            }
        });
        messageRhea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,rhea.class);
                startActivity(intent3);
            }
        });
        messageJonabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this, jonabel.class);
                startActivity(intent4);
            }
        });
        messageErica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,erica.class);
                startActivity(intent5);
            }
        });
        //phonecall
        callMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,callmama.class);
                startActivity(intent1);
            }
        });
        callPapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,callpapa.class);
                startActivity(intent2);
            }
        });
        callRhea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,callrhea.class);
                startActivity(intent3);
            }
        });
        callErica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,callerica.class);
                startActivity(intent4);
            }
        });
        callJonabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,calljonabel.class);
                startActivity(intent5);
            }
        });




    }
}
