package com.example.l.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        final EditText editText3=(EditText)findViewById(R.id.editText03);
        Button button3=(Button)findViewById(R.id.buttonSub);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                StringBuffer uristringbuffer=new StringBuffer("tel:");
                uristringbuffer.append(editText3.getText().toString());
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+editText3.getText()));
                Intent intent2=new Intent(null,Uri.parse(String.valueOf(uristringbuffer)));
                setResult(RESULT_OK,intent2);
                startActivity(intent);
                finish();
            }
        });
    }
}
