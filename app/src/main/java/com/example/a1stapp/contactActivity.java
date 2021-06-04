package com.example.a1stapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import  androidx.appcompat.app.AppCompatActivity;


public class contactActivity extends AppCompatActivity {
   ImageButton instalogo,twitterlogo,githublogo,telegramlogo,maillogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        instalogo = findViewById(R.id.instalogo);
        twitterlogo= findViewById(R.id.twitterlogo);
        githublogo=findViewById(R.id.github_logo);
        telegramlogo=findViewById(R.id.telegramlogo);
        maillogo=findViewById(R.id.maillogo);

        instalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/sarran_43?r=nametag"));
                startActivity(intent);
            }
        });

            twitterlogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/43Sarran"));
                    startActivity(intent);
                }
            });
       githublogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/cybercrak/calc"));
                startActivity(intent);
            }
        });
        telegramlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://t.me/NSARRAN"));
                startActivity(intent);

            }
        });
        maillogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("message/rfc822");
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"nsarran37@gmail.com"});
                email.setPackage("com.google.android.gm");
                startActivity(email);

            }
        });
    }
}
