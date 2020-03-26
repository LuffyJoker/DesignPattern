package template_method;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:44
 * desc：模板方法模式，即控制方法的执行流程，但是子类可以根据自己的需要去自己实现流程中的步骤
 */
public abstract class AbsComputer {

    protected void powerOn() {
        System.out.println("电脑开机");
    }

    protected void checkHardware() {
        System.out.println("检查硬件");
    }

    protected void loadOS() {
        System.out.println("加载操作系统");
    }

    protected void login() {
        System.out.println("登录系统");
    }

    /**
     * 定义了上述定义的方法的执行顺序，该方法暴露在外面，用于外部调用
     */
    public final void startUp() {
        powerOn();
        checkHardware();
        loadOS();
        login();
    }
}
