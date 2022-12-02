package de.dennisbrysiuk.demoopenfeign.common.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ExternalServiceClient", url = "https://www.googleapis.com/customsearch")
public interface ExternalServiceClient {
    
    @GetMapping("/v1")
    ResponseEntity<String> getExternalResource(@RequestParam String key,
                                               @RequestParam String cx,
                                               @RequestParam String q);
    
}
