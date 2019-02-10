package Knowledge.ComparableInterface;

public class DvdInfo implements Comparable<DvdInfo> {


    private String name;

    public DvdInfo(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(DvdInfo o) {
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *  Before Java Generics you would have to do something like below.
     *
     *
     *  @Override
     *  public int compareTo(Object o) {
     *      DVDInfo d = (DVDInfo)o;
     *      return title.compareTo(d.getTitle());
     *  }
     */
}
