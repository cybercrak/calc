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
/*


THIS ACTIVITY SHOULD CONTAIN ONLY NAV ITEMS CALC CODE SHOULD BE IN ITS RESPECTIVE ACTIVITY



 */
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_00, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_del, btn_dot, btn_ClearAll, btn_equal, btn_p;
    TextView calcScreen;
//    int Value1;
    static DrawerLayout  drawerlayout;
    AppBarConfiguration mAppBarConfiguration;


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this,R.id.frag);
        return NavigationUI.navigateUp(navController,mAppBarConfiguration)||super.onSupportNavigateUp();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerlayout = findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.navView);
        NavController navController = Navigation.findNavController(this, R.id.frag);
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.blankFragment, R.id.mainActivity2).build();
        NavigationUI.setupWithNavController(navigationView, navController);


        btn_0 = findViewById(R.id.btn0);
        btn_00 = findViewById(R.id.btn00);
        btn_1 = findViewById(R.id.btn1);
        btn_2 = findViewById(R.id.btn2);
        btn_3 = findViewById(R.id.btn3);
        btn_4 = findViewById(R.id.btn4);
        btn_5 = findViewById(R.id.btn5);
        btn_6 = findViewById(R.id.btn6);
        btn_7 = findViewById(R.id.btn7);
        btn_8 = findViewById(R.id.btn8);
        btn_9 = findViewById(R.id.btn9);
        btn_Add = findViewById(R.id.addition);
        btn_Sub = findViewById(R.id.subtract);
        btn_Mul = findViewById(R.id.multiplication);
        btn_Div = findViewById(R.id.division);
        btn_del = findViewById(R.id.delete);
        btn_equal = findViewById(R.id.equal);
        btn_ClearAll = findViewById(R.id.ClearAll);
        btn_dot = findViewById(R.id.dot);
        btn_p = findViewById(R.id.btnP);
        calcScreen = findViewById(R.id.calcScreen);

        findViewById(R.id.burger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerlayout.openDrawer(GravityCompat.START);
            }

        });


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("0");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("00");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("1");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("2");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("3");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("4");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("5");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("6");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("7");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("8");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("9");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append(".");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                writeExpression("+");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate( 100);
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("*");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });
        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("%");

                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
                String Expression = calcScreen.getText().toString();

                Expression exp = new Expression(Expression);
                String result = String.valueOf(exp.calculate());
                calcScreen.setText(result);

            }
        });

        btn_ClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = calcScreen.getText().toString();
                int len = displayedElements.length();
                if (len > 0) {
                    calcScreen.setText("");
                    Toast.makeText(MainActivity.this, "!!Cleared!!", Toast.LENGTH_SHORT).show();
                    Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    d.vibrate(100);
                } else {
                    Toast.makeText(MainActivity.this, "$..Nothing found to clear...$", Toast.LENGTH_SHORT).show();
                    Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    d.vibrate(1000);


                }
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedElements = calcScreen.getText().toString();//
                int len = displayedElements.length();
                if (len > 0) {
                    displayedElements = displayedElements.substring(0, len - 1);
                    calcScreen.setText(displayedElements);
                } else {
                    Toast.makeText(MainActivity.this, "Nothing to delete :-)", Toast.LENGTH_SHORT).show();
                }
                Vibrator d = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        }



        void writeExpression (String Value1) {
            String expression = calcScreen.getText().toString();
            expression = expression + Value1;
            calcScreen.setText(expression);
        }


}
















