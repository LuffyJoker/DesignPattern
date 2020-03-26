package visitor;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:03
 * desc：具体的访问者
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getCodeLines());
    }
}
