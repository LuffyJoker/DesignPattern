package builder;

/**
 * @author Mr.Q
 * @date 2020/3/25 1:07
 * desc：具体的产品，通过具体的 Builder 来进行构造
 */
public class MacBook extends Computer {
    @Override
    public void setOS() {
        mOS = "Mac os  X 10.10";
    }
}
