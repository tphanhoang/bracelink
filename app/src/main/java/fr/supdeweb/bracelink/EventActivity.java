package fr.supdeweb.bracelink;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_filter);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                final LinearLayout purple_btn = (LinearLayout) dialog.findViewById(R.id.button_purple);
                final LinearLayout blue_btn = (LinearLayout) dialog.findViewById(R.id.button_blue);
                final LinearLayout green_btn = (LinearLayout) dialog.findViewById(R.id.button_green);
                final LinearLayout yellow_btn = (LinearLayout) dialog.findViewById(R.id.button_yellow);
                final LinearLayout orange_btn = (LinearLayout) dialog.findViewById(R.id.button_orange);

                final ImageView purple_img = (ImageView) dialog.findViewById(R.id.purple_img);
                final ImageView blue_img = (ImageView) dialog.findViewById(R.id.blue_img);
                final ImageView green_img = (ImageView) dialog.findViewById(R.id.green_img);
                final ImageView yellow_img = (ImageView) dialog.findViewById(R.id.yellow_img);
                final ImageView orange_img = (ImageView) dialog.findViewById(R.id.orange_img);

                purple_img.setVisibility(View.INVISIBLE);
                blue_img.setVisibility(View.INVISIBLE);
                green_img.setVisibility(View.INVISIBLE);
                yellow_img.setVisibility(View.INVISIBLE);
                orange_img.setVisibility(View.INVISIBLE);

                final TextView purple_text = (TextView) dialog.findViewById(R.id.purple_text);
                final TextView blue_text = (TextView) dialog.findViewById(R.id.blue_text);
                final TextView green_text = (TextView) dialog.findViewById(R.id.green_text);
                final TextView yellow_text = (TextView) dialog.findViewById(R.id.yellow_text);
                final TextView orange_text = (TextView) dialog.findViewById(R.id.orange_text);

                purple_btn.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        purple_text.setTextColor(0xFFFFFFFF);
                        blue_text.setTextColor(0xFFBFBFBF);
                        green_text.setTextColor(0xFFBFBFBF);
                        yellow_text.setTextColor(0xFFBFBFBF);
                        orange_text.setTextColor(0xFFBFBFBF);

                        purple_img.setVisibility(View.VISIBLE);
                        blue_img.setVisibility(View.INVISIBLE);
                        green_img.setVisibility(View.INVISIBLE);
                        yellow_img.setVisibility(View.INVISIBLE);
                        orange_img.setVisibility(View.INVISIBLE);
                    }
                });
                blue_btn.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        blue_text.setTextColor(0xFFFFFFFF);
                        purple_text.setTextColor(0xFFBFBFBF);
                        green_text.setTextColor(0xFFBFBFBF);
                        yellow_text.setTextColor(0xFFBFBFBF);
                        orange_text.setTextColor(0xFFBFBFBF);

                        blue_img.setVisibility(View.VISIBLE);
                        purple_img.setVisibility(View.INVISIBLE);
                        green_img.setVisibility(View.INVISIBLE);
                        yellow_img.setVisibility(View.INVISIBLE);
                        orange_img.setVisibility(View.INVISIBLE);
                    }
                });
                green_btn.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        green_text.setTextColor(0xFFFFFFFF);
                        blue_text.setTextColor(0xFFBFBFBF);
                        purple_text.setTextColor(0xFFBFBFBF);
                        yellow_text.setTextColor(0xFFBFBFBF);
                        orange_text.setTextColor(0xFFBFBFBF);

                        green_img.setVisibility(View.VISIBLE);
                        blue_img.setVisibility(View.INVISIBLE);
                        purple_img.setVisibility(View.INVISIBLE);
                        yellow_img.setVisibility(View.INVISIBLE);
                        orange_img.setVisibility(View.INVISIBLE);
                    }
                });
                yellow_btn.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        yellow_text.setTextColor(0xFFFFFFFF);
                        blue_text.setTextColor(0xFFBFBFBF);
                        green_text.setTextColor(0xFFBFBFBF);
                        purple_text.setTextColor(0xFFBFBFBF);
                        orange_text.setTextColor(0xFFBFBFBF);

                        yellow_img.setVisibility(View.VISIBLE);
                        blue_img.setVisibility(View.INVISIBLE);
                        green_img.setVisibility(View.INVISIBLE);
                        purple_img.setVisibility(View.INVISIBLE);
                        orange_img.setVisibility(View.INVISIBLE);
                    }
                });
                orange_btn.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        orange_text.setTextColor(0xFFFFFFFF);
                        blue_text.setTextColor(0xFFBFBFBF);
                        green_text.setTextColor(0xFFBFBFBF);
                        yellow_text.setTextColor(0xFFBFBFBF);
                        purple_text.setTextColor(0xFFBFBFBF);

                        orange_img.setVisibility(View.VISIBLE);
                        blue_img.setVisibility(View.INVISIBLE);
                        green_img.setVisibility(View.INVISIBLE);
                        yellow_img.setVisibility(View.INVISIBLE);
                        purple_img.setVisibility(View.INVISIBLE);
                    }
                });

                FloatingActionButton dismissFab = (FloatingActionButton) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dismissFab.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }


    public void showProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void backEvents(View view) {
        Intent intent = new Intent(this, EventsActivity.class);
        startActivity(intent);
    }
}
