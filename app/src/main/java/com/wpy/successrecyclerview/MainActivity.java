package com.wpy.successrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.wpy.successrecyclerview.adapter.MyAdapter;
import com.wpy.successrecyclerview.bean.Bean_num;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity implements XRecyclerView.LoadingListener {
    private String path = "http://ic.snssdk.com/2/article/v25/stream/?count=20&min_behot_time=1457659690&bd_latitude=4.9E-324&bd_longitude=4.9E-324&bd_loc_time=1457672153&loc_mode=5&lac=4527&cid=28883&iid=3839760160&device_id=12246291682&ac=wifi&channel=baidu&aid=13&app_name=news_article&version_code=460&device_platform=android&device_type=iToolsAVM&os_api=19&os_version=4.4.4&uuid=352284045861006&openudid=84c1c7b192991cc6";
    private XRecyclerView recler_main;
    private int STATE_LOAD = 1;
    private int STATE_REFRESH = 2;
    private int count = 0;
    private List<Bean_num.DataBeanHeadline> listData = new ArrayList<>();
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*try {
            InputStream open = getAssets().open("data.json");
            Gson gson = new Gson();
            Bean6 bean6 = gson.fromJson(new InputStreamReader(open), Bean6.class);
            List<Bean6.ResultBeanHeadline.DataBeanHeadline> data1 = bean6.getResult().getData();
            String value2 = data1.get(0).getValue2();
            Log.i("TAG", "onCreate: ===="+value2);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            InputStream open = getAssets().open("datab.json");
            Gson gson = new Gson();
            Bean5 bean5 = gson.fromJson(new InputStreamReader(open), Bean5.class);
            Numa num1 = bean5.getStar().getData().getNum1();
            String name = num1.getName();
            Log.i("TAG", "onCreate: ===="+name);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        getData();
        intiView();
    }

    //获取id
    private void intiView() {
        recler_main = (XRecyclerView) findViewById(R.id.recler_main);
        recler_main.setLoadingListener(this);
    }

    //获取数据
    private void getData() {
        OkHttpUtils
                .get()
                .url(path)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }
                    @Override
                    public void onResponse(String response, int id) {
                        Log.i("TAG", "onResponse: ++++" + response);
                        //进行解析数据
                        Gson gson = new Gson();
                        Bean_num bean_num = gson.fromJson(response, Bean_num.class);
                        List<Bean_num.DataBeanHeadline> data = bean_num.getData();
                        setAdapter(data);
                    }
                });
    }
    /**
     * 适配的方法
     */
    private void setAdapter(List<Bean_num.DataBeanHeadline> data) {
         if(count == STATE_REFRESH){
             listData.clear();
         }
        listData.addAll(data);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recler_main.setLayoutManager(layoutManager);
        //进行适配
        if(myAdapter == null){
            myAdapter = new MyAdapter(this, data);
            recler_main.setAdapter(myAdapter);
        }else {
            myAdapter.notifyDataSetChanged();
        }
        stop();
    }
    @Override
    public void onRefresh() {
        count = STATE_REFRESH;
        getData();
    }

    @Override
    public void onLoadMore() {
        count = STATE_LOAD;
        getData();
    }
    /**
     *   停止
     */
    private void stop(){
        recler_main.refreshComplete();
        recler_main.loadMoreComplete();
    }
}
