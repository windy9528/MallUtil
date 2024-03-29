package bwie.com.lib_core.utils;

import android.util.Log;

import bwie.com.lib_core.common.Constant;

/**
 * date:2019/7/8
 * name:windy
 * function:  封装打印日志
 */
public class LogUtil {

    public static final String TAG = LogUtil.class.getSimpleName();

    /**
     * v级别打印
     * @param msg
     */
    public static void v(String msg) {
        if (!Constant.isRelease) {//如果为开发环境
            Log.v(TAG, msg);
        }
    }

    /**
     * d级别打印
     * @param msg
     */
    public static void d(String msg) {
        if (!Constant.isRelease) {//如果为开发环境
            Log.d(TAG, msg);
        }
    }

    /**
     * i级别打印
     * @param msg
     */
    public static void i(String msg) {
        if (!Constant.isRelease) {//如果为开发环境
            Log.i(TAG, msg);
        }
    }

    /**
     * w级别打印
     * @param msg
     */
    public static void w(String msg) {
        if (!Constant.isRelease) {//如果为开发环境
            Log.w(TAG, msg);
        }
    }

    /**
     * e级别打印
     * @param msg
     */
    public static void e(String msg) {
        if (!Constant.isRelease) {//如果为开发环境
            Log.e(TAG, msg);
        }
    }
}
