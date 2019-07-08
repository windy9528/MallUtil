package bwie.com.lib_core;

import android.util.Log;

/**
 * date:2019/7/8
 * name:windy
 * function:  封装打印日志
 */
public class LogUtil {

    public static final String TAG = LogUtil.class.getSimpleName();

    public static void main(String[] args) {
        String a = LogUtil.class.getSimpleName();
        System.out.println(a);
    }

    /**
     * v级别打印
     * @param msg
     */
    public static void v(String msg) {
        if (!IDE.isRelease) {//如果为开发环境
            Log.v(TAG, msg);
        }
    }

    /**
     * d级别打印
     * @param msg
     */
    public static void d(String msg) {
        if (!IDE.isRelease) {//如果为开发环境
            Log.d(TAG, msg);
        }
    }

    /**
     * i级别打印
     * @param msg
     */
    public static void i(String msg) {
        if (!IDE.isRelease) {//如果为开发环境
            Log.i(TAG, msg);
        }
    }

    /**
     * w级别打印
     * @param msg
     */
    public static void w(String msg) {
        if (!IDE.isRelease) {//如果为开发环境
            Log.w(TAG, msg);
        }
    }

    /**
     * e级别打印
     * @param msg
     */
    public static void e(String msg) {
        if (!IDE.isRelease) {//如果为开发环境
            Log.e(TAG, msg);
        }
    }
}
