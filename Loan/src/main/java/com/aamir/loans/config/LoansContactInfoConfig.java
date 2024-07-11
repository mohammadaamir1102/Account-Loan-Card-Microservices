package com.aamir.loans.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loans")
public record LoansContactInfoConfig(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
