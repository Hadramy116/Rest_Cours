package mr.iscae;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/helloWs")
public class helloWs {
	@GET
	public String helloWs(@QueryParam("name") String name) {
		return "Premier Ws cree par : " + name;
	}
}