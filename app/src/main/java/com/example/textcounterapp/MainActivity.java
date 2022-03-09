package com.example.textcounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcounterapp.utils.TextUtils;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText txtMain;
    Spinner spOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtResult = findViewById(R.id.txtResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.spOption = findViewById(R.id.spOption);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spOption.setAdapter(adapter);
    }

    public void onBtnClickCalculate(View view) {
        if(txtMain.getText().toString().isEmpty()) {
            Toast.makeText(this, "Text is empty", Toast.LENGTH_LONG).show();
        }
        else{

            if (this.spOption.getSelectedItem().toString().equalsIgnoreCase("Words")) {
                int wordsCount = TextUtils.getWordsCount(this.txtMain.getText().toString().split("\\s+"));
                String wordsCountFormated = String.valueOf(wordsCount);
                this.txtResult.setText("The number of words in the given text is: " + wordsCountFormated);


            } else {
                int charsCount = TextUtils.getCharsCount(this.txtMain.getText().toString());
                String charsCountFormated = String.valueOf(charsCount);
                this.txtResult.setText("The number of chars in the given text is: " + charsCountFormated);

            }
        }
    }
}