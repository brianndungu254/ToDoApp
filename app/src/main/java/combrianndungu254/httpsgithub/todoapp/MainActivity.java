/**
 * name : brian ndungu
 * course: cs40s
 * teacher: MR.HARDMAN
 * date modified:
 * lab #final, project #final
*/
 package combrianndungu254.httpsgithub.todoapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{


    private TextView mMotionDisplay;
    private Button mDirection;
    private Button mabout;
    private EditText mTextEntry;

    private String[] itemsChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMotionDisplay = (TextView) findViewById(R.id.tv_name);
        mDirection = (Button) findViewById(R.id.btn_new_note);
        mabout = (Button) findViewById(R.id.btn_about);
        mTextEntry = (EditText) findViewById(R.id.et_text_entry);


    }

    public void aboutUs(View view)
    {
        Intent intent = new Intent(MainActivity.this, aboutAPP.class);

        if( itemsChecked != null )
        {
            intent.putExtra("EXTRA_ITEMS_CHECKED", itemsChecked);
        }

        startActivity(intent);
    }


    public void goToNewNote(View view)
    {
        Intent intent = new Intent(MainActivity.this, new_note.class);

        startActivityForResult(intent, 0);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        String[] Temp = data.getExtras().getStringArray("EXTRA_COMPLETED");

        int numItems = Temp.length;

        itemsChecked = new String[numItems];

        for ( int i = 0; i < numItems; i++) {

            itemsChecked [i] = Temp[i];
        }
    }


}
