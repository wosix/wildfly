import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String url;
    private int priority;
    private List<Category> subCategory = new ArrayList<>();

    public Category(String name, String url, int priority) {
        this.name = name;
        this.url = url;
        this.priority = priority;
    }

    public Category(String name, String url, int priority, List<Category> subCategory) {
        this.name = name;
        this.url = url;
        this.priority = priority;
        this.subCategory = subCategory;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", priority=" + priority +
                ", subCategory=" + subCategory +
                '}';
    }
}