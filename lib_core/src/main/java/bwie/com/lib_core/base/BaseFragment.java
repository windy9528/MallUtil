package bwie.com.lib_core.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import bwie.com.lib_core.utils.LogUtil;

/**
 * date:2019/7/8
 * name:windy
 * function:
 */
public abstract class BaseFragment  extends Fragment {

    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        long time = System.currentTimeMillis();

        View view = inflater.inflate(getLayoutId(), container, false);

        LogUtil.i((this.toString() + "页面加载使用："
                + (System.currentTimeMillis() - time)));

        unbinder = ButterKnife.bind(this, view);

        initView();

        initData();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder != null) {
            unbinder.unbind();
            unbinder = null;
        }
        destoryData();
        System.gc();
    }

    /**
     * 设置layoutId
     */
    protected abstract int getLayoutId();

    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 清除数据
     */
    protected abstract void destoryData();

    /**
     * @param mActivity 无参跳转
     */
    public void intent(Class mActivity) {
        Intent intent = new Intent(getContext(), mActivity);
        startActivity(intent);
    }

    /**
     * @param mActivity 有参跳转
     * @param bundle
     */
    public void intent(Class mActivity, Bundle bundle) {
        Intent intent = new Intent(getContext(), mActivity);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * 显示toast、
     *
     * @param msg
     */
    public void showToast(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示带时间的toast
     *
     * @param msg
     */
    public void showToast(String msg, int time) {
        Toast.makeText(getContext(), msg, time).show();
    }
}