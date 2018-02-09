package net.arca.openbanking.account_details.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@ToString
@Configuration
@ConfigurationProperties(prefix = "mifosconfig")
public class Mifosconfig {
    private String instanceip;
    private String port;
}