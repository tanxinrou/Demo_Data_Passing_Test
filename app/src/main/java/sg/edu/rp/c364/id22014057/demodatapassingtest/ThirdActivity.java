package sg.edu.rp.c364.id22014057.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //Step 2
        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char value = (char) intentReceived.getIntExtra("value", 'a');
        tvAnswer.setText("Character value received is: " + value);
    }
}
