package space.bobcheng.studyandroid;

        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity_textview extends AppCompatActivity {
    RadioGroup rg;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview_test);
        rg=(RadioGroup)findViewById(R.id.rg);
        show = (TextView) findViewById(R.id.show);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String sh = R.id.male==i?"你是男人":"你是女人";
                show.setText(sh);
            }
        });
    }
}
