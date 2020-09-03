package com.example.a1stapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    TextView calcScreen;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, division, del, sub, multiply, btnP, ClearAll, Add, equal, dot;
    double val1 = 0, val2 = 0;
    boolean Addition, Subtraction, Multiplication, Division, Remainder, decimal;

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == REQUESTCODE) {
//            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Toast.makeText(this, "!! Welcome !!", Toast.LENGTH_LONG).show();
//            } else {
//                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUESTCODE);
//            }
//        }
//    }

//    protected void runtimePermission() {
//        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUESTCODE);
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        /*
            setting onClick listener to numbers
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcScreen.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcScreen.append("2");
            }
        });

        /*
            setting onClick listener to operators
         */
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcScreen.append(" + ");
//                if (EditText.getText().length() != 0)
//                   val1 = Double.parseDouble(EditText.getText() + "");
//               Addition = true;
//               decimal = false;
//                EditText.setText(null);
            }

       });

            ClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String displayedElements = calcScreen.getText().toString();
                int len = displayedElements.length();
                if (len > 0)
                {//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0)
//                    val1 = Double.parseDouble(EditText.getText() + "");
//                Subtraction = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//        multiply.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               if (EditText.getText().length() != 0)
//                    val1 = Double.parseDouble(EditText.getText() + "");
//                Multiplication = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//        division.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0)
//                    val1 = Double.parseDouble(EditText.getText() + "");
//                Division = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//       });
//        btnP.setOnClickListener(new View.OnClickListener() {
//          @Override
//            public void onClick(View view) {
//                if (EditText.getText().length() != 0) {
//                    val1 = Double.parseDouble(EditText.getText() + "");
//                }
//                Remainder = true;
//                decimal = false;
//                EditText.setText(null);
//            }
//        });
//
                    //       equal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (Addition || Subtraction || Multiplication || Division || Remainder) {
//                   val2 = Double.parseDouble(calcScreen.getText() + "");
//                }
//                if (Addition) {
//                   calcScreen.setText(val1 + val2 + "");
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
//               }
//               if (Remainder) {
//                    EditText.setText(val1 % val2 + "");
//                    Remainder = false;
//                }
//            }
//        });
//       btnF.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                if (decimal) {
//                    //just for fun :) don't think y here is this
//                } else {
//                    EditText.setText(EditText.getText() + ".");
//                    decimal = true;
//               }
//            }
//        });

        /*
            setting onClick listener to delete and clear all Btn
            */

                    calcScreen.setText("");
                  val1 = 0;
                  val2 = 0;
                    Toast.makeText(MainActivity.this, "!! Cleared Everything !!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Nothing Found to clear :-) ", Toast.LENGTH_SHORT).show();
                }
            }
       });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedElements = calcScreen.getText().toString();
                int len = displayedElements.length();
                if (len > 0)
                {
                    displayedElements = displayedElements.substring(0, len - 1);
                    calcScreen.setText(displayedElements);
                }else {
                   Toast.makeText(MainActivity.this, "There is nothing to delete :-) ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void initializeViews()
    {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btn00 = findViewById(R.id.btn00);
        Add = findViewById(R.id.addtion);
        sub = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        del = findViewById(R.id.delete);
        btnP = findViewById(R.id.btnP);
        equal = findViewById(R.id.equals);
        ClearAll = findViewById(R.id.ClearAll);
        dot = findViewById(R.id.dot);
        calcScreen = findViewById(R.id.calcScreen);
    }
}














