package shiela.makeup.com;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;


    public int[] lst_image = {
            R.drawable.Makeup1,
            R.drawable.Makeup2,
            R.drawable.Makeup3,
            R.drawable.Makeup4,
            R.drawable.Makeup5,
            R.drawable.Makeup6,
            R.drawable.Makeup7,
            R.drawable.Makeup8,
            R.drawable.Makeup9,
            R.drawable.Makeup10,
            R.drawable.Makeup11,

    };
    // lst of titles
    public String[] lst_title = {
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
    } ;
    // lst of description
    public String[] lst_description = {
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
            ""
    } ;
    // lst of backgroud colors


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }
}
