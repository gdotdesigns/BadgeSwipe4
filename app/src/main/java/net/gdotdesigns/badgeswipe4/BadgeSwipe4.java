package net.gdotdesigns.badgeswipe4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class BadgeSwipe4 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badge_swipe4);
        textView =(TextView) findViewById(R.id.textView);
    }


    public void badgeSwiped(View view){

        Date currentDateTime = Calendar.getInstance().getTime();

        textView.setText(currentDateTime
                .toString());

    }

}
