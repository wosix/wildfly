import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/menu")
public class Menubar {

    @Inject
    private CategoryController categoryController;

    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCategory() {
        return categoryController.getCategory().toString();
    }
}
