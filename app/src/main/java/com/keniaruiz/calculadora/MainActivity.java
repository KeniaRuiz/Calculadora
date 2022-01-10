package com.keniaruiz.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultado, operacion;
    private Button suma, resta, multiplicacion, division, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, borrar, borrarTodo, igual;
    private String operando = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.TextResultado);
        operacion = (TextView) findViewById(R.id.TextOperacion);

        suma = (Button) findViewById(R.id.button_suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = operacion.getText().toString();
                operando = "+";

                if(resultado.getText().toString().isEmpty()) {
                if (operacion.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Operación no valida",
                            Toast.LENGTH_SHORT).show();
                } else if(!t.contains("+") && !t.contains("-") && !t.contains("*") && !t.contains("/") ){
                    operacion.setText(operacion.getText().toString() + "+");
                }
            }else{
                    operacion.setText(resultado.getText().toString()+"+");
                    resultado.setText("");
                }
            }
        });

        resta = (Button) findViewById(R.id.button_resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = operacion.getText().toString();
                operando = "-";

                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this,
                                "Operación no valida",
                                Toast.LENGTH_SHORT).show();
                    } else if (!t.contains("+") && !t.contains("-") && !t.contains("*") && !t.contains("/")) {
                        operacion.setText(operacion.getText().toString() + "-");
                    }
                }else{
                    operacion.setText(resultado.getText().toString()+"-");
                    resultado.setText("");
                }
            }
        });

        multiplicacion = (Button) findViewById(R.id.button_multiplicacion);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = operacion.getText().toString();
                operando = "*";
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this,
                                "Operación no valida",
                                Toast.LENGTH_SHORT).show();
                    } else if (!t.contains("+") && !t.contains("-") && !t.contains("*") && !t.contains("/")) {
                        operacion.setText(operacion.getText().toString() + "*");
                    }
                }else{
                    operacion.setText(resultado.getText().toString()+"*");
                    resultado.setText("");
                }
            }
        });

        division = (Button) findViewById(R.id.button_division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = operacion.getText().toString();
                operando = "/";
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this,
                                "Operación no valida",
                                Toast.LENGTH_SHORT).show();
                    } else if (!t.contains("+") && !t.contains("-") && !t.contains("*") && !t.contains("/")) {
                        operacion.setText(operacion.getText().toString() + "/");
                    }
                }else{
                    operacion.setText(resultado.getText().toString()+"/");
                    resultado.setText("");
                }
            }
        });

        uno = (Button) findViewById(R.id.button_uno);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()){
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("1");
                    } else {
                        operacion.setText(operacion.getText().toString() + "1");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        dos = (Button) findViewById(R.id.button_dos);
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("2");
                    } else {
                        operacion.setText(operacion.getText().toString() + "2");
                    }
                }else{
                Toast.makeText(MainActivity.this,
                        "Borrar todo o hacer otra operación",
                        Toast.LENGTH_SHORT).show();
            }
            }
        });

        tres = (Button) findViewById(R.id.button_tres);
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("3");
                    } else {
                        operacion.setText(operacion.getText().toString() + "3");
                    }
                }else{
                Toast.makeText(MainActivity.this,
                        "Borrar todo o hacer otra operación",
                        Toast.LENGTH_SHORT).show();
            }
            }
        });

        cuatro = (Button) findViewById(R.id.button_cuatro);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("4");
                    } else {
                        operacion.setText(operacion.getText().toString() + "4");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        cinco = (Button) findViewById(R.id.button_cinco);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("5");
                    } else {
                        operacion.setText(operacion.getText().toString() + "5");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        seis = (Button) findViewById(R.id.button_seis);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("6");
                    } else {
                        operacion.setText(operacion.getText().toString() + "6");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        siete = (Button) findViewById(R.id.button_siete);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("7");
                    } else {
                        operacion.setText(operacion.getText().toString() + "7");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        ocho = (Button) findViewById(R.id.button_ocho);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("8");
                    } else {
                        operacion.setText(operacion.getText().toString() + "8");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        nueve = (Button) findViewById(R.id.button_nueve);
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("9");
                    } else {
                        operacion.setText(operacion.getText().toString() + "9");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        cero = (Button) findViewById(R.id.button_cero);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (operacion.getText().toString().isEmpty()) {
                        operacion.setText("0");
                    } else {
                        operacion.setText(operacion.getText().toString() + "0");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        punto = (Button) findViewById(R.id.button_punto);
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado.getText().toString().isEmpty()) {
                    if (!String.valueOf(operacion.getText()).contains(".")) {
                        operacion.setText(operacion.getText() + ".");
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        borrar = (Button) findViewById(R.id.button_borrar);
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().toString().isEmpty()) {
                    String ecuacion = operacion.getText().toString();
                    ecuacion = ecuacion.substring(0, ecuacion.length() - 1);
                    operacion.setText(ecuacion);
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        borrarTodo = (Button) findViewById(R.id.button_borrarTodo);
        borrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operando = "";
                operacion.setText("");
                resultado.setText("");
            }
        });

        igual = (Button) findViewById(R.id.button_igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().toString().isEmpty()) {
                    String ecuacion = operacion.getText().toString();
                    float result = 0.0f;

                    if (operando.equals("/")) {
                        String[] split = ecuacion.split("/");

                        if (Float.parseFloat(split[1]) != 0.0f) {
                            result = Float.parseFloat(split[0]) / Float.parseFloat(split[1]);
                        } else {
                            result = 0.0f;
                            Toast.makeText(MainActivity.this,
                                    "Operación no valida",
                                    Toast.LENGTH_SHORT).show();
                        }
                    } else if (operando.equals("*")) {
                        String[] split = ecuacion.split("\\*");
                        result = Float.parseFloat(split[0]) * Float.parseFloat(split[1]);

                    } else if (operando.equals("-")) {
                        String[] split = ecuacion.split("-");
                        result = Float.parseFloat(split[0]) - Float.parseFloat(split[1]);
                    } else if (operando.equals("+")) {
                        String[] split = ecuacion.split("\\+");
                        result = Float.parseFloat(split[0]) + Float.parseFloat(split[1]);
                    }
                    resultado.setText(result + "");
                    operando = "";
                }else{
                    Toast.makeText(MainActivity.this,
                            "Borrar todo o hacer otra operación",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}