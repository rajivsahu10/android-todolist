package com.example.todoanything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean flipflopIndicator = false;
    public void onLoginSubmit(View view) {
        EditText loginET = findViewById(R.id.loginEditText);
        String submitedLoginId = loginET.getText().toString();
        Log.i("info", "User entered login : " + submitedLoginId);

        // Toast user id
        Toast.makeText(MainActivity.this, "Hi " + submitedLoginId, Toast.LENGTH_LONG).show();
        if (submitedLoginId!=null && !submitedLoginId.isEmpty()) {
            flipflopIndicator = !flipflopIndicator;
            changeIndicator(flipflopIndicator);
        }

    }

    private void changeIndicator(boolean changeIndicator) {
        ImageView loginIndicatorView = findViewById(R.id.loginIndicatorImageView);
        if (changeIndicator) {
            loginIndicatorView.setImageResource(R.drawable.checkmark_successful);
        } else {
            loginIndicatorView.setImageResource(R.drawable.checkmark_initial);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
