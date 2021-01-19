public class ColumnsEntity {

    private String name;
    private String type;
    private Integer length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public ColumnsEntity(){}

    public ColumnsEntity(String name, String type, Integer length) {
        this.name = name;
        this.type = type;
        this.length = length;
    }

    public ColumnsEntity(String name, Integer length) {
        this.name = name;
        this.type = "varchar";
        this.length = length;
    }

}
