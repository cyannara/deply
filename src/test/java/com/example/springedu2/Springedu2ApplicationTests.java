package com.example.springedu2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.inject.Named;

@SpringBootTest
class Springedu2ApplicationTests {

  @Test
  @Named("사원등록")
  void contexttest1() {
    assertThat("a").isEqualTo("a");
  }

  @Test
  @Named("사원조회")
  void contexttest2() {
    assertThat("a").isEqualTo("1");
  }
}
