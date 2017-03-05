package com.wpy.successrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wpy.successrecyclerview.R;
import com.wpy.successrecyclerview.bean.Bean_num;

import java.util.List;

/**
 * Created by dell on 2017/3/5.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    List<Bean_num.DataBeanHeadline> data;

    /**
     * 设置情况常量
     */
    //图片在右侧
    private static final int TYPE_LISTVIEW_NORMAL = 1;
    //没有图片
    private static final int TYPE_LISTVIEW_NO_PIC = 2;
    //视频
    private static final int TYPE_LISTVIEW_VIODE = 3;
    //三张图片
    private static final int TYPE_LISTVIEW_MORE_PIC = 4;
    //大图片
    private static final int TYPE_LISTVIEW_LARGE_PIC = 5;

    public MyAdapter(Context context,  List<Bean_num.DataBeanHeadline> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //返回相应的类型
        View view;
        //大图
        if(viewType == TYPE_LISTVIEW_LARGE_PIC){
            view = LayoutInflater.from(context).inflate(R.layout.type_large_pic_item,parent,false);
            return new ImageBigViewHolder(view);
        }else if(viewType == TYPE_LISTVIEW_NO_PIC){
            //没图
            view = LayoutInflater.from(context).inflate(R.layout.type_no_pic_item,parent,false);
            return new TitleViewHolder(view);
        }else if(viewType == TYPE_LISTVIEW_MORE_PIC){
            //多张图
            view = LayoutInflater.from(context).inflate(R.layout.type_multiple_pic_item,parent,false);
            return new ImageMoreViewHolder(view);
        }else if (viewType == TYPE_LISTVIEW_VIODE) {
            view = LayoutInflater.from(context).inflate(R.layout.type_video_item, parent, false);
            return new VideoViewHolder(view);
        }else{
            view = LayoutInflater.from(context).inflate(R.layout.type_normal_item, parent, false);
            return new ImageRightViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         if(holder instanceof ImageBigViewHolder){
             ((ImageBigViewHolder)holder).tv_news_title.setText(data.get(position).getTitle());
             ((ImageBigViewHolder)holder).iv_news_pic.setImageResource(R.mipmap.ic_launcher);
         }else if(holder instanceof TitleViewHolder){
             ((TitleViewHolder)holder).tv_news_title.setText(data.get(position).getTitle());
         }else if(holder instanceof ImageMoreViewHolder){
             ((ImageMoreViewHolder)holder).tv_news_title.setText(data.get(position).getTitle());
             ((ImageMoreViewHolder)holder).iv_news_pic1.setImageResource(R.mipmap.ic_launcher);
             ((ImageMoreViewHolder)holder).iv_news_pic2.setImageResource(R.mipmap.ic_launcher);
             ((ImageMoreViewHolder)holder).iv_news_pic3.setImageResource(R.mipmap.ic_launcher);
         }else if (holder instanceof VideoViewHolder){
             ((VideoViewHolder)holder).tv_news_title.setText(data.get(position).getTitle());
             ((VideoViewHolder)holder).iv_news_pic.setImageResource(R.mipmap.ic_launcher);
         }else {
             ((ImageRightViewHolder)holder).tv_news_title.setText(data.get(position).getTitle());
             ((ImageRightViewHolder)holder).iv_news_pic.setImageResource(R.mipmap.ic_launcher);
         }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        //没有图片
        if (data.get(position).isHas_video()) {
            return TYPE_LISTVIEW_VIODE;
        } else if (!data.get(position).isHas_image()) {
            //返回没有图的
            return TYPE_LISTVIEW_NO_PIC;
        } else if (data.get(position).getImage_list().size() > 0
                && data.get(position).getImage_list() != null) {
            //返回多张图的
            return TYPE_LISTVIEW_MORE_PIC;
        } else if (data.get(position).getLarge_image_list() != null
                && data.get(position).getLarge_image_list().size() > 0) {
            //返回大图的
            return TYPE_LISTVIEW_LARGE_PIC;
        }
        //返回图在右侧的
        return TYPE_LISTVIEW_NORMAL;
    }

    /**
     * 多条目加载  分五种样式
     */
    //没有图片
    static class TitleViewHolder extends RecyclerView.ViewHolder {

        TextView tv_news_title;

        public TitleViewHolder(View itemView) {
            super(itemView);
            tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
        }
    }

    //图片在右侧
    static class ImageRightViewHolder extends RecyclerView.ViewHolder {

        TextView tv_news_title;
        ImageView iv_news_pic;

        public ImageRightViewHolder(View itemView) {
            super(itemView);
            tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
            iv_news_pic = (ImageView) itemView.findViewById(R.id.iv_news_pic);
        }
    }

    //视频类
    static class VideoViewHolder extends RecyclerView.ViewHolder {

        TextView tv_news_title;
        ImageView iv_news_pic;

        public VideoViewHolder(View itemView) {
            super(itemView);
            tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
            iv_news_pic = (ImageView) itemView.findViewById(R.id.iv_news_pic);
        }
    }

    //大图
    static class ImageBigViewHolder extends RecyclerView.ViewHolder {

        TextView tv_news_title;
        ImageView iv_news_pic;

        public ImageBigViewHolder(View itemView) {
            super(itemView);
            tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
            iv_news_pic = (ImageView) itemView.findViewById(R.id.iv_news_pic);
        }
    }

    //多张图
    static class ImageMoreViewHolder extends RecyclerView.ViewHolder {

        TextView tv_news_title;
        ImageView iv_news_pic2;
        ImageView iv_news_pic1;
        ImageView iv_news_pic3;

        public ImageMoreViewHolder(View itemView) {
            super(itemView);
            tv_news_title = (TextView) itemView.findViewById(R.id.tv_news_title);
            iv_news_pic2 = (ImageView) itemView.findViewById(R.id.iv_news_pic2);
            iv_news_pic1 = (ImageView) itemView.findViewById(R.id.iv_news_pic1);
            iv_news_pic3 = (ImageView) itemView.findViewById(R.id.iv_news_pic3);
        }
    }
}
