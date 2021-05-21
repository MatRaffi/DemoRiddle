package sg.edu.rp.c346.s19024292.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer=findViewById(R.id.textView);
        tvAnswer.setText("In Second Activity");

        Intent inte = getIntent();
        String qSelected = inte.getStringExtra("Question");
        tvAnswer.setText("Q1 answer is " + qSelected);


    }
}
