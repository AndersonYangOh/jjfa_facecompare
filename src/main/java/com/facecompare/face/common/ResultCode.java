package com.tt.face.common;

/**
 * 10000-- 通用错误代码
 * 20000-- 面部识别错误代码
 */
public interface ResultCode {
    //操作是否成功,true为成功，false操作失败
    boolean success();
    //操作代码
    int code();
    //提示信息
    String message();

}
