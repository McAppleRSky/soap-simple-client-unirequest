package ru.mrs.ws.client.rest.simple.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.mrs.ws.client.rest.simple.service.plain.Site;

import java.util.Collections;
import java.util.List;

// https://www.baeldung.com/rest-template

@Service
public class Rest implements iRest {
    @Value("${server.request.url}")
    private String serverUrl;
//    @Autowired
//    private RestTemplate restTemplate;

    /*public Rest(RestTemplate restTemplate, @Value("${server.request.url}") String serverUrl) {
        this.restTemplate = restTemplate;
        this.serverUrl = serverUrl;}*/

    @Override
    public String uniRequest() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(serverUrl, String.class);
        return response.toString();
    }

    public List<Site> findAllBlockedSites() {
        return null
                /*restTemplate.exchange(
                serverUrl + "/blocked-sites",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Site>>() {
                }
        ).getBody()*/;
    }

    public List<Site> getDefaultSites() {
        return Collections.singletonList(new Site() {{
            setUrl("http://vk.com/");
        }});
    }
}
