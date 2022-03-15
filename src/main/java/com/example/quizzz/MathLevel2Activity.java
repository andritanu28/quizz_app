package com.example.quizzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MathLevel2Activity extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_level2);

        next = findViewById(R.id.mathlevel2_btn_next);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView toolbarText = (TextView)
                findViewById(R.id.toolbar_text);
        if(toolbarText!=null && toolbar!=null) {
            toolbarText.setText(getTitle());
            setSupportActionBar(toolbar);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathLevel2Activity.this, MathLevel3Activity.class);
                startActivity(intent);
            }
        });
        
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
