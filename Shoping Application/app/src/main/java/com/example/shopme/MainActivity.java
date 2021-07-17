package com.example.shopme;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String item_name;
    int change_color = 1,change_color1 = 1,change_color2 = 1,change_color3 = 1,change_color4 = 1,change_color5 = 1,
            change_color6 = 1,change_color7 = 1,change_color8 = 1,change_color9 = 1;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
    button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
    ImageView imageView,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,
            imageView9,imageView10;
    ImageView icon;
    EditText icon_text;
    TextView ShopMe;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ShopMe = findViewById(R.id.ShopMe);
        icon = findViewById(R.id.icon);
        icon_text = findViewById(R.id.icon_text);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        imageView3 = findViewById(R.id.image3);
        imageView4 = findViewById(R.id.image4);
        imageView5 = findViewById(R.id.image5);
        imageView6 = findViewById(R.id.image6);
        imageView7 = findViewById(R.id.image7);
        imageView8 = findViewById(R.id.image8);
        imageView9 = findViewById(R.id.image9);
        imageView10 = findViewById(R.id.image10);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
       /* icon.setOnClickListener(view -> {
            icon_text.setVisibility(View.VISIBLE);
            icon.setVisibility(View.INVISIBLE);
            imageView.setVisibility(View.INVISIBLE);
            ShopMe.setVisibility(View.INVISIBLE);

        }); */
        button1.setOnClickListener(view -> {
            button1.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi1);
            item_name = "Nmd R1";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            if(change_color==1) {
                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color = 2;
            }else if(change_color==2){
                button2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color = 1;
            }
        });
        button3.setOnClickListener(view -> {
            button3.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi10);
            item_name = "Nmd R1";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button4.setOnClickListener(view -> {
            if(change_color1==1) {
                button4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color1 = 2;
            }else if(change_color1==2){
                button4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color1 = 1;
            }
        });
        button5.setOnClickListener(view -> {
            button5.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi2);
            item_name = "Harden Vol";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button6.setOnClickListener(view -> {
            if(change_color2==1) {
                button6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color2 = 2;
            }else if(change_color2==2){
                button6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color2 = 1;
            }
        });
        button7.setOnClickListener(view -> {
            button7.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi3);
            item_name = "Harden Vol";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button8.setOnClickListener(view -> {
            if(change_color3==1) {
                button8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color3 = 2;
            }else if(change_color3==2){
                button8.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color3 = 1;
            }
        });
        button9.setOnClickListener(view -> {
            button9.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi4);
            item_name = "Basketball Shoes";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button10.setOnClickListener(view -> {
            if(change_color4==1) {
                button10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color4 = 2;
            }else if(change_color4==2){
                button10.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color4 = 1;
            }
        });
        button11.setOnClickListener(view -> {
            button11.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi5);
            item_name = "Rapidarun";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button12.setOnClickListener(view -> {
            if(change_color5==1) {
                button12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color5 = 2;
            }else if(change_color5==2){
                button12.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color5 = 1;
            }
        });
        button13.setOnClickListener(view -> {
            button13.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi6);
            item_name = "Sport Shoes";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button14.setOnClickListener(view -> {
            if(change_color6==1) {
                button14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color6 = 2;
            }else if(change_color6==2){
                button14.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color6 = 1;
            }
        });
        button15.setOnClickListener(view -> {
            button15.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi7);
            item_name = "Ultraboost";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button16.setOnClickListener(view -> {
            if(change_color7==1) {
                button16.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color7 = 2;
            }else if(change_color7==2){
                button16.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color7 = 1;
            }
        });
        button17.setOnClickListener(view -> {
            button17.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi8);
            item_name = "Gulf Shoes";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button18.setOnClickListener(view -> {
            if(change_color8==1) {
                button18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color8 = 2;
            }else if(change_color8==2){
                button18.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color8 = 1;
            }
        });
        button19.setOnClickListener(view -> {
            button19.animate().rotation(360f).setDuration(500);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("resId",R.drawable.adi9);
            item_name = "Basetball Shoes";
            intent.putExtra("Id",item_name);
            startActivity(intent);
        });
        button20.setOnClickListener(view -> {
            if(change_color9==1) {
                button20.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                change_color9 = 2;
            }else if(change_color9==2){
                button20.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                change_color9 = 1;
            }
        });
    }
}