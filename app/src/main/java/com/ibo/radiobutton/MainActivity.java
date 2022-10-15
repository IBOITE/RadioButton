package com.ibo.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogr);
        textView=findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton=findViewById(checkedId);

                switch (radioButton.getId())
                {
                    case R.id.radioButton1:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Pizza");
                        //مالها علاقة بالبرنامج \ مشان تابع التحرك ب logcat
                        Log.d("logid","Pizza");
                        break;
                    }
                    case R.id.radioButton2:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("shawrma");
                        Log.d("logid","shawrma");
                        break;
                    }
                    case R.id.radioButton3:{
                        textView.setVisibility(View.VISIBLE);
                        textView.setText("Pepesi");
                        Log.d("logid","Pepesi");
                        break;
                    }
                }
            }
        });
    }
}