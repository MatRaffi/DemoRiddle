package sg.edu.rp.c346.s19024292.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2=findViewById(R.id.textView);
        tvAnswer2.setText("In Third Activity");

        Intent inte2=getIntent();
        String qSelected2=inte2.getStringExtra("Question2");
        tvAnswer2.setText("Q2 answer is: " + qSelected2);



    }
}
