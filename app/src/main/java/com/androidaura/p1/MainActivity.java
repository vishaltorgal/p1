package com.androidaura.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv;
        LinearLayout layout;
        LinearLayout.LayoutParams lp;


        HorizontalScrollView sv = new HorizontalScrollView(this);
        sv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        LinearLayout mainlayout = new LinearLayout(this);
        mainlayout.setOrientation(LinearLayout.HORIZONTAL);
        mainlayout.setBackgroundColor(Color.YELLOW);
        mainlayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(150, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(5, 5, 5, 5);
        tv.setLayoutParams(lp);
        tv.setText("1");
        tv.setBackgroundColor(Color.GREEN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(12);
        layout.addView(tv);



        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(5, 5, 5, 5);
        tv.setLayoutParams(lp);
        tv.setText("2");
        tv.setBackgroundColor(Color.GREEN);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(24);
        layout.addView(tv);


        tv = new TextView(this);
        lp = new LinearLayout.LayoutParams(600, ViewGroup.LayoutParams.MATCH_PARENT);
        lp.setMargins(5, 5, 5, 5);
        tv.setLayoutParams(lp);
        tv.setBackgroundColor(Color.GREEN);
        tv.setText("3");
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(48);
        layout.addView(tv);

        mainlayout.addView(layout);
        sv.addView(mainlayout);
        setContentView(sv);
    }
}