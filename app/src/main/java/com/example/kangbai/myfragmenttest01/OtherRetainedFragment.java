package com.example.kangbai.myfragmenttest01;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by kangbai on 2017/7/24.
 * 滴水穿石，铁杵成针
 */
public class OtherRetainedFragment extends Fragment {
    // 保存一个异步的任务  
    private MyAsyncTask data;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //保证Activity重建之后能通过FragmentManager对象的findFragmentByTag方法找到此Fragment对象
        setRetainInstance(true);
    }

    public MyAsyncTask getData() {
        return data;
    }

    public void setData(MyAsyncTask data) {
        this.data = data;
    }
}
