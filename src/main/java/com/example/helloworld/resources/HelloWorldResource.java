package com.example.helloworld.resources;

import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import com.example.helloworld.dto.DummyDto;
import io.dropwizard.jersey.params.DateTimeParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldResource.class);

    public HelloWorldResource() {
    }

    @GET
    @Path("/date")
    @Produces(MediaType.TEXT_PLAIN)
    public String receiveDate(@QueryParam("date") Optional<DateTimeParam> dateTimeParam) {
        if (dateTimeParam.isPresent()) {
            final DateTimeParam actualDateTimeParam = dateTimeParam.get();
            LOGGER.info("Received a date: {}", actualDateTimeParam);
            return actualDateTimeParam.get().toString();
        } else {
            LOGGER.warn("No received date");
            return null;
        }
    }

    @GET
    @Path("/timed")
    @Timed
    public Response getTimed() {
        try {
            Thread.sleep((int)(3000 * Math.random()));
        } catch (InterruptedException e) {
        }
        return Response.ok().entity(new DummyDto("x")).build();
    }

    @GET
    @Path("/metered")
    @Metered
    public Response getMetered() {
        try {
            Thread.sleep((int)(3000 * Math.random()));
        } catch (InterruptedException e) {
        }
        return Response.ok().entity(new DummyDto("y")).build();
    }

}
