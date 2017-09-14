package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);

        float[] points = {200, 100, 200, 600, 200, 600, 1000, 600};
        canvas.drawLines(points, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(new Rect(220,570,320,600),paint);
        canvas.drawRect(new Rect(340,400,440,600),paint);
        canvas.drawRect(new Rect(460,300,560,600),paint);
        canvas.drawRect(new Rect(580,250,680,600),paint);
        canvas.drawRect(new Rect(700,100,800,600),paint);
        canvas.drawRect(new Rect(820,50,920,600),paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("Froyo",230,630,paint);
        canvas.drawText("GB",370,630,paint);
        canvas.drawText("ICS",480,630,paint);
        canvas.drawText("JB",610,630,paint);
        canvas.drawText("L",740,630,paint);
        canvas.drawText("M",860,630,paint);
    }
}
