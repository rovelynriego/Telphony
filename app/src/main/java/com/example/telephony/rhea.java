package com.example.telephony;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class rhea extends AppCompatActivity {
    EditText sendMsg,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhea);
        sendMsg=(EditText)findViewById(R.id.msg);
        phone=(EditText)findViewById(R.id.phone);
    }
    public void btnSend(View view){
        int permissionCheck= ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        }else{
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},0);
        }
    }
    public void sendMessage(){
        String msg,phone1;
        msg=sendMsg.getText().toString().trim();
        phone1=phone.getText().toString().trim();
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(msg,null,phone1,null,null);
        Toast.makeText(this, "Message Sent",Toast.LENGTH_SHORT).show();
    }
}
