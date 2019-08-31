package part6.visitor.a1;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {

    private String fileType;
    private ArrayList found = new ArrayList();

    public FileFindVisitor(String fileType) {
        this.fileType = fileType;
    }

    public Iterator getFoundFiles() {
        return found.iterator();
    }

    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            found.add(file);
        }
    }

    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

}
