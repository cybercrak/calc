package com.example.a1stapp;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

//import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public int REQUESTCODE = 3;
    TextView EditText;//txt2;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, btnH, btnD, btnS, btnM, btnP, btnC, btnA, btnE, btnF;
    double val1 = 0, val2 = 0;
    boolean Addition, Subtraction, Multiplication, Division, Remainder, decimal;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUESTCODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "!! Welcome !!", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUESTCODE);
            }
        }
    }

    /*protected void runtimePermission() {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUESTCODE);
        }
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //txt2=(TextView) findViewById(R.id.txt2);
//        btn1 = findViewById(R.id.btn1);
//        btn2 = findViewById(R.id.btn2);
//        btn3 = findViewById(R.id.btn3);
//        btn4 = findViewById(R.id.btn4);
//        btn5 = findViewById(R.id.btn5);
//        btn6 = findViewById(R.id.btn6);
//        btn7 = findViewById(R.id.btn7);
//        btn8 = findViewById(R.id.btn8);
//        btn9 = findViewById(R.id.btn9);
//        btn0 = findViewById(R.id.btn0);
//        btn00 = findViewById(R.id.btn00);
//        btnA = findViewById(R.id.btnA);
//        btnS = findViewById(R.id.btnS);
//        btnM = findViewById(R.id.btnM);
//        btnD = findViewById(R.id.btnD);
//        btnP = findViewById(R.id.btnP);
//        btnE = findViewById(R.id.btnE);
//        btnH = findViewById(R.id.btnH);
//        btnC = findViewById(R.id.btnC);
//        btnF = findViewById(R.id.btnF);
//        EditText = findViewById(R.id.edt);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "1");
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "2");
//            }
//        });
//        btn4.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "4");
//
//            }
//        }));
//        btn3.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "3");
//            }
//        }));
//        btn5.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "5");
//            }
//        }));
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "6");
//            }
//        });
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "7");
//            }
//        });
//        btn8.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "8");
//
//            }
//        }));
//        btn9.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "9");
//            }
//        }));
//        btn0.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "0");
//            }
//        }));
//        btn00.setOnClickListener((new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                EditText.setText(EditText.getText() + "00");
//            }
//        }));
//        btnA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (EditText.getText().length() != 0)
//                    val1 = Float.parseFloat((EditText.getText() + ""));
//                Addition = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//
//        });
//        btnS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0)
//                    val1 = Float.parseFloat((EditText.getText() + ""));
//                Subtraction = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//        btnM.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0)
//                    val1 = Float.parseFloat((EditText.getText() + ""));
//                Multiplication = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//        btnH.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0)
//                    val1 = Float.parseFloat((EditText.getText() + ""));
//                Division = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//        btnP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0) {
//                    val1 = Float.parseFloat((EditText.getText() + ""));
//                }
//                Remainder = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//
//        btnE.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                if (Addition || Subtraction || Multiplication || Division || Remainder) {
//                    val2 = Float.parseFloat(EditText.getText() + "");
//                }
//                if (Addition) {
//                    EditText.setText(val1 + val2 + "");
//                    Addition = false;
//                }
//                if (Subtraction) {
//                    EditText.setText(val1 - val2 + "");
//                    Subtraction = false;
//                }
//
//                if (Multiplication) {
//                    EditText.setText(val1 * val2 + "");
//                    Multiplication = false;
//                }
//                if (Division) {
//                    EditText.setText(val1 / val2 + "");
//                    Division = false;
//                }
//                if (Remainder) {
//                    EditText.setText(val1 % val2 + "");
//                    Remainder = false;
//                }
//            }
//        });
//        btnF.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                if (decimal) {
//                    //just for fun :) don't think y here is this
//                } else {
//                    EditText.setText(EditText.getText() + ".");
//                    decimal = true;
//                }
//            }
//        });
//        btnC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                EditText.setText("");
//                val1 = 0;
//                val2 = 0;
//            }
//        });
//        btnD.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String displayedElements = EditText.getText().toString();
//                int len = displayedElements.length();
//                if (len > 0) {
//                    displayedElements = displayedElements.substring(0, len - 1);
//                    EditText.setText(displayedElements);
//                }
//            }
//        });

    }
}

