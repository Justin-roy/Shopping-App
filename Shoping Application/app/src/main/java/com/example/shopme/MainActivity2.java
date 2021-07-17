package com.example.shopme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView image_change;
    Button button26,button27;
    int Chng_clr=1;
    TextView product_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        product_name = findViewById(R.id.product_name);
        Bundle bundle1 = getIntent().getExtras();
        if(bundle1!=null)
        {
            String s = bundle1.getString("Id");
            product_name.setText(s);
        }
        button26.setOnClickListener(view -> {
            if(Chng_clr==1) {
                button26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon2, 0, 0, 0);
                Chng_clr = 2;
                Toast.makeText(this, "Added to Whishlist", Toast.LENGTH_SHORT).show();
            }else if(Chng_clr==2){
                button26.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fav_icon, 0, 0, 0);
                Toast.makeText(this, "Remove from Whishlist", Toast.LENGTH_SHORT).show();
                Chng_clr = 1;
            }
        });
        button27.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent);
        });
        image_change = findViewById(R.id.image_change);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            int resId = bundle.getInt("resId");
            image_change.setImageResource(resId);
        }
    }
}