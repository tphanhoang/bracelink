package fr.supdeweb.bracelink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void backEvent(View view) {
        Intent intent = new Intent(this, EventActivity.class);
        startActivity(intent);
    }
}
