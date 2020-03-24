package builder;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:51
 * desc：Product 角色，产品抽象类
 */
public abstract class Computer {
    // 主板
    protected String mBoard;

    // 显示器
    protected String mDisplay;

    // 操作系统
    protected String mOS;

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();
}
