package com.jdkgroup.viewpagerindicator.imagesliding;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jdkgroup.viewpagerindicator.R;

public class AdapterImageSliding extends PagerAdapter {


    private LayoutInflater inflater;
    Context mcontext;
    int[] images;
    String[] card_name;

    public AdapterImageSliding(Context context, int[] imagesDetails, String[] card_name) {
        // TODO Auto-generated constructor stub
        this.mcontext = context;
        this.images =imagesDetails;
        this.card_name=card_name;

    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView((LinearLayout) object);
    }

    @Override
    public void finishUpdate(View container) {
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        // TODO Auto-generated method stu
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        this.inflater = (LayoutInflater) mcontext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View imageLayout = inflater.inflate(R.layout.adapter_image_sliding,
                container, false);

        ViewHolder viewholder = null;
        viewholder = new ViewHolder();
        viewholder.iv_card_img = (ImageView) imageLayout.findViewById(R.id.iv_card_img);
        viewholder.tv_card_name = (TextView)imageLayout.findViewById(R.id.tv_card_name);


        viewholder.iv_card_img.setImageResource(images[position]);
        viewholder.tv_card_name.setText(card_name[position]);

        ((ViewPager) container).addView(imageLayout, 0);


        return imageLayout;
    }

    class ViewHolder{
        ImageView iv_card_img;
        TextView tv_card_name;
    }
}
