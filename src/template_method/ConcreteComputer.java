package template_method;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:50
 * desc：
 */
public class ConcreteComputer extends AbsComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查防火墙");
    }

    @Override
    protected void login() {
        System.out.println("普通用户登录");
    }
}
