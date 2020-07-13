package com.google.calculator;

import android.util.Log;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Calculation {

    private static String s1, s2, a;


    public static String aLlValueTake(String h) throws ScriptException {


        String h2 = "";
        int i;
        for (i = 0; i < h.length(); i++) {


            if (h.charAt(i) == 's' && h.charAt(i + 1) == 'i' && h.charAt(i + 2) == 'n' && h.charAt(i + 3) == '-' && h.charAt(i + 4) == '(') {
                String h1 = "";
                i = i + 5;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                //Log.d("output",h2);
                i = i - 1;
                h1 = arithmatic(h1);
                //Log.d("output",h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.toDegrees(Math.asin(a));
                // System.out.println("Sin= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 'c' && h.charAt(i + 1) == 'o' && h.charAt(i + 2) == 's' && h.charAt(i + 3) == '-' && h.charAt(i + 4) == '(') {
                String h1 = "";
                i = i + 5;
                h1 = h1 + '(';
                int bc = 1;
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.toDegrees(Math.acos(a));
                // System.out.println("Cos= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 't' && h.charAt(i + 1) == 'a' && h.charAt(i + 2) == 'n' && h.charAt(i + 3) == '-' && h.charAt(i + 4) == '(') {
                String h1 = "";
                i = i + 6;
                int bc = 1;
//                for(; h.charAt(i)!=')';i++)
//                {
//                    h1=h1+h.charAt(i);
//                }
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                //Log.d("output",h1);
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.toDegrees(Math.atan(a));
                // System.out.println("tan= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);

            } else if (h.charAt(i) == 's' && h.charAt(i + 1) == 'i' && h.charAt(i + 2) == 'n' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                Log.d("output", h1);
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.sin(Math.toRadians(a));
                // System.out.println("Sin= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 'c' && h.charAt(i + 1) == 'o' && h.charAt(i + 2) == 's' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                h1 = h1 + '(';
                int bc = 1;
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.cos(Math.toRadians(a));
                // System.out.println("Cos= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 't' && h.charAt(i + 1) == 'a' && h.charAt(i + 2) == 'n' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                int bc = 1;
//                for(; h.charAt(i)!=')';i++)
//                {
//                    h1=h1+h.charAt(i);
//                }
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                //Log.d("output",h1);
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.tan(Math.toRadians(a));
                // System.out.println("tan= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);

            } else if (h.charAt(i) == 'c' && h.charAt(i + 1) == 'o' && h.charAt(i + 2) == 't' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = 1 / (Math.tan(Math.toRadians(a)));
                // System.out.println("cot= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 's' && h.charAt(i + 1) == 'e' && h.charAt(i + 2) == 'c' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = 1 / (Math.cos(Math.toRadians(a)));
                // System.out.println("Sec= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 'c' && h.charAt(i + 1) == 's' && h.charAt(i + 2) == 'c' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = 1 / (Math.sin(Math.toRadians(a)));
                // System.out.println("Cosec= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 'l' && h.charAt(i + 1) == 'o' && h.charAt(i + 2) == 'g' && h.charAt(i + 3) == '(') {
                String h1 = "";
                i = i + 4;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.log10(a);
                // System.out.println("log= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == 'l' && h.charAt(i + 1) == 'n' && h.charAt(i + 2) == '(') {
                String h1 = "";
                i = i + 3;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.log1p(a);
                //	 System.out.println("ln= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            }
            else if (h.charAt(i) == '1' && h.charAt(i + 1) == '/' && h.charAt(i + 2) == '(') {
                String h1 = "";
                i = i + 3;
                int bc = 1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = (1/a);
                //	 System.out.println("ln= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);}
            else if (h.charAt(i) == '²') {
                int j = i - 1;
                String h1 = "";
                int bc = 0;

                for ( ; j>=0; j-- )
                {
                    if( bc==0&&(h.charAt(j) == '+' || h.charAt(j) == '*' || h.charAt(j) == '-' || h.charAt(j) == '/') )
                    {
                        break;
                    }else if (h.charAt(j) == ')') {

                        bc++;
                    } else if (h.charAt(j) == '(') {

                        bc--;
                    }


                    h1=h.charAt(j)+h1;
                    h2=removeLastChar(h2);

                }

                h1 = arithmatic(h1);

                double a = Double.parseDouble(h1);
                double inDegrees = Math.pow(a, 2);
                //   System.out.println(inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == '³') {
                int j = i - 1;
                String h1 = "";
                int bc = 0;

                for ( ; j>=0; j-- )
                {
                    if( bc==0&&(h.charAt(j) == '+' || h.charAt(j) == '*' || h.charAt(j) == '-' || h.charAt(j) == '/') )
                    {
                        break;
                    }else if (h.charAt(j) == ')') {

                        bc++;
                    } else if (h.charAt(j) == '(') {

                        bc--;
                    }


                    h1=h.charAt(j)+h1;
                    h2=removeLastChar(h2);

                }

                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = Math.pow(a, 3);
                // System.out.println("tan= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else if (h.charAt(i) == '!') {
                int j = i - 1;
                String h1 = "";

                int bc = 0;


                for ( ; j>=0; j-- )
                {
                    if( bc==0&&(h.charAt(j) == '+' || h.charAt(j) == '*' || h.charAt(j) == '-' || h.charAt(j) == '/') )
                    {
                        break;
                    }else if (h.charAt(j) == ')') {

                        bc++;
                    } else if (h.charAt(j) == '(') {

                        bc--;
                    }


                    h1=h.charAt(j)+h1;
                    h2=removeLastChar(h2);

                }
                //Log.d("output",h1);
                h1 = arithmatic(h1);
                double value=Double.parseDouble(h1);
                int inDegrees = (int)value;
                inDegrees = factorial(inDegrees);
                // System.out.println("tan= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            }
            else if(h.charAt(i)=='√'&& h.charAt(i+1)=='(' )
            {
                String h1="";
                i=i+2;
                int bc=1;
                h1 = h1 + '(';
                while (bc != 0) {
                    if (h.charAt(i) == ')') {
                        h1 = h1 + h.charAt(i);
                        bc--;
                    } else if (h.charAt(i) == '(') {
                        h1 = h1 + h.charAt(i);
                        bc++;
                    } else {
                        h1 = h1 + h.charAt(i);
                    }
                    i++;
                }
                i = i - 1;
                h1=arithmatic(h1);
                double a=Double.parseDouble(h1);
                double inDegrees = Math.sqrt(a);
                // System.out.println("tan= "+inDegrees);
                h2=h2+String.valueOf(inDegrees);
            }
            else if (h.charAt(i) == '%') {
                int j = i - 1;
                String h1 = "";
                int bc = 0;


                for ( ; j>=0; j-- )
                {
                    if( bc==0&&(h.charAt(j) == '+' || h.charAt(j) == '*' || h.charAt(j) == '-' || h.charAt(j) == '/') )
                    {
                        break;
                    }else if (h.charAt(j) == ')') {

                        bc++;
                    } else if (h.charAt(j) == '(') {

                        bc--;
                    }


                    h1=h.charAt(j)+h1;
                    h2=removeLastChar(h2);

                }
                //Log.d("output",h1);
                h1 = arithmatic(h1);
                double a = Double.parseDouble(h1);
                double inDegrees = a / 100;
                // System.out.println("tan= "+inDegrees);
                h2 = h2 + String.valueOf(inDegrees);
            } else {
                h2 = h2 + h.charAt(i);
            }
        }
        Log.d("output", h2);
        h2 = arithmatic(h2);
        return h2;
    }


    public static String arithmatic(String a) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        //Object result = engine.eval("Sin(60)");
        Object result = engine.eval(a);
        //Log.d("output===",""+result);
        double sin1 = Math.sin(60);
        return String.valueOf(result);
    }

    static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }


}
