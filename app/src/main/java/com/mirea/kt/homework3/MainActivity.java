package com.mirea.kt.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btstart = findViewById(R.id.btstart);
        btstart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
            Log.i("calc_app", "Click calc button");
            EditText et1tri = findViewById(R.id.et1tri);
            EditText et2tri = findViewById(R.id.et2tri);
            EditText et3tri = findViewById(R.id.et3tri);
            EditText et1sq = findViewById(R.id.et1sq);
            EditText et2sq = findViewById(R.id.et2sq);
            TextView tvtri = findViewById(R.id.tvtri);
            TextView tvsq = findViewById(R.id.tvsq);
            String tri1 = et1tri.getText().toString();
            String tri2 = et2tri.getText().toString();
            String tri3 = et3tri.getText().toString();
            String sq1 = et1sq.getText().toString();
            String sq2 = et2sq.getText().toString();
            if (!tri1.isEmpty() && !tri2.isEmpty() && !tri3.isEmpty() && !sq1.isEmpty() && !sq2.isEmpty()){
                int a_tri = Integer.parseInt(tri1);
                int b_tri = Integer.parseInt(tri2);
                int c_tri = Integer.parseInt(tri3);
                int a_sq = Integer.parseInt(sq1);
                int b_sq = Integer.parseInt(sq2);
                if (a_tri+b_tri<c_tri || a_tri+c_tri<b_tri || b_tri+c_tri<a_tri){
                    tvtri.setText("Треугольника с такими сторонами не существует. Попробуйте снова");
                    Log.i("calc_app", "Triangle doesn't exist");
                }else{
                    double p_tri=((double)a_tri+(double)b_tri+(double)c_tri)/2;
                    double res_tri=Math.sqrt((p_tri-a_tri)*(p_tri-b_tri)*(p_tri-c_tri)*p_tri);
                    tvtri.setText(String.valueOf(res_tri));
                    Log.i("calc_app", "Triangle square is " + res_tri);
                }
                int res_sq=a_sq*b_sq;
                tvsq.setText(String.valueOf(res_sq));
                Log.i("calc_app", "Triangle square is " + res_sq);
            }
    }
}