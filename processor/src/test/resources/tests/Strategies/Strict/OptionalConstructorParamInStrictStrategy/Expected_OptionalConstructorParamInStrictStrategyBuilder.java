package io.jonasg.bob.test;

import io.jonasg.bob.ValidatableField;
import java.lang.String;

public final class OptionalConstructorParamInStrictStrategyBuilder {
  private final ValidatableField<String> make = ValidatableField.ofNoneNullableField("make", "OptionalConstructorParamInStrictStrategy");

  private int year;

  public OptionalConstructorParamInStrictStrategyBuilder() {
  }

  public OptionalConstructorParamInStrictStrategyBuilder make(String make) {
    this.make.set(make);
    return this;
  }

  public OptionalConstructorParamInStrictStrategyBuilder year(int year) {
    this.year = year;
    return this;
  }

  public OptionalConstructorParamInStrictStrategy build() {
    return new OptionalConstructorParamInStrictStrategy(make.orElseThrow(), year);
  }
}
