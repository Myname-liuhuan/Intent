package com.example.l.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Otheractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otheractivity);

        final EditText editText01=(EditText)findViewById(R.id.editTextother);
        Button buttonother01=(Button)findViewById(R.id.buttonOther1);
        Button buttonother02=(Button)findViewById(R.id.buttonOther2);

        buttonother01.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String uristring=editText01.getText().toString();
                Uri data=Uri.parse(uristring);
                Intent result =new Intent(null,data);
                setResult(RESULT_OK,result);
                finish();
            }
        });

        buttonother02.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                String uristring=editText01.getText().toString();
//                Uri data=Uri.parse(uristring);
//                Intent result =new Intent(null,data);
                setResult(RESULT_CANCELED,null);
                finish();
            }
        });
    }
}
