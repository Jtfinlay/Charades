package ca.ippetad.charades.view;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import ca.ippetad.charades.R;

/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 12/18/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class CategoriesActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.categories_view);
    }
}
