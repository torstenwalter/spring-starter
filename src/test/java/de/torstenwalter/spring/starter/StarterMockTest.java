package de.torstenwalter.spring.starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
public class StarterMockTest {

    @Test
    @PrepareForTest(SpringApplication.class)
    public void main() {
        mockStatic(SpringApplication.class);

        Starter.main(new String[0]);

        // start verifying behavior
        PowerMockito.verifyStatic();
        // call the static method you want to verify
        SpringApplication.run(Starter.class, new String[0]);
    }

    @Test
    @PrepareForTest(SpringApplication.class)
    public void mainPassesArguments() {
        mockStatic(SpringApplication.class);

        Starter.main(new String[]{"Hello", "World"});

        // start verifying behavior
        PowerMockito.verifyStatic();
        // call the static method you want to verify
        SpringApplication.run(Starter.class, new String[]{"Hello", "World"});
    }

}