package com.example.jiaminwang.test_nearby;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class tertiaryActivity extends AppCompatActivity {
    private Button secondaryScreenButton;
    private Button primaryScreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tertiary);
        secondaryScreenButton = (Button) findViewById(R.id.tertiaryButton2);
        primaryScreenButton = (Button) findViewById(R.id.tertiaryButton1);
        primaryScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tertiaryActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        secondaryScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tertiaryActivity.this, secondaryActivity.class);
                startActivity(intent);
            }
        });
    }
}