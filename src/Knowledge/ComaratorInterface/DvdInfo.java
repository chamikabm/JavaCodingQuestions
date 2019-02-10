package Knowledge.ComaratorInterface;

import java.util.Comparator;

public class DvdInfo implements Comparator<DvdInfo> {

    private String name;

    public DvdInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(DvdInfo o1, DvdInfo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
