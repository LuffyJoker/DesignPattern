package builder;

/**
 * @author Mr.Q
 * @date 2020/3/25 1:09
 * desc：抽象的建造者，定义需要建造的产品的规范
 */
public abstract class Builder {

    // 设置主板
    public abstract Builder buildBoard(String board);

    // 设置显示器
    public abstract Builder buildDisplay(String display);

    // 设置操作系统
    public abstract Builder buildOS();

    // 创建 Computer
    public abstract Computer createComputer();

}
