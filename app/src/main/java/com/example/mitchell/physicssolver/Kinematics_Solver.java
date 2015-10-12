package com.example.mitchell.physicssolver;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Kinematics_Solver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinematics__solver);

        TextView textView = (TextView)findViewById(R.id.missingT);

        Resources res = getResources();
        String textMissingVf = res.getString(R.string.missingVf);
        textView.setText(Html.fromHtml(textMissingVf));
        String textMissingA = res.getString(R.string.missingA);
        textView.setText(Html.fromHtml(textMissingA));
        String textMissingT = res.getString(R.string.missingT);
        textView.setText(Html.fromHtml(textMissingT));
        String textMissingX = res.getString(R.string.missingX);
        textView.setText(Html.fromHtml(textMissingX));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kinematics__solver, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToKinSolver(View view) {

    }
}
