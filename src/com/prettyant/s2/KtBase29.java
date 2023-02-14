package com.prettyant.s2;


/**
 * java版模拟客户端请求后台接口登录功能
 */

interface ResponseResult {
    void result(String msg, int code);
}

public class KtBase29 {
    private static final String USER_NAME_SAVE_DB = "PrettyAnt";
    private static final String USER_PWD_SAVE_DB = "123456";

    public static void main(String[] args) {
        loginAPI("PrettyAnt", "123456", new ResponseResult() {
            @Override
            public void result(String msg, int code) {
                System.out.println(String.format("最终登录的情况如下:msg:%s,code:%d", msg, code));
            }
        });
    }

    public static void loginAPI(String userName, String userPwd, ResponseResult responseResult) {
        if (userName.isEmpty() || userPwd.isEmpty()) {
            throw new RuntimeException("用户名或密码不能为空");
        }
        if (userName.length() > 3 && userPwd.length() > 3) {
            if (webServiceLoginAPI(userName, userPwd)) {
                responseResult.result("login success", 200);
            } else {
                responseResult.result("login error", 444);
            }
        } else {
            throw new RuntimeException("用户名或密码错误");
        }
    }

    private static boolean webServiceLoginAPI(String name, String pwd) {
        if (name.equals(USER_NAME_SAVE_DB) && pwd.equals(USER_PWD_SAVE_DB)) {
            return true;
        } else {
            return false;
        }
    }
}
