


package com.example.administrator.buttonchangechenzhimin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton home;
    private ImageButton category;
    private ImageButton cart;
    private ImageButton personal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home=(ImageButton)findViewById(R.id.imageButton);
        home.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    home.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_normal));
                    category.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                    cart.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                    personal.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
                }
                return false;
            }
        });
        category=(ImageButton)findViewById(R.id.imageButton2);
        category.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    home.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                    category.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_normal));
                    cart.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                    personal.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
                }
                return false;
            }
        });
        cart=(ImageButton)findViewById(R.id.imageButton3);
        cart.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    home.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                    category.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                    cart.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_normal));
                    personal.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
                }
                return false;
            }
        });
        personal=(ImageButton)findViewById(R.id.imageButton4);
        personal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    home.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                    category.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                    cart.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                    personal.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_normal));
                }
                return false;
            }
        });
    }
}
