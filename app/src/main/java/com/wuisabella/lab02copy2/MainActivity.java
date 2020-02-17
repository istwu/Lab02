package com.wuisabella.lab02copy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1 ,tv2;
    EditText edit;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        edit = findViewById(R.id.editText);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        Resources res = getResources();
        final String[] arr = res.getStringArray(R.array.array);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv1.setText(edit.getText());
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            int index = 0;

            @Override
            public void onClick(View v){
                if(index == arr.length - 1){
                    index = 0;
                }
                else{
                    index += 1;
                }

                tv2.setText(arr[index]);
            }
        });

    }
}
