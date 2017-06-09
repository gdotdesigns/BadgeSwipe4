package net.gdotdesigns.badgeswipe4;

import android.icu.text.DateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class BadgeSwipe4 extends AppCompatActivity {

    TextView timeStamp = (TextView) findViewById(R.id.timeStamp);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badge_swipe4);
    }


    public void badgeSwiped(View view){

        Date currentDateTimeString = Calendar.getInstance().getTime();

        timeStamp.setText("test");

    }

}
