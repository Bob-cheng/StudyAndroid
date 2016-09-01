package space.bobcheng.studyandroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class List_activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] items = {"1","2","3","4","5"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        setListAdapter(ad);


    }
}
