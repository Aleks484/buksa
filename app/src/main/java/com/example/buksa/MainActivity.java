package com.example.buksa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView editTextNumberDecimal;
    private TextView editTextNumberDecimal4;
    private TextView editTextNumberDecimal5;
    private TextView textView4;

   private Button button;


    private TextView editTextNumberDecimal2;
    private TextView editTextNumberDecimal6;
    private TextView editTextNumberDecimal7;

    private TextView textView14;
    private TextView textView15;
    private Button button2;


    private TextView editTextNumberDecimal3;
    private TextView editTextNumberDecimal8;
    private TextView editTextNumberDecimal9;

    private TextView textView17;
    private TextView textView18;
    private Button button3;


    private Button button4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация элементов интерфейса
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal4 = findViewById(R.id.editTextNumberDecimal4);
        editTextNumberDecimal5 = findViewById(R.id.editTextNumberDecimal5);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);

        editTextNumberDecimal2= findViewById(R.id.editTextNumberDecimal2);
        editTextNumberDecimal6 = findViewById(R.id.editTextNumberDecimal6);
        editTextNumberDecimal7 = findViewById(R.id.editTextNumberDecimal7);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        button2 = findViewById(R.id.button2);

        editTextNumberDecimal3= findViewById(R.id.editTextNumberDecimal3);
        editTextNumberDecimal8 = findViewById(R.id.editTextNumberDecimal8);
        editTextNumberDecimal9 = findViewById(R.id.editTextNumberDecimal9);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        button3 = findViewById(R.id.button3);

        button4 = findViewById(R.id.button4);

        // Настройка обработчика нажатия на кнопку
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        //Считаем с editText и editText2 текстовые значения
        String S = editTextNumberDecimal.getText().toString();
        String S4 = editTextNumberDecimal4.getText().toString();
        String S5 = editTextNumberDecimal5.getText().toString();


                double a, a4, a5, c1;


                //Преобразуем текстовые переменные в числовые значения

                a = Double.parseDouble(S);
                a4 = Double.parseDouble(S4);
                a5 = Double.parseDouble(S5);



                //Проведем с числовыми переменными нужные действия

                c1 = ((a4 - a5) - a) / 2;



                //Преобразуем ответ в число
                String Sres1 = Double.toString(c1);



                //Выведем текст в textView
                textView4.setText(Sres1);


            }
        });

        // Настройка обработчика нажатия на кнопку
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Считаем с editText и editText2 текстовые значения

                String S2 = editTextNumberDecimal2.getText().toString();
                String S6 = editTextNumberDecimal6.getText().toString();
                String S7 = editTextNumberDecimal7.getText().toString();



                double a2,a6,a7,c2;


                //Преобразуем текстовые переменные в числовые значения


                a2 = Double.parseDouble(S2);
                a6 = Double.parseDouble(S6);
                a7 = Double.parseDouble(S7);


                //Проведем с числовыми переменными нужные действия


                c2 = ((a7 - a6) - a2) / 2;


                //Преобразуем ответ в число
                String Sres2 = Double.toString(Math.abs(c2));

                //Выведем текст в textView

                if(c2<0)
                    textView14.setText("влево");
                if(c2>0)
                    textView14.setText("вправо");


                textView15.setText(Sres2);

            }
        });


        // Настройка обработчика нажатия на кнопку
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Считаем с editText и editText2 текстовые значения

                String S3 = editTextNumberDecimal3.getText().toString();
                String S8 = editTextNumberDecimal8.getText().toString();
                String S9 = editTextNumberDecimal9.getText().toString();


                double a3,a8,a9,c3;


                //Преобразуем текстовые переменные в числовые значения


                a3 = Double.parseDouble(S3);
                a8 = Double.parseDouble(S8);
                a9 = Double.parseDouble(S9);


                //Проведем с числовыми переменными нужные действия


                c3 = ((a8 - a9) - a3) / 2;



                //Преобразуем ответ в число
                String Sres3 = Double.toString(Math.abs(c3));

                //Выведем текст в textView

                if(c3<0)
                    textView17.setText("влево");
                if(c3>0)
                    textView17.setText("вправо");


                textView18.setText(Sres3);

            }
        });


        // Настройка обработчика нажатия на кнопку
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Выведем текст в textView

                editTextNumberDecimal.setText("7.8");
                editTextNumberDecimal4.setText(" ");
                editTextNumberDecimal5.setText(" ");
                textView4.setText(" ");

                editTextNumberDecimal2.setText("1.8");
                editTextNumberDecimal6.setText(" ");
                editTextNumberDecimal7.setText(" ");
                textView14.setText(" ");
                textView15.setText(" ");

                editTextNumberDecimal3.setText("1.8");
                editTextNumberDecimal8.setText(" ");
                editTextNumberDecimal9.setText(" ");
                textView17.setText(" ");
                textView18.setText(" ");


            }
        });



    }
}