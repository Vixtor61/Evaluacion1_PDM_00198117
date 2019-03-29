package com.example.evaluacion1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.evaluacion1sol.models.AppConstants;
import com.example.evaluacion1sol.models.User;

public class MainActivity extends AppCompatActivity {
    private User mUSer;
    private LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private Button btn;
    private EditText mEd,mEd2;
    int i1= 0,i2= 0,i3 =0,i4=0,i5=0,i6=0,i7=0,i8=0,i9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUSer= new User();
        mUSer.setmName("HOLA");
        mUSer.setmEmail("slkjdlsa@lsakjd.com");
        setContent();
    }
    public void setContent(){
        mEd = findViewById(R.id.user_name);
        mEd2 = findViewById(R.id.user_email);
        btn = findViewById(R.id.send);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);
        l5 = findViewById(R.id.l5);
        l6 = findViewById(R.id.l6);
        l7 = findViewById(R.id.l7);
        l8 = findViewById(R.id.l8);
        l9 = findViewById(R.id.l9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUSer.setmName(mEd.getText().toString());
                mUSer.setmEmail(mEd2.getText().toString());




                Intent intent  = new Intent(MainActivity.this,ShareActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(AppConstants.KEY,mUSer);
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1++;
                Toast.makeText(MainActivity.this,Integer.toString(i1),Toast.LENGTH_LONG).show();
                mUSer.setmProduct(0,i1);

            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2++;
                mUSer.setmProduct(1,i2);

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3++;
                mUSer.setmProduct(2,i3);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i4++;
                mUSer.setmProduct(3,i4);

            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i5++;
                mUSer.setmProduct(4,i5);

            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i6++;
                mUSer.setmProduct(5,i6);

            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i7++;
                mUSer.setmProduct(6,i7);

            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i8++;
                mUSer.setmProduct(7,i8);
            }
        });
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i9++;
                mUSer.setmProduct(8,i9);
            }
        });
    }
}
