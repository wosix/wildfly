import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CategoryController {

    public List<Category> getCategory() {
        List<Category> categoryList = new ArrayList<>();
        List<Category> nameList = new ArrayList<>();

        nameList.add(new Category("name1", "url", 21, subCategory()));
        nameList.add(new Category("name2", "url", 22, subCategory()));

        categoryList.add(new Category("category1", "url", 1, nameList));
        categoryList.add(new Category("category2", "url", 2));
        categoryList.add(new Category("category3", "url", 3, nameList));

        return categoryList;
    }

    private List<Category> subCategory() {
        List<Category> subNameList = new ArrayList<>();

        subNameList.add(new Category("subname1", "url", 31));
        subNameList.add(new Category("subname2", "url", 32));

        return subNameList;
    }
}
