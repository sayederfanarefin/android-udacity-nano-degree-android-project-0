package info.sayederfanarefin.www.myapplicationapppportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button pm,sw,bib,myam,gu,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pm = (Button) findViewById(R.id.pm);
        sw = (Button) findViewById(R.id.button2);
        bib = (Button) findViewById(R.id.button3);
        myam = (Button) findViewById(R.id.button4);
        gu = (Button) findViewById(R.id.button5);
        c = (Button) findViewById(R.id.button6);

        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "This button wil launch my Popular Movies app!",Toast.LENGTH_LONG).show();
            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "This button wil launch my Stock Hawk app!",Toast.LENGTH_LONG).show();
            }
        });

        bib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "This button wil launch my Build It Bigger app!",Toast.LENGTH_LONG).show();
            }
        });

        myam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "This button wil launch my Make Your App Material app!",Toast.LENGTH_LONG).show();
            }
        });

        gu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "This button wil launch my Go Ubiquitous  app!",Toast.LENGTH_LONG).show();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "This button wil launch my Capstone app!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
