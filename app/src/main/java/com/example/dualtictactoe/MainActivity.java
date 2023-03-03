package com.example.dualtictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private int currentPlayer = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find references to all nine buttons in the layout
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        // Set a click listener on each button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button1.setText("X");
                        currentPlayer = 2;
                    } else {
                        button1.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }
        });
        // Repeat this process for all other buttons in the layout
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button2.setText("X");
                        currentPlayer = 2;
                    } else {
                        button2.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (button3.getText().toString().isEmpty()) {
                if (currentPlayer == 1) {
                    button3.setText("X");
                    currentPlayer = 2;
                } else {
                    button3.setText("O");
                    currentPlayer = 1;
                }
                checkForWin();
            }
        }
    });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button4.setText("X");
                        currentPlayer = 2;
                    } else {
                        button4.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button5.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button5.setText("X");
                        currentPlayer = 2;
                    } else {
                        button5.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }

        });




    }

    private void checkForWin() {
        // Implement your Tic Tac Toe win-checking logic here
    }
}