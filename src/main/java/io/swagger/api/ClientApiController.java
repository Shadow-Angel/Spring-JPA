package io.swagger.api;

import io.swagger.model.Client;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repository.ClientRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-02T02:01:10.506Z")

@Controller
public class ClientApiController implements ClientApi {

    private static final Logger log = LoggerFactory.getLogger(ClientApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ClientRepo clientRepo;

    @org.springframework.beans.factory.annotation.Autowired
    public ClientApiController(ObjectMapper objectMapper, HttpServletRequest request, ClientRepo clientRepo) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.clientRepo = clientRepo;
    }

    public ResponseEntity<Void> createClient(@ApiParam(value = "Created client object", required = true) @Valid @RequestBody Client body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createClientsWithArrayInput(@ApiParam(value = "List of client object", required = true) @Valid @RequestBody List<Client> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createClientsWithListInput(@ApiParam(value = "List of client object", required = true) @Valid @RequestBody List<Client> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteClient(@ApiParam(value = "The name that needs to be deleted", required = true) @PathVariable("clientname") String clientname) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Client> getClientByName(@ApiParam(value = "The name that needs to be fetched. Use client1 for testing.", required = true) @PathVariable("clientname") String clientname) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Client>(objectMapper.readValue("{  \"lastName\" : \"lastName\",  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",  \"birthDay\" : \"2000-01-23\",  \"password\" : \"password\",  \"name\" : \"name\",  \"numberPhoe\" : \"numberPhoe\",  \"id\" : 0,  \"email\" : \"email\",  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"}", Client.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Client>(objectMapper.readValue("<User>  <id>123456789</id>  <name>aeiou</name>  <lastName>aeiou</lastName>  <email>aeiou</email>  <password>aeiou</password>  <numberPhoe>aeiou</numberPhoe>  <updatedAt>2000-01-23T04:56:07.000Z</updatedAt>  <createdAt>2000-01-23T04:56:07.000Z</createdAt>  <birthDay>2000-01-23</birthDay></User>", Client.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Client>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> getAllClients() {
        try {
            return new ResponseEntity<String>(clientRepo.findAll().toString(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<String> loginClient(@NotNull @ApiParam(value = "The client name for login", required = true) @Valid @RequestParam(value = "clientname", required = true) String clientname, @NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("aeiou", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutClient() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateClient(@ApiParam(value = "name that need to be updated", required = true) @PathVariable("clientname") String clientname, @ApiParam(value = "Updated client object", required = true) @Valid @RequestBody Client body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
