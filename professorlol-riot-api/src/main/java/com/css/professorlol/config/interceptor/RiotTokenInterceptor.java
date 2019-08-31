package com.css.professorlol.config.interceptor;

import com.css.professorlol.config.properties.RiotProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

@RequiredArgsConstructor
public class RiotTokenInterceptor implements ClientHttpRequestInterceptor {

    private final RiotProperties riotProperties;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders()
                .set(RiotProperties.Token.KEY, riotProperties.getToken().getValue());
        return execution.execute(request, body);
    }
}
