package support;

import com.ccs.professorlol.crawler.RiotPageProperties;

public class RiotMockProperties extends RiotPageProperties {

    public static final Integer PORT = 7755;

    @Override
    public String getHost() {
        return String.format("http://localhost:%d/", PORT);
    }

    @Override
    public int getTimeout() {
        return 3000;
    }
}
