package com.example.dualtictactoe;
import com.example.tictactoe.Player;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private int currentPlayer = 1;
    private enum Player {
        ONE, TWO
    }
    private TextView textViewPlayer;

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
    private boolean checkRowForWin(int row) {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        switch (row) {
            case 0:
                return button1.getText().equals(button2.getText()) &&
                        button2.getText().equals(button3.getText()) &&
                        !button1.getText().toString().isEmpty();
            case 1:
                return button4.getText().equals(button5.getText()) &&
                        button5.getText().equals(button6.getText()) &&
                        !button4.getText().toString().isEmpty();
            case 2:
                return button7.getText().equals(button8.getText()) &&
                        button8.getText().equals(button9.getText()) &&
                        !button7.getText().toString().isEmpty();
            default:
                return false;
        }
    }

    private boolean checkColumnForWin(int column) {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        switch (column) {
            case 0:
                return button1.getText().equals(button4.getText()) &&
                        button4.getText().equals(button7.getText()) &&
                        !button1.getText().toString().isEmpty();
            case 1:
                return button2.getText().equals(button5.getText()) &&
                        button5.getText().equals(button8.getText()) &&
                        !button2.getText().toString().isEmpty();
            case 2:
                return button3.getText().equals(button6.getText()) &&
                        button6.getText().equals(button9.getText()) &&
                        !button3.getText().toString().isEmpty();
            default:
                return false;
        }
    }
    private boolean checkDiagonalForWin() {
        Button button1 = findViewById(R.id.button1);
        Button button5 = findViewById(R.id.button5);
        Button button9 = findViewById(R.id.button9);
        Button button3 = findViewById(R.id.button3);
        Button button7 = findViewById(R.id.button7);

        // Check diagonal from top left to bottom right
        if (button1.getText().equals(button5.getText()) &&
                button5.getText().equals(button9.getText()) &&
                !button1.getText().toString().isEmpty()) {
            return true;
        }

        // Check diagonal from top right to bottom left
        if (button3.getText().equals(button5.getText()) &&
                button5.getText().equals(button7.getText()) &&
                !button3.getText().toString().isEmpty()) {
            return true;
        }

        return false;
    }

    private void resetGame() {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        // Clear the text of all buttons
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        // Reset the game state
        Player currentPlayer = new Player(Player.ONE);

        currentPlayer = Player.ONE;
        boolean gameEnded = false;
        textViewPlayer.setText(R.string.player_one_turn);
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