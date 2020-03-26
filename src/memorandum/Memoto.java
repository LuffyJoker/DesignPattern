package memorandum;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:33
 * desc：备忘实体
 */
public class Memoto {
    public int mCheckPoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto [ mCheckPoint = " + mCheckPoint + ", mLifeValue = " + mLifeValue + ", mWeapon = " + mWeapon + "]";
    }
}
