package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int rara = 0;
    TextView pantalla;
    Button btSen;
    Button btCos;
    Button btTan;
    Button btLog;
    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button btPunto;
    Button btSuma;
    Button btResta;
    Button btMultiplicacion;
    Button btDivision;
    Button btIgual;




    Button btAc;
    String temporal;

    Boolean limpiar = false ;
    Boolean operacion = false ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = findViewById(R.id.textPantalla);
        btSen = findViewById(R.id.btnSen);
        btIgual = findViewById(R.id.btnIgual);
        btIgual.setOnClickListener(this);
        btSen.setOnClickListener(this);
        btAc = findViewById(R.id.btnAc);
        btAc.setOnClickListener(this);
        btCos = findViewById(R.id.btnCos);
        btCos.setOnClickListener(this);
        btTan = findViewById(R.id.btnTan);
        btTan.setOnClickListener(this);
        btLog = findViewById(R.id.btnLog);
        btLog.setOnClickListener(this);
        bt0 = findViewById(R.id.btn0);
        bt0.setOnClickListener(this);
        bt1 = findViewById(R.id.btn1);
        bt1.setOnClickListener(this);
        bt2 = findViewById(R.id.btn2);
        bt2.setOnClickListener(this);
        bt3 = findViewById(R.id.btn3);
        bt3.setOnClickListener(this);
        bt4 = findViewById(R.id.btn4);
        bt4.setOnClickListener(this);
        bt5 = findViewById(R.id.btn5);
        bt5.setOnClickListener(this);
        bt6 = findViewById(R.id.btn6);
        bt6.setOnClickListener(this);
        bt7 = findViewById(R.id.btn7);
        bt7.setOnClickListener(this);
        bt8 = findViewById(R.id.btn8);
        bt8.setOnClickListener(this);
        bt9 = findViewById(R.id.btn9);
        bt9.setOnClickListener(this);
        btPunto = findViewById(R.id.btnPunto);
        btPunto.setOnClickListener(this);
        btSuma = findViewById(R.id.btnSuma);
        btSuma.setOnClickListener(this);
        btResta = findViewById(R.id.btnResta);
        btResta.setOnClickListener(this);
        btMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btMultiplicacion.setOnClickListener(this);
        btDivision = findViewById(R.id.btnDivision);
        btDivision.setOnClickListener(this);
        btIgual = findViewById(R.id.btnIgual);
        btIgual.setOnClickListener(this);





    }
    public String opeRara(){

        try {
            System.out.println();
            Double o = Double.parseDouble(pantalla.getText().toString().substring(4));
            System.out.println("----"+o);

                    switch (rara) {
                        case 1:
                            return Double.toString(Math.sin(Math.toRadians(o)));
                        case 2:
                            return Double.toString(Math.cos(Math.toRadians(o)));
                        case 3:
                            return Double.toString(Math.tan(Math.toRadians(o)));
                        case 4:
                            return Double.toString(Math.log10(o));

                    }
        }catch (Exception e){
            return "Syntaxis error";
        }

        return "mmm";
    }
    public String operar(){
        String todo = pantalla.getText().toString().trim();
        int index = 0;
        char[] chars = todo.toCharArray();

        // Buscamos la posición del primer operador
        for(int i=0; i<chars.length; i++){
            char c = chars[i];
            if(c == '+' || c == '-' || c == '*' || c == '/'){
                index = i;
                break;
            }
        }

        // Si no se encontró operador, retornamos error de sintaxis
        if(index == 0) return "Syntaxis error";

        // Extraemos los números y el operador
        double numero1 = Double.parseDouble(todo.substring(0, index));
        String operacion = Character.toString(chars[index]);
        double numero2 = Double.parseDouble(todo.substring(index+1));
        double numero = numero1+numero2;

        // Realizamos la operación

        if (numero - (int)numero == 0) {
            switch (operacion){
                case "+":
                    int re = (int) (numero1+numero2);
                    return Integer.toString(re);
                case "*":
                    int re1 = (int) (numero1*numero2);
                    return Integer.toString(re1);

                case "/":
                    int re2 = (int) (numero1/numero2);
                    return Integer.toString(re2);

                case "-":
                    int re3 = (int) (numero1-numero2);
                    return Integer.toString(re3);
            }
        } else {
            switch (operacion){
                case "+":
                    double re =  (numero1+numero2);
                    return Double.toString(re);
                case "*":
                    double re1 =  (numero1*numero2);
                    return Double.toString(re1);

                case "/":
                    Double re2 =  (numero1/numero2);
                    return Double.toString(re2);

                case "-":
                    Double re3 =  (numero1-numero2);
                    return Double.toString(re3);
            }
        }

        return "mmm";
    }
    @Override
    public void onClick(View v) {

        if(limpiar){
            pantalla.setText("");
        }

        temporal = pantalla.getText().toString();
        switch (v.getId()){
            case R.id.btn0:
                temporal = temporal+"0";
                pantalla.setText(temporal);
                //operacion = false;
            break;
            case R.id.btn1:
                temporal = temporal+"1";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn2:
                temporal = temporal+"2";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn3:
                temporal = temporal+"3";
                pantalla.setText(temporal);
                //operacion = false;
                break;

            case R.id.btn4:
                temporal = temporal+"4";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn5:
                temporal = temporal+"5";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn6:
                temporal = temporal+"6";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn7:
                temporal = temporal+"7";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn8:
                temporal = temporal+"8";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btn9:
                temporal = temporal+"9";
                pantalla.setText(temporal);
                //operacion = false;
                break;
            case R.id.btnSuma:
                if(operacion){
                    //no hace nada jaja
                }else{
                    temporal = temporal+"+";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;
            case R.id.btnResta:
                if(operacion){
                    //no hace nada jaja
                }else{
                    temporal = temporal+"-";
                    pantalla.setText(temporal);
                }
                //operacion = true;
                break;
            case R.id.btnMultiplicacion:
                if(operacion){
                    //no hace nada jaja
                }else{
                    temporal = temporal+"*";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;
            case R.id.btnDivision:
                if(operacion){
                    //no hace nada jaja
                }else{
                    temporal = temporal+"/";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;
            case R.id.btnPunto:

                    //no hace nada jaja

                    temporal = temporal+".";
                    pantalla.setText(temporal);


                break;
            case R.id.btnSen:
                if(operacion){
                    //no hace nada jaja
                }else {
                    rara = 1;
                    temporal = temporal + "SEN(";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;
            case R.id.btnCos:
                if(operacion){
                    //no hace nada jaja
                }else {
                    rara=2;
                    temporal = temporal + "COS(";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;

            case R.id.btnTan:
                if(operacion){
                    //no hace nada jaja
                }else {
                    rara=3;
                    temporal = temporal + "TAN(";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;
            case R.id.btnLog:
                if(operacion){
                    //no hace nada jaja
                }else {
                    rara = 4;
                    temporal = temporal + "LOG(";
                    pantalla.setText(temporal);
                }
                operacion = true;
                break;
            case R.id.btnAc:
                pantalla.setText("");
                operacion=false;
                rara = 0;
                break;
            case R.id.btnIgual:
                if(rara==0){
                    pantalla.setText(operar());
                }else{
                    pantalla.setText(opeRara());
                }

                operacion = false;
                break;


        }
    }
}