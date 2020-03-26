package memorandum;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:44
 * desc：负责管理备忘录，用于保存、获取备忘录实体
 */
public class Caretaker {
    Memoto memoto;

    public void archive(Memoto memoto) {
        this.memoto = memoto;
    }

    public Memoto memoto() {
        return memoto;
    }
}
