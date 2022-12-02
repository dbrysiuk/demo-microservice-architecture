package de.dennisbrysiuk.demoopenfeign.controller;

import de.dennisbrysiuk.demoopenfeign.common.external.ExternalServiceClient;
import de.dennisbrysiuk.demoopenfeign.common.internal.InternalServiceClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OpenFeignController {

    private final InternalServiceClient internalServiceClient;

    private final ExternalServiceClient externalServiceClient;

    @GetMapping("/internal")
    public String internalCall() {
        return "this is internal OpenFeign call: " + internalServiceClient.getInternalResource();
    }

    @GetMapping("/external")
    public ResponseEntity<String> externalCall() {
        return externalServiceClient.getExternalResource("API_KEY", "SEARCH_ENGINE", "SEARCH_QUERY");
    }
}
