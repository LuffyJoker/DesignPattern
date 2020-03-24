package single;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:13
 * desc：使用枚举的方式实现单例模式
 */
public enum SingleEnum {

    INSTANCE;

    // 枚举类也是可以定义方法的
    public void doSomething() {
        System.out.println("do something");
    }
}
