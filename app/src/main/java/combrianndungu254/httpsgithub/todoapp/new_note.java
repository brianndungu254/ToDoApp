package combrianndungu254.httpsgithub.todoapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class new_note extends AppCompatActivity
{
    /* Field to store our TextView */
    private TextView mTexty;
    private Button save;

    private CheckBox mBread;
    private CheckBox mMilk;
    private CheckBox mGroceries;
    private CheckBox mMeat;
    private CheckBox mSoap;
    private CheckBox mCheck;

    private String[] completed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        /* Typical usage of findViewById... */
        mTexty = (TextView) findViewById(R.id.tv_new_note);
        save = (Button) findViewById(R.id.btn_save);
        mBread = (CheckBox)findViewById(R.id.checkBox2);
        mMilk = (CheckBox)findViewById(R.id.checkBox3);
        mGroceries = (CheckBox)findViewById(R.id.checkBox4);
        mMeat = (CheckBox)findViewById(R.id.checkBox5);
        mSoap = (CheckBox)findViewById(R.id.checkBox6);
        mCheck = (CheckBox)findViewById(R.id.checkBox11);
    }


    public void saveToDo(View view) {

        completed = new String[6];
        int numItemsAdded = 0;

        if (mBread.isChecked())
        {
            completed[numItemsAdded] = "bread";
            numItemsAdded ++;
        }

        if (mMilk.isChecked())
        {
            completed[numItemsAdded] = "milk";
            numItemsAdded ++;
        }

        if (mGroceries.isChecked())
        {
            completed[numItemsAdded] = "groceries";
            numItemsAdded ++;
        }

        if (mMeat.isChecked())
        {
            completed[numItemsAdded] = "meat";
            numItemsAdded ++;
        }

        if (mSoap.isChecked())
        {
            completed[numItemsAdded] = "soap";
            numItemsAdded ++;
        }

        if (mCheck.isChecked())
        {
            completed[numItemsAdded] = "check";
            numItemsAdded ++;
        }
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent();

        intent.putExtra("EXTRA_COMPLETED", completed);

        setResult(0, intent);

        finish();



    }
}
