package day.tic;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class front extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        ImageView img=(ImageView)findViewById(R.id.img);
        ImageView img2=(ImageView)findViewById(R.id.img2);
        Animation an= AnimationUtils.loadAnimation(this, R.anim.out);
        Animation ff= AnimationUtils.loadAnimation(this, R.anim.animation);
        img.startAnimation(an);
        img2.startAnimation(ff);

        Handler hh=new Handler();
        hh.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent tt=new Intent(getApplicationContext(),info.class);
                startActivity(tt);
                finish();

            }
        },3000);


    }
}
