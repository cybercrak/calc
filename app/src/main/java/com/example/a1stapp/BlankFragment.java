package com.example.a1stapp;

import android.content.Context;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import org.mariuszgromada.math.mxparser.Expression;

import static android.content.Context.*;
import static androidx.core.content.ContextCompat.getSystemService;
/*




        REMOVE THE COMMENTED LINES FRM EVERY FRAGMENT CREATED OK





 */


/**
 * A simple {@link Fragment} subclass.
// * Use the  factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
//    public static BlankFragment newInstance(String param1, String param2) {
//        BlankFragment fragment = new BlankFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_00, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_del, btn_dot, btn_ClearAll, btn_equal, btn_p;
    TextView calcScreen;


    private Object getSystemService(String vibratorService) {

        return null;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        btn_0 = btn_0.findViewById(R.id.btn0);
        btn_00 = btn_00.findViewById(R.id.btn00);
        btn_1 = btn_1.findViewById(R.id.btn1);
        btn_2 = btn_2.findViewById(R.id.btn2);
        btn_3 = btn_3.findViewById(R.id.btn3);
        btn_4 = btn_4.findViewById(R.id.btn4);
        btn_5 = btn_5.findViewById(R.id.btn5);
        btn_6 = btn_6.findViewById(R.id.btn6);
        btn_7 = btn_7.findViewById(R.id.btn7);
        btn_8 = btn_8.findViewById(R.id.btn8);
        btn_9 = btn_9.findViewById(R.id.btn9);
        btn_Add = btn_Add.findViewById(R.id.addition);
        btn_Sub = btn_Sub.findViewById(R.id.subtract);
        btn_Mul = btn_Mul.findViewById(R.id.multiplication);
        btn_Div = btn_Div.findViewById(R.id.division);
        btn_del = btn_del.findViewById(R.id.delete);
        btn_equal =btn_equal. findViewById(R.id.equal);
        btn_ClearAll =btn_ClearAll. findViewById(R.id.ClearAll);
        btn_dot = btn_dot.findViewById(R.id.dot);
        btn_p = btn_p.findViewById(R.id.btnP);
        calcScreen = calcScreen.findViewById(R.id.calcScreen);




        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("0");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }




        });

        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("00");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("1");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("2");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("3");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("4");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("5");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("6");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("7");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("8");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append("9");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.append(".");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                writeExpression("+");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("*");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });
        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("%");

                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
                String Expression = calcScreen.getText().toString();

                org.mariuszgromada.math.mxparser.Expression exp = new Expression(Expression);
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
                    Toast.makeText(getActivity(), "!!Cleared!!", Toast.LENGTH_SHORT).show();
                    Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    d.vibrate(100);
                } else {
                    Toast.makeText(getActivity(), "$..Nothing found to clear...$", Toast.LENGTH_SHORT).show();
                    Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    d.vibrate(1000);


                }
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedElements = calcScreen.getText().toString();
                int len = displayedElements.length();
                if (len > 0) {
                    displayedElements = displayedElements.substring(0, len - 1);
                    calcScreen.setText(displayedElements);
                } else {

                    Toast.makeText(getActivity(), "Nothing to delete :-)", Toast.LENGTH_SHORT).show();
                }
                Vibrator d = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                d.vibrate(100);
            }
        });
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }



    void writeExpression (String Value1) {
            String expression = calcScreen.getText().toString();
            expression = expression + Value1;
            calcScreen.setText(expression);
        }


    }





