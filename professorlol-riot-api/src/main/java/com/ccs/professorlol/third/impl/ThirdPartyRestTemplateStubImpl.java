package com.ccs.professorlol.third.impl;

import com.ccs.professorlol.third.ThirdPartyRestTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThirdPartyRestTemplateStubImpl implements ThirdPartyRestTemplate {

    public ThirdPartyRestTemplateStubImpl() {
        log.debug("ThirdPartyRestTemplate created.");
    }

    @Override
    public String getThirdPartyCodeBySummonerId(final String encryptedSummonerId) {
        return "zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ";
    }

}