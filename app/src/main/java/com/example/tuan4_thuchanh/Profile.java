package com.example.tuan4_thuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView namepf,sdtpf,usernamepf,emailpf,passpf,nspf;
    ImageView showpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        LinearLayout linkbackpf = (LinearLayout) findViewById(R.id.linkbackpf);
        AnhXa();
        namepf.setText(BTP.user.getTen());
        usernamepf.setText(BTP.user.getUsername());
        sdtpf.setText(BTP.user.getSdt());
        passpf.setText(BTP.user.getPassword());
        nspf.setText(BTP.user.getNgaysinh());
        emailpf.setText(BTP.user.getEmail());
        showpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (passpf.getInputType()==InputType.TYPE_TEXT_VARIATION_PASSWORD)
                    passpf.setInputType(InputType.TYPE_CLASS_TEXT);
                else
                    passpf.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        });
        linkbackpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void AnhXa(){
        namepf = (TextView) findViewById(R.id.namepf);
        sdtpf = (TextView) findViewById(R.id.sdtpf);
        usernamepf = (TextView) findViewById(R.id.usernamepf);
        passpf = (TextView) findViewById(R.id.passpf);
        nspf = (TextView) findViewById(R.id.nspf);
        emailpf = (TextView) findViewById(R.id.emailpf);
        showpass = (ImageView) findViewById(R.id.showpass);
    }
}