package com.example.a1stapp;

import org.mariuszgromada.math.mxparser.*;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    static DrawerLayout  drawerlayout;
    AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerlayout = findViewById(R.id.drawer);


        findViewById(R.id.burger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerlayout.openDrawer(GravityCompat.START);
            }

        });
        NavigationView navigationView = findViewById(R.id.navView);
        NavController navController = Navigation.findNavController(this, R.id.frag);
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.blankFragment, R.id.mainActivity2).build();
        NavigationUI.setupWithNavController(navigationView, navController);

    }
    @Override
    public boolean onSupportNavigateUp(){
        NavController navController = Navigation.findNavController(this,R.id.frag);
        return NavigationUI.navigateUp(navController,mAppBarConfiguration)||super.onSupportNavigateUp();
    }

}
















