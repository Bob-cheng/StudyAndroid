package space.bobcheng.studyandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by User on 2016/8/28.
 */

/*相当于是自己定义了一个XML组件，这个组件使用的父类View的构造方法，并重写了父类的方法*/
public class DrawView extends View {
    public float currentX = 40;
    public float currentY = 50;
    Paint p = new Paint();//用于画点

    public DrawView (Context context){
        super(context);
    }

    public DrawView(Context context, AttributeSet set){
        super(context , set);

    }

    
    @Override
    public void onDraw(Canvas canvas) {/*用于在组件所在的画布上画图*/
        super.onDraw(canvas);

        p.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY ,30,p);

    }

    @Override
    public boolean onTouchEvent (MotionEvent event){/*组件被触碰时就不断触发本函数*/
        currentX = event.getX();
        currentY = event.getY();
        invalidate();//通知组件重绘
        return  true;
    }
}
