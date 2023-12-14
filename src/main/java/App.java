import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationPath("/api")
public class App {

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTeam(){
        return "hello";
    }
}
