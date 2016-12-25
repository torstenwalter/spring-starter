package de.torstenwalter.spring.starter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleControllerUnitTest {
    @Test
    public void home() throws Exception {
        SampleController sampleController = new SampleController();

        assertThat(sampleController.home()).isEqualTo("Hello World!");
    }

}