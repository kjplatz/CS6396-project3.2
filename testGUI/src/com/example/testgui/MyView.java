package com.example.testgui;

import java.io.InputStream;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MyView extends View {

	private static int cur_y_pos=100;
	
	public void setYPos(int y_pos){
		 /* 6.157 is a scaling factor between UI and our calculation*/ 
		cur_y_pos = (int)(y_pos * 6.157);
		this.postInvalidate();
	}
	
    public MyView(Context context) {
         super(context);
         // TODO Auto-generated constructor stub
    }

    @Override
    protected void onDraw(Canvas canvas) {
       // TODO Auto-generated method stub
       super.onDraw(canvas);
       int x = 290;
       int radius=10;
       Paint paint = new Paint();
       paint.setStyle(Paint.Style.FILL);
       paint.setColor(Color.WHITE);
       canvas.drawPaint(paint);
       
       InputStream resource = getResources().openRawResource(R.drawable.bg);
       Bitmap bitmap = BitmapFactory.decodeStream(resource);
       canvas.drawBitmap(bitmap, 0, 0, paint);
       
       // Use Color.parseColor to define HTML colors
       paint.setColor(Color.parseColor("#CD5C5C"));
       canvas.drawCircle(x, cur_y_pos, radius, paint);

       // Use Color.parseColor to define HTML colors
       paint.setColor(Color.BLACK);
       canvas.drawRect(275, 50, 300, 75, paint);
   }
}