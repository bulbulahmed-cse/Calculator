package com.google.calculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    String ans,input;

    EditText editText;
    boolean shift=false;
    TextView result;
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,bPlus,bSub,bMulti,bDiv,bDot,bEXP,bAns,bEqual,bDel,bAC,bFOB,bFCB
           ,bCot,bSec,bCsc,bLog,bLn,bP,bSin,bCos,bTan,bPi,bRAD,b1DX,bXP2,bNP,bOFF,bRoot,bNRoot,bshift;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        toolbar=(Toolbar)findViewById(R.id.hmtoolbar);
        setSupportActionBar(toolbar);

        editText=(EditText) findViewById(R.id.display);
        editText.setShowSoftInputOnFocus(false);

        result=(TextView) findViewById(R.id.result);
        bshift=(Button)findViewById(R.id.btnshift);
        bSin=(Button)findViewById(R.id.btnsin);
        bCos=(Button)findViewById(R.id.btncos);
        bTan=(Button)findViewById(R.id.btntan);
        n1=(Button)findViewById(R.id.btn1);
        n2=(Button)findViewById(R.id.btn2);
        n3=(Button)findViewById(R.id.btn3);
        n4=(Button)findViewById(R.id.btn4);
        n5=(Button)findViewById(R.id.btn5);
        n6=(Button)findViewById(R.id.btn6);
        n7=(Button)findViewById(R.id.btn7);
        n8=(Button)findViewById(R.id.btn8);
        n9=(Button)findViewById(R.id.btn9);
        n0=(Button)findViewById(R.id.btn0);
        b1DX=(Button)findViewById(R.id.btn1dx);
        bAC=(Button)findViewById(R.id.btnAC);
        bAns=(Button)findViewById(R.id.btnans);
        bCot=(Button)findViewById(R.id.btncot);
        bCsc=(Button)findViewById(R.id.btncsc);
        bDel=(Button)findViewById(R.id.btndel);
        bDiv=(Button)findViewById(R.id.btndiv);
        bDot=(Button)findViewById(R.id.btndot);
        bEqual=(Button)findViewById(R.id.btnequal);
        bEXP=(Button)findViewById(R.id.btnexp);
        bFCB=(Button)findViewById(R.id.btnfcb);
        bFOB=(Button)findViewById(R.id.btnfob);
        bLn=(Button)findViewById(R.id.btnln);
        bLog=(Button)findViewById(R.id.btnlog);
        bMulti=(Button)findViewById(R.id.btnmulti);
        bNP=(Button)findViewById(R.id.btnnp);
        bNRoot=(Button)findViewById(R.id.btnNRoot);
        bPi=(Button)findViewById(R.id.btnpi);
        bPlus=(Button)findViewById(R.id.btnplus);
        bSub=(Button)findViewById(R.id.btnsub);
        bRAD=(Button)findViewById(R.id.btnrad);
        bRoot=(Button)findViewById(R.id.btnroot);
        bXP2=(Button)findViewById(R.id.btnxp2);
        bOFF=(Button)findViewById(R.id.btnxpy);
        bP=(Button)findViewById(R.id.btnp);
        bSec=(Button)findViewById(R.id.btnsec);

       bshift.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(shift==false){
                   shift=true;
                   bSin.setText("sin-1");
                   bCos.setText("cos-1");
                   bTan.setText("tan-1");

               }else if(shift==true){
                   shift=false;
                   bSin.setText("sin");
                   bCos.setText("cos");
                   bTan.setText("tan");

               }
           }
       });

       n0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editText.setText(editText.getText()+"0");
           }
       });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bSin.getText().toString().equals("sin"))
                editText.setText(editText.getText()+"sin(");
                else
                    editText.setText(editText.getText()+"sin-(");
            }
        });

        bCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bCos.getText().toString().equals("cos")){
                editText.setText(editText.getText()+"cos(");}
                else{
                    editText.setText(editText.getText()+"cos-(");}
            }
        });

        bTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bTan.getText().toString().equals("tan"))
                editText.setText(editText.getText()+"tan(");
                else
                    editText.setText(editText.getText()+"tan-(");
            }
        });

        bSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"sec(");
            }
        });

        bCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"cot(");
            }
        });

        bCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"csc(");
            }
        });

        bOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    finish();
            }
        });

        bXP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText(editText.getText() + "²");

            }
        });

        bRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "√(");
            }
        });

        bPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3.1416");

            }
        });

        bNRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"³");
            }
        });

        bNP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"!");
            }
        });

        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"%");
            }
        });


        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"log(");
            }
        });

        bLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"ln(");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });

        bEXP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+ans);
            }
        });

        bRAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b1DX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1/(");
            }
        });

        bFOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"(");
            }
        });

        bFCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+")");
            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input=String.valueOf(editText.getText());
                    editText.setText(removeLastChar(input)+"");


                }catch (Exception e){

                }

            }
        });

        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                result.setText("0");
            }
        });




        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"+");
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"-");
            }
        });

        bMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"*");
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"/");
            }
        });



        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String x;
                    input=String.valueOf(editText.getText());
                    x=Calculation.aLlValueTake(input);
                    ans=x;
                    result.setText(x+"");
                }catch (Exception e){
                    result.setText("Math Error");

                }
            }
        });

    }







    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.aboutMe:
                //Toast.makeText(this,"work",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,AboutMe.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }

    }*/

    static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
}
