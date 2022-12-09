package de.dennisbrysiuk.demoopenfeign.common.internal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "InternalServiceClient", url = "http://localhost:7080")
public interface InternalServiceClient {

    @GetMapping("/")
    String getInternalResource();

}
