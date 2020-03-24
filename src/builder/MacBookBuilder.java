package builder;

/**
 * @author Mr.Q
 * @date 2020/3/25 1:12
 * desc：具体的建造者，即给具体的商品装配相应的零件
 * 一般情况下，可以将 Builder 类做成具体产品的静态内部类
 */
public class MacBookBuilder extends Builder {

    // 此处，可以不需要在这里初始化对象，而在 createComputer 方法中初始化对象。
    // 重新添加一个类，用于保存 computer 的相关属性，然后在 createComputer 中，设置 computer 的相关属性
    private Computer computer = new MacBook();

    @Override
    public MacBookBuilder buildBoard(String board) {
        computer.setBoard(board);
        return this;
    }

    @Override
    public MacBookBuilder buildDisplay(String display) {
        computer.setDisplay(display);
        return this;
    }

    @Override
    public MacBookBuilder buildOS() {
        computer.setOS();
        return this;
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
