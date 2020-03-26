package memorandum;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:28
 * desc：需要备忘数据的原始类
 */
public class Originator {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    /**
     * 打游戏
     */
    public void play() {
        System.out.println("打游戏：" + String.format("第%d关", mCheckPoint));
        mLifeValue -= 10;
        System.out.println("升级了");
        mCheckPoint++;
        System.out.println("到达： " + String.format("第%d关", mCheckPoint));
    }

    /**
     * 退出游戏
     */
    public void exit() {
        System.out.println("退出游戏前的游戏属性为：" + toString());
        System.out.println("退出游戏");
    }

    /**
     * 创建备忘实体
     *
     * @return
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mLifeValue = mLifeValue;
        memoto.mCheckPoint = mCheckPoint;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    public void restore(Memoto memoto) {
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
    }
}
