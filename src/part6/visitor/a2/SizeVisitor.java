package part6.visitor.a2;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size = 0;
    public int getSize() {
        return size;
    }
    public void visit(File file) {
        size += size;
    }
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry =  (Entry) it.next();
            entry.accept(this);
        }
    }
}
