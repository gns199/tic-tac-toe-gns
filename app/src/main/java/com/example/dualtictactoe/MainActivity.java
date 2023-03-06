package com.example.dualtictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


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
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button6.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button6.setText("X");
                        currentPlayer = 2;
                    } else {
                        button6.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button7.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button7.setText("X");
                        currentPlayer = 2;
                    } else {
                        button7.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button8.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button8.setText("X");
                        currentPlayer = 2;
                    } else {
                        button8.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button9.getText().toString().isEmpty()) {
                    if (currentPlayer == 1) {
                        button9.setText("X");
                        currentPlayer = 2;
                    } else {
                        button9.setText("O");
                        currentPlayer = 1;
                    }
                    checkForWin();
                }
            }

        });
    }

    private void checkForWin() {
        // Check rows for a win
        if (checkRowForWin(0) || checkRowForWin(1) || checkRowForWin(2)) {
            // We have a winner!
            Toast.makeText(this, "Player " + currentPlayer + " wins!", Toast.LENGTH_SHORT).show();
            resetGame();
            return;
        }

        // Check columns for a win
        if (checkColumnForWin(0) || checkColumnForWin(1) || checkColumnForWin(2)) {
            // We have a winner!
            Toast.makeText(this, "Player " + currentPlayer + " wins!", Toast.LENGTH_SHORT).show();
            resetGame();
            return;
        }

        // Check diagonals for a win
        if (checkDiagonalForWin(0, 0, 1, 1, 2, 2) || checkDiagonalForWin(0, 2, 1, 1, 2, 0)) {
            // We have a winner!
            Toast.makeText(this, "Player " + currentPlayer + " wins!", Toast.LENGTH_SHORT).show();
            resetGame();
            return;
        }

        // If no one has won and all buttons are filled, it's a tie
        if (!button1.getText().toString().isEmpty() &&
                !button2.getText().toString().isEmpty() &&
                !button3.getText().toString().isEmpty() &&
                !button4.getText().toString().isEmpty() &&
                !button5.getText().toString().isEmpty() &&
                !button6.getText().toString().isEmpty() &&
                !button7.getText().toString().isEmpty() &&
                !button8.getText().toString().isEmpty() &&
                !button9.getText().toString().isEmpty()) {
            Toast.makeText(this, "It's a tie!", Toast.LENGTH_SHORT).show();
            resetGame();
        }
    }

}