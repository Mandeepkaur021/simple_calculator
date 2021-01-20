package com.mandeep.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView output;
    Button buttonAdd, buttonSubtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.first_number_input);
        secondNumber = findViewById(R.id.second_number_input);
        output = findViewById(R.id.output);
        buttonAdd = findViewById(R.id.button_add);
        buttonSubtract = findViewById(R.id.button_subtract);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumbers();
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtractNumbers();
            }
        });
    }

    private void subtractNumbers() {
        double first = Double.parseDouble(firstNumber.getText().toString());
        double second = Double.parseDouble(secondNumber.getText().toString());
        output.setText(String.valueOf(first - second));
    }

    private void addNumbers() {
        double first = Double.parseDouble(firstNumber.getText().toString());
        double second = Double.parseDouble(secondNumber.getText().toString());
        output.setText(String.valueOf(first + second));
    }
}