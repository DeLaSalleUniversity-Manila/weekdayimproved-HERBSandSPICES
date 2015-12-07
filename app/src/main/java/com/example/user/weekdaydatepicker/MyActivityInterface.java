package com.example.user.weekdaydatepicker;

/**
 * Created by USER on 07/12/2015.
 */
import android.widget.TextView;

public interface MyActivityInterface {
    // Displays the date picker and day
    public void pickDateDisplayDay();

    // Sets the TextView to message
    public void setText(String message);

    // Adds fade animation to the text
    public void fadeAnimation(TextView tv);
}
