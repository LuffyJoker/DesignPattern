package builder;

/**
 * @author Mr.Q
 * @date 2020/3/25 1:18
 * desc：建造者模式使用
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("因特尔主板", "Retina 显示器");
        System.out.println("Computer Info: " + builder.createComputer());
    }
}
