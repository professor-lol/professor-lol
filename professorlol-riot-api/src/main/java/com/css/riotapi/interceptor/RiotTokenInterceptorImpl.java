package com.css.riotapi.interceptor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class RiotTokenInterceptorImpl implements RiotTokenInterceptor {

    private final XRiotTokenProperties xRiotTokenProperties;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        ClientHttpResponse response = execution.execute(request, body);
        response.getHeaders()
                .add(xRiotTokenProperties.getKey(), xRiotTokenProperties.getValue());
        return response;
    }
}
