package builder;

/**
 * @author Mr.Q
 * @date 2020/3/25 1:15
 * desc：负责构造 Computer,可以省略。如果需要按照某种步骤进行构造，可以在此处，指定好顺序
 */
public class Director {

    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.buildBoard(board).buildDisplay(display).buildOS();
    }
}
