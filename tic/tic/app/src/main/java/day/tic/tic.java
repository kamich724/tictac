package day.tic;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class tic extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic);
    }
    int turn=0;
    int[]  but={0,0,0,0,0,0,0,0,0};
    int[][] scr=new int[3][3];

    public void tap()
    {
        int m=0;
        TextView tt=(TextView)findViewById(R.id.output);
        if(turn==0) {
            tt.setText("Player 1");
        }
        else
        {
            tt.setText("Player 2");

        }
        //player 1
         if(scr[0][0]==1&& scr[0][1]==1&& scr[0][2]==1)
         {m=1 ; }
        else
         if(scr[1][0]==1&& scr[1][1]==1&& scr[1][2]==1)
         {m=1 ; }
         else if(scr[2][0]==1&& scr[2][1]==1&& scr[2][2]==1)
         {m=1 ; }

         else if(scr[0][0]==1&& scr[1][0]==1&& scr[2][0]==1)
         {m=1 ; }

         else if(scr[0][1]==1&& scr[1][1]==1&& scr[2][1]==1)
         {m=1 ; }

         else if(scr[0][2]==1&& scr[1][2]==1&& scr[2][2]==1)
         {m=1 ; }

         else if(scr[0][0]==1&& scr[1][1]==1&& scr[2][2]==1)
         {m=1 ; }

         else if(scr[0][2]==1&& scr[1][1]==1&& scr[2][0]==1)
         {m=1 ; }
        else        //player 2
         if(scr[0][0]==2&& scr[0][1]==2&& scr[0][2]==2)
         {m=2 ; }
         else
         if(scr[1][0]==2&& scr[1][1]==2&& scr[1][2]==2)
         {m=2 ; }
         else if(scr[2][0]==2&& scr[2][1]==2&& scr[2][2]==2)
         {m=2 ; }

         else if(scr[0][0]==2&& scr[1][0]==2&& scr[2][0]==2)
         {m=2 ; }

         else if(scr[0][1]==2&& scr[1][1]==2&& scr[2][1]==2)
         {m=2 ; }

         else if(scr[0][2]==2&& scr[1][2]==2&& scr[2][2]==2)
         {m=2 ; }

         else if(scr[0][0]==2&& scr[1][1]==2&& scr[2][2]==2)
         {m=2 ; }

         else if(scr[0][2]==2&& scr[1][1]==2&& scr[2][0]==2)
         {m=2 ; }
         //Draw
         else if(scr[0][0]!=0&& scr[0][1]!=0&& scr[0][2]!=0&& scr[1][0]!=0&& scr[1][1]!=0&& scr[1][2]!=0
                 && scr[2][0]!=0&& scr[2][1]!=0&& scr[2][2]!=0)
         {m=3 ; }



        
        //payer1
       if(m==1)
        {
            AlertDialog.Builder alr = new AlertDialog.Builder(this);
            alr.setTitle("CONGRATULATION!");
            alr.setMessage("Player ! Wins");
            alr.setCancelable(false);
            alr.setPositiveButton( "Again", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    reset();
                    
                }
            });
            alr.setNegativeButton( "Close", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                   dialog.dismiss();
                    tic.this.finish();

                }
            });
            AlertDialog alert=alr.create();
            alert.show();
        }
        else
      //player 2
       if(m==2)
       {
           AlertDialog.Builder alr = new AlertDialog.Builder(this);
           alr.setTitle("CONGRATULATION!");
           alr.setMessage("Player 2 Wins");
           alr.setCancelable(false);
           alr.setPositiveButton( "Again", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   dialog.dismiss();
                   reset();

               }
           });
           alr.setNegativeButton( "Close", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int which) {
                   tic.this.finish();

               }
           });
           AlertDialog alert=alr.create();
           alert.show();
       }
       //draw
       else if(m==3)
        {
            AlertDialog.Builder alr = new AlertDialog.Builder(this);
            alr.setTitle("HAHAHA!");
            alr.setMessage("Draaw");
            alr.setCancelable(false);
            alr.setPositiveButton( "Again", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    reset();

                }
            });
            alr.setNegativeButton( "Close", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    tic.this.finish();

                }
            });
            AlertDialog alert=alr.create();
            alert.show();
        }
    }

    public void reset()
    {
        ImageButton [] img=new ImageButton[9];
        img[0]=(ImageButton) findViewById(R.id.btn1);
        img[1]=(ImageButton) findViewById(R.id.btn2);
        img[2]=(ImageButton) findViewById(R.id.btn3);
        img[3]=(ImageButton) findViewById(R.id.btn4);
        img[4]=(ImageButton) findViewById(R.id.btn5);
        img[5]=(ImageButton) findViewById(R.id.btn6);
        img[6]=(ImageButton) findViewById(R.id.btn7);
        img[7]=(ImageButton) findViewById(R.id.btn8);
        img[8]=(ImageButton) findViewById(R.id.btn9);
        for(int j=0;j<9;j++)
        {
            img[j].setImageResource(R.drawable.blnk);
            but[j]=0;

        }
        for(int j=0;j<3;j++)
        {
            for(int l=0;l<3;l++)
            {
                scr[j][l]=0;
            }

        }
        turn=0;
    }




                public void btn1(View view)
    {


       if(but[0]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn1);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[0][0]=1;

            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn1);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[0][0]=2;
            }
           but[0]++;
        }
        else
       {
           Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
       }

        tap();


       }




    public void btn2(View view)
    {


        if(but[1]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn2);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[0][1]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn2);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[0][1]=2;
            }
            but[1]++;
        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }




    public void btn3(View view)
        {


        if(but[2]==0){
        if (turn == 0) {
        ImageButton img = (ImageButton) findViewById(R.id.btn3);
        img.setImageResource(R.drawable.cir);
            turn=1;
            scr[0][2]=1;
        } else {

        ImageButton img = (ImageButton) findViewById(R.id.btn3);
        img.setImageResource(R.drawable.tic);
            turn=0;
            scr[0][2]=2;
        }
            but[2]++;
        }
        else
        {
        Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
            tap();
        }
    public void btn4(View view)
    {


        if(but[3]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn4);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[1][0]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn4);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[1][0]=2;
            }
            but[3]++;
        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }
    public void btn5(View view)
    {


        if(but[4]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn5);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[1][1]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn5);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[1][1]=2;
            }
            but[4]++;

        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }
    public void btn6(View view)
    {


        if(but[5]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn6);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[1][2]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn6);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[1][2]=2;            }
            but[5]++;
        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }
    public void btn7(View view)
    {


        if(but[6]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn7);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[2][0]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn7);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[2][0]=2;
            }
            but[6]++;
        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }
    public void btn8(View view)
    {


        if(but[7]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn8);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[2][1]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn8);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[2][1]=2;
            }
            but[7]++;
        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }

    public void btn9(View view)
    {


        if(but[8]==0){
            if (turn == 0) {
                ImageButton img = (ImageButton) findViewById(R.id.btn9);
                img.setImageResource(R.drawable.cir);
                turn=1;
                scr[2][2]=1;
            } else {

                ImageButton img = (ImageButton) findViewById(R.id.btn9);
                img.setImageResource(R.drawable.tic);
                turn=0;
                scr[2][2]=2;
            }
            but[8]++;
        }
        else
        {
            Toast.makeText(this,"Galat Baat",Toast.LENGTH_LONG).show();
        }
        tap();
    }

        }

