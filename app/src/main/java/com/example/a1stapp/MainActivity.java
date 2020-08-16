package com.example.a1stapp;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

//import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public int REQUESTCODE = 3;
    EditText EditText = (EditText) findViewById(R.id.edt);
    TextView txt;//txt2;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, btnH, btnD, btnS, btnM, btnP, btnC, btnA, btnE, btnF;
    double val1 = 0, val2 = 0;
    boolean Addition, Subtraction, Multiplication, Division, Remainder;

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
        txt = (TextView) findViewById(R.id.txt);
        //txt2=(TextView) findViewById(R.id.txt2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btn00 = (Button) findViewById(R.id.btn00);
        btnA = (Button) findViewById(R.id.btnA);
        btnS = (Button) findViewById(R.id.btnS);
        btnM = (Button) findViewById(R.id.btnM);
        btnD = (Button) findViewById(R.id.btnD);
        btnP = (Button) findViewById(R.id.btnP);
        btnE = (Button) findViewById(R.id.btnE);
        btnH = (Button) findViewById(R.id.btnH);
        btnC = (Button) findViewById(R.id.btnC);
        btnF = (Button) findViewById(R.id.btnF);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "2");
            }
        });
        btn4.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "4");

            }
        }));
        btn3.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "3");
            }
        }));
        btn5.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "5");
            }
        }));
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "7");
            }
        });
        btn8.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "8");

            }
        }));
        btn9.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "9");
            }
        }));
        btn0.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "0");
            }
        }));
        btn00.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "00");
            }
        }));
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().length() != 0)
                    val1 = Float.parseFloat((EditText.getText() + ""));
                Addition = true;
                EditText.setText(null);
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().length() != 0)
                    val1 = Float.parseFloat((EditText.getText() + ""));
                Subtraction = true;
                EditText.setText(null);
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().length() != 0)
                    val1 = Float.parseFloat((EditText.getText() + ""));
                Multiplication = true;
                EditText.setText(null);
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().length() != 0)
                    val1 = Float.parseFloat((EditText.getText() + ""));
                Division = true;
                EditText.setText(null);
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText.getText().length() != 0) {
                    val1 = Float.parseFloat((EditText.getText() + ""));
                }
                Remainder = true;
                EditText.setText(null);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (Addition) {
                    val2 = Float.parseFloat(EditText.getText() + "");
                }
                if (Addition) {
                    EditText.setText(val1 + val2 + "");
                    Addition = false;
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (Subtraction) {
                    val2 = Float.parseFloat(EditText.getText() + "");
                }
                if (Subtraction) {
                    EditText.setText(val1 - val2 + "");
                    Subtraction = false;
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (Multiplication) {
                    val2 = Float.parseFloat(EditText.getText() + "");
                }
                if (Multiplication) {
                    EditText.setText(val1 * val2 + "");
                    Multiplication = false;
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (Division) {
                    val2 = Float.parseFloat(EditText.getText() + "");
                }
                if (Division) {
                    EditText.setText(val1 / val2 + "");
                    Division = false;
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (Remainder) {
                    val2 = Float.parseFloat(EditText.getText() + "");
                }
                if (Remainder) {
                    EditText.setText(val1 % val2 + "");
                    Remainder = false;
                }
            }
        });

    }
}
