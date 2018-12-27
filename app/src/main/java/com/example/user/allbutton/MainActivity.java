package com.example.user.allbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.spark.submitbutton.SubmitButton;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    MagicButton magicButton;
    SubmitButton btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magicButton=findViewById(R.id.magic_parent);
        btnSubmit=findViewById(R.id.btn_submit);
        magicButton.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.magic_parent:
                Toast.makeText(this, "Magic Button is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_submit:
                Toast.makeText(this, "Submit Button is Clicked", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
