package com.example.jhumpi.loginpage;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox chkbox;
    EditText etxt1, etxt2;
    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnlgn);
        chkbox = findViewById(R.id.chkBox);
        etxt1 = findViewById(R.id.etxtUser);
        etxt2 = findViewById(R.id.etxtpswrd);

        txt1 = findViewById(R.id.txtUser);
        txt2 = findViewById(R.id.txtpswrd);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(  !chkbox.isChecked()   ){
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.mainLayout),"Unchecked CheckBox",Snackbar.LENGTH_SHORT);
                    snackbar.show();
                    chkbox.setTextColor(Color.RED);
                }else
                if (chkbox.isChecked()) {
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.mainLayout), "Details Saved", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                }
            }
        });

        //onclicklistener on CHECKBOX
        chkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkbox.isChecked()) {
                    chkbox.setTextColor(Color.WHITE);
                }
            }
        });

/*        etxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TAG = " Status : ";
                if(etxt1.isActivated()){
                    Log.i(TAG, "etxt1.isActivated()");
                }
                if(etxt1.isEnabled()){
                    Log.i(TAG,"etxt1.isEnabled()");
                }
                if(etxt1.isHovered()){
                    Log.i(TAG,"etxt1.isHovered()");
                }
                if(etxt1.isClickable()){
                    Log.i(TAG,"etxt1.isClickable()");
                }
                if(etxt1.isDirty()){
                    Log.i(TAG,"etxt1.isDirty()");
                }



            }
        });*/
    }

}
