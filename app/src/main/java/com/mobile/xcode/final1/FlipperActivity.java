package com.mobile.xcode.final1;

/**
 * Created by Susantokun on 30/05/2017.
 */


import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ViewFlipper;

public class FlipperActivity extends Activity {
    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
    }

    // Using the following method, we will handle all screen swaps.
    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {

            case MotionEvent.ACTION_DOWN:
                lastX = touchevent.getX();
                break;
            case MotionEvent.ACTION_UP:
                float currentX = touchevent.getX();

                // Handling left to right screen swap.
                if (lastX < currentX) {

                    // If there aren't any other children, just break.
                    if (viewFlipper.getDisplayedChild() == 0)
                        break;

                    // Next screen comes in from left.
                    viewFlipper.setInAnimation(this, R.anim.left_in);
                    // Current screen goes out from right.
                    viewFlipper.setOutAnimation(this, R.anim.right_out);

                    // Display next screen.
                    viewFlipper.showNext();
                }

                // Handling right to left screen swap.
                if (lastX > currentX) {

                    // If there is a child (to the left), kust break.
                    if (viewFlipper.getDisplayedChild() == 1)
                        break;

                    // Next screen comes in from right.
                    viewFlipper.setInAnimation(this, R.anim.right_in);
                    // Current screen goes out from left.
                    viewFlipper.setOutAnimation(this, R.anim.left_out);

                    // Display previous screen.
                    viewFlipper.showPrevious();
                }
                break;
        }
        return false;
    }
}