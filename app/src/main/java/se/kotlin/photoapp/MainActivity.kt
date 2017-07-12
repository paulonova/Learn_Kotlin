package se.kotlin.photoapp

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }




    /**
     * Fun, strLenght name string question mark and this is
     * going to return and int and we'll just return name if it isn't null,
     * length, otherwise, we'll return negative one, using the elvis operator.
     */
    inline fun strLength(name : String?) : Int{
        return name?.length ?: -1;
    }

    fun kotlinTest(){
        var userName = "Fred";
        userName = "Sue";
        val name  = 14.7;

        var name2 : String? = null;
        var length = name2?.length;
//        name2 = null;
        val length2 = name2?.length ?: -10

        Log.d("Hello", "" + userName + " and " + name);
        Log.d("Hello", "Length: " + length2);

        val teste : Int? = null;
        /**
         * if teste? = null then return -100*/
        val size = teste?.plus(10) ?: -100;
        Log.d("Hello", "Size: " + size);

        /**
         * The double exclamation operator will evaluate the variable even if it is null,
         * causing a null pointer exception. For example, val length three equals name
         * two double exclamation point dot length will cause a null pointer exception
         * if name two is null.
         */
//        val length3 = name2!!.length;


    }


}
