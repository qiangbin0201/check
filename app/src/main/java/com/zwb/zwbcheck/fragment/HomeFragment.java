package com.zwb.zwbcheck.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zwb.zwbcheck.R;
import com.zwb.zwbcheck.presenter.GoodsPresenter;

/**
 * Created by Administrator on 2018/6/5
 */
public class HomeFragment extends Fragment {

    private static HomeFragment fragment;

    public static HomeFragment newInstance(){
        if(fragment == null){
            fragment = new HomeFragment();
        }
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GoodsPresenter.getInstance().initDbHelp(getActivity());

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
    }

    private void initView(View view) {
    }
}
