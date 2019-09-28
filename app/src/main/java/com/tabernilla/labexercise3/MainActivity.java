package com.tabernilla.labexercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText subject1; EditText subject2; EditText subject3; EditText subject4; EditText subject5; EditText subject6;
    EditText subject7; EditText subject8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subject1 = findViewById(R.id.editText);
        subject2 = findViewById(R.id.editText2);
        subject3 = findViewById(R.id.editText3);
        subject4 = findViewById(R.id.editText4);
        subject5 = findViewById(R.id.editText5);
        subject6 = findViewById(R.id.editText6);
        subject7 = findViewById(R.id.editText7);
        subject8 = findViewById(R.id.editText8);
    }

    public void writeData(View v)
    {
        String data = subject1.getText().toString();
        String data2 = subject2.getText().toString();
        String data3 = subject3.getText().toString();
        String data4 = subject4.getText().toString();
        String data5 = subject5.getText().toString();
        String data6 = subject6.getText().toString();
        String data7 = subject7.getText().toString();
        String data8 = subject8.getText().toString();
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(data.getBytes());
            writer.write(data2.getBytes());
            writer.write(data3.getBytes());
            writer.write(data4.getBytes());
            writer.write(data5.getBytes());
            writer.write(data6.getBytes());
            writer.write(data7.getBytes());
            writer.write(data8.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("error", "file not found");
        } catch (IOException e) {
            Log.d("error", "IO error");
        }finally {
            try{
                writer.close();
            }catch (IOException e){
                Log.d("error", "file not found");
            }
        }
        Toast.makeText(this, "data is saved", Toast.LENGTH_LONG).show();
    }
    public void nextAct(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
