public class Course {

    private int IdCourse;
    private int price;
    private String name;
    private String description;

    public int getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(int idCourse) {
        IdCourse = idCourse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
