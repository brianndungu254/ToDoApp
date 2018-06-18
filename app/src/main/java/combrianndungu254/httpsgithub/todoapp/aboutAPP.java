/**
 * Created by b.ndungu on 5/31/2018.
 */
package combrianndungu254.httpsgithub.todoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class aboutAPP extends AppCompatActivity {

    /* Field to store our TextView */
    private TextView mabout;
    private Button mRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapp);

        /* Typical usage of findViewById... */
        mabout = (TextView) findViewById(R.id.tv_description);
        mRate = (Button) findViewById(R.id.btn_rate);

        String[] checkedItems = getIntent().getExtras().getStringArray("EXTRA_ITEMS_CHECKED");

        if( checkedItems != null )
        {
            for (int i = 0; i< checkedItems.length; i++)
            {
                mabout.append("\n" + checkedItems[i] + "\n");
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemThatWasSelected = item.getItemId();
        if (menuItemThatWasSelected == R.id.action_search) {
            Context context = aboutAPP.this;
            String message = "search clicked";
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            return super.onOptionsItemSelected(item);
        }
        return true;
    }


}