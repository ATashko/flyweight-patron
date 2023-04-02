public class Clothes {

    private String size;
    private String type;
    private boolean isNew;
    private boolean international;

    public Clothes() {
    }

    public Clothes(String size, String type, boolean isNew, boolean international) {
        this.size = size;
        this.type = type;
        this.isNew = isNew;
        this.international = international;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", isNew=" + isNew +
                ", international=" + international +
                '}';
    }
}
