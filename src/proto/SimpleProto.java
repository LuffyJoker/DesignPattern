package proto;

import java.util.ArrayList;

/**
 * @author Mr.Q
 * @date 2020/3/25 15:59
 * desc：原型模式：浅拷贝/深拷贝，详细说明，见 readme
 */
public class SimpleProto implements Cloneable {
    public String name;
    public ArrayList<String> favourites;

    public SimpleProto(String name, ArrayList<String> favourites) {
        this.name = name;
        this.favourites = favourites;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SimpleProto student = (SimpleProto) super.clone();
        // 加入下面这一行，即实现深拷贝，因为 favourites 是引用类型，仅仅是拷贝引用。而 ArrayList 内部，实现了 cloneable 接口
        // student.favourites = (ArrayList<String>) favourites.clone();
        return student;
    }
}
