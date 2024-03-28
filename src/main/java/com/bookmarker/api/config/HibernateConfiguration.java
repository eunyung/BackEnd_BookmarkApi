package com.bookmarker.api.config;

import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;

//@Configuration
public class HibernateConfiguration {

    //@Bean
    HibernatePropertiesCustomizer hibernatePropertiesCustomizer() {
        return props -> props.put("integrator_provider", ClassImportIntegratorProvider.class.getName());
    }
}