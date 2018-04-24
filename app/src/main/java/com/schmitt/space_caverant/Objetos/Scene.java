package com.schmitt.space_caverant.Objetos;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Raphael on 19/04/2018.
 */

public interface Scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
