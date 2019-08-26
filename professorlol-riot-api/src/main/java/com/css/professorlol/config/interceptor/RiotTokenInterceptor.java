package com.css.professorlol.config.interceptor;

import com.css.professorlol.config.properties.XRiotTokenProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

@RequiredArgsConstructor
public class RiotTokenInterceptor implements ClientHttpRequestInterceptor {

    private final XRiotTokenProperties xRiotTokenProperties;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders()
                .set(XRiotTokenProperties.KEY, xRiotTokenProperties.getValue());
        return execution.execute(request, body);
    }
}
