package com.prettyant.s2;

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * <p>
 * Created on 4:28 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
interface IShowResult {//接口的折中方案解决Kotlin的lambda问题
    void onShowResult(String result);
}
//TODO Jave语言的匿名函数与具名函数
public class KtBase34 {
    public static void main(String[] args) {
        //匿名函数
        showPersonInfo("prettyant", 28, '男', "学习Java语言", new IShowResult() {
            @Override
            public void onShowResult(String result) {
                System.out.println("匿名函数Java版本:" + result);
            }
        });

        //具名函数
        MshowResultImpl mshowResult = new MshowResultImpl();
        showPersonInfo("prettyant", 28, '男', "学习Java语言", mshowResult);
    }

    static class MshowResultImpl implements IShowResult {

        @Override
        public void onShowResult(String result) {
            System.out.println("具名函数Java版本:" + result);
        }
    }


    static void showPersonInfo(String name, int age, char sex, String study, IShowResult IShowResult) {
        String str = String.format("name:%s,age:%d,sex:%c,study:%s", name, age, sex, study);
        IShowResult.onShowResult(str);
    }
}

