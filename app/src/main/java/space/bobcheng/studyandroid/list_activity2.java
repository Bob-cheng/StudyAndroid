package space.bobcheng.studyandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_activity2);
        String [] items={"张泽珺","程志远","刘艺扬","郭松","叶穷咱"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,R.layout.array_items3,items);
        ListView list1 = (ListView) findViewById(R.id.list1);
        list1.setAdapter(ad);
    }
}
