package day.tic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Button but = (Button) findViewById(R.id.but);
        Button but2 = (Button) findViewById(R.id.but2);
        Animation an = AnimationUtils.loadAnimation(this, R.anim.slide);
     but.startAnimation(an);
        but2.startAnimation(an);

    }
    public void but(View view) {

                Intent tt = new Intent(getApplicationContext(), tic.class);
                startActivity(tt);



    }
    public void but2(View view) {

                Intent tt = new Intent(getApplicationContext(), ff.class);
                startActivity(tt);
            }


    }


