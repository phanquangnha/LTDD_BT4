package com.example.tuan4_thuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttonLogin = (Button) findViewById(R.id.btlogin);
        EditText usernameLogin = (EditText) findViewById(R.id.usernamelogin);
        EditText passLogin = (EditText) findViewById(R.id.passlogin);
        TextView linkdk = (TextView) findViewById(R.id.linkdk);
        bttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(User us : BTP.userList)
                if (us.getUsername().equals(usernameLogin.getText().toString().trim()) && us.getPassword().equals(passLogin.getText().toString().trim()))
                {
                    BTP.user=us;
                    Intent intent = new Intent(MainActivity.this, Profile.class);
                    startActivity(intent);
                }
                    Toast.makeText(MainActivity.this,"Sai thông tin",Toast.LENGTH_SHORT).show();
            }
        });
        linkdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Singup.class);
                startActivity(intent);
            }
        });
    }
}