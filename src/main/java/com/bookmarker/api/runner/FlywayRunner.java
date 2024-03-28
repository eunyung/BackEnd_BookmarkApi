package com.bookmarker.api.runner;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;

//@Component
public class FlywayRunner {

	public FlywayRunner(@Value("${spring.datasource.url}") String url,
						@Value("${spring.datasource.username}") String username,
						@Value("${spring.datasource.password}") String password) {

		final var flyway = Flyway.configure()
				.dataSource(url , username , password)
				.load();

		try {
			flyway.migrate();
		} catch (Exception e) {
			flyway.repair();
		}
	}

}