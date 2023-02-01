package com.abhinav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 *
 * @author Abhinav Tyagi
 *
 */
public class AddActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b1;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.btnAdd);
        tv3 = (TextView) findViewById(R.id.tv3);

        b1.setOnClickListener(v -> {
            System.out.println("Clicked on Add button");
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int k = num1 + num2;
            tv3.setText("Addition is: " + k);
        });
    }

//        inner class
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("Clicked on Add button");
//                int num1 = Integer.parseInt(et1.getText().toString());
//                int num2 = Integer.parseInt(et2.getText().toString());
//                int k = num1 + num2;
//                tv3.setText("Addition is: " + k);
//            }
//        });
//    }

//    public void add(View v){
//        System.out.println("Clicked on Add button");
//        int num1 = Integer.parseInt(et1.getText().toString());
//        int num2 = Integer.parseInt(et2.getText().toString());
//        int k = num1 + num2;
//        tv3.setText("Addition is: " + k);
//    }
}