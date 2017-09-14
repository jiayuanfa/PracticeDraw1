package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        Path path = new Path();

        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        // 第一个
        paint.setColor(Color.WHITE);

        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(150,50);
        path.lineTo(300, 50);
        path.lineTo(400,90);
        canvas.drawPath(path,paint);
        paint.setTextSize(30);
        canvas.drawText("Lolipop",10,50,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(200,100,800,700,180,130,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(220,120,820,720,310,50,true,paint);

        paint.setColor(Color.CYAN);
        canvas.drawArc(220,120,820,720,2,20,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(220,120,820,720,24,10,true,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(220,120,820,720,36,50,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(220,120,820,720,88,92,true,paint);

    }
}
