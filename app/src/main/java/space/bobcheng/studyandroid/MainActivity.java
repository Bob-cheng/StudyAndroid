package space.bobcheng.studyandroid;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private  int currentColor = 0;
    final int [] colors = new int [] {
        R.color.color1,
        R.color.color2,
        R.color.color3
    };

    TextView [] views = new TextView[colors.length];

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 0x123){
                for(int i=0;i<colors.length;i++){
                    views[i].setBackgroundResource(colors[(i+currentColor)%colors.length]);
                }
                currentColor++;
                currentColor%=colors.length;
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_manager);
        views[0]=(TextView) findViewById(R.id.v1);
        views[1]=(TextView) findViewById(R.id.v2);
        views[2]=(TextView) findViewById(R.id.v3);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,200);

        //可以不通过在XML中写入组件的方法直接在MainActivity中引入该组件，但略微复杂
        /*LinearLayout root = (LinearLayout) findViewById(R.id.root);
        final DrawView draw = new DrawView(this);
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        root.addView(draw);*/
        //因为组件已经通过XML的形式被添加到布局文件中，所以不用在组件中引入
    }
}
