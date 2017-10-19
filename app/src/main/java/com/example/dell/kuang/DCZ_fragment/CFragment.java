package com.example.dell.kuang.DCZ_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.kuang.DCZ_okhttp.StatusBarUtil;
import com.example.dell.kuang.R;

import butterknife.ButterKnife;

public class CFragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        StatusBarUtil.setImgTransparent(getActivity());      //这行是让标题沉浸
        view = View.inflate(getActivity(), R.layout.fragment_c, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
