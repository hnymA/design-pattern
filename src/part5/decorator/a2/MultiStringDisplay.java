package part5.decorator.a2;

import java.util.ArrayList;
import com.sun.org.apache.xpath.internal.operations.Or;

public class MultiStringDisplay extends Display {

    private ArrayList body = new ArrayList();
    private int columns = 0;

    public void add(String msg) {
        body.add(msg);
        updateColumn(msg);
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return body.size();
    }

    public String getRowText(int row) {
        return body.get(row)
            .toString();
    }

    private void updateColumn(String msg) {
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - (body.get(row)
                .toString()).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }


}
