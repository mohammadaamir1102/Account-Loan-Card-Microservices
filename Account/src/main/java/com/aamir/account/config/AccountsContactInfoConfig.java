package com.aamir.account.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
@Setter
@Getter
public class AccountsContactInfoConfig {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
