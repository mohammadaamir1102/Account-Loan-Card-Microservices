package com.aamir.cards.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "cards")
@Setter
@Getter
public class CardsContactInfoConfig{
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
