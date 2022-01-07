package de.hs.wim.springioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Autowired
    public AppRunner() {
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Welcome to the Spring universe");
    }
}
