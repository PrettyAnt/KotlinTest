package com.prettyant.s7

//TODO Kotlin语言 注解@JvmField
class Person{
    @JvmField
    val names= listOf("孙悟空","猪八戒","唐僧")
}

/*      背后代码:

         public final class Person {
            @NotNull
            private final List names = CollectionsKt.listOf(new String[]{"孙悟空", "猪八戒", "唐僧"});

            //val 只读的,只有getNames
            @NotNull
            public final List getNames() {
                return this.names;
            }

        }
            //加上 @JvmField 后,背后会提出私有方法
            //背后代码
    public final class Person {
        @JvmField
        @NotNull
        public final List names = CollectionsKt.listOf(new String[]{"孙悟空", "猪八戒", "唐僧"});
    }

 */