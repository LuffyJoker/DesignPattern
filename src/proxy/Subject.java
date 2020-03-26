package proxy;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:46
 * desc：定义一个主题，即代理模式是基于某一件事情的，而这个 subject 就是这件事
 */
public interface Subject {

    /**
     * 一个普通的业务方法
     */
    void visit();
}
