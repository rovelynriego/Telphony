package com.example.telephony;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class callrhea extends AppCompatActivity {
    EditText rheaphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callrhea);
        rheaphone=(EditText)findViewById(R.id.rheaphone);
    }
    public void btnCall(View view){
        int permissionCheck=ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE);

        if (permissionCheck==PackageManager.PERMISSION_GRANTED){

            String Phone=rheaphone.getText().toString().trim();

            Intent callIntent=new Intent(Intent.ACTION_CALL);

            callIntent.setData(Uri.parse("tel:"+Phone));

            startActivity(callIntent);
        }
        else {
            ActivityCompat.requestPermissions(this,new  String[]{Manifest.permission.CALL_PHONE},0);
        }
    }

}
