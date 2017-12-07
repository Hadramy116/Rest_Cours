package mr.iscae;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/mem")
@Produces("application/json")
public class MemResource {
	private static Map<Integer, Value> memoire = new HashMap<>();

	@GET
	public Map<Integer, Value> getValue() {
		System.out.println(memoire.size());
		return memoire;
	}

	/*@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(@QueryParam("id") Integer id, @QueryParam("val") String val) {
		memoire.put(id, val);
	}*/
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Data data) {
		//System.out.println("id"+data.val);
		memoire.put(data.id,data.v);
		//return Response.status(201).entity(result).build();	
	}
	
	public  static class Value {
		String val;
		String name;
	}
	
	
	
}