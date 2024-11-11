package com.zircky.gtceuadd.api;

import java.math.BigInteger;
import java.util.Arrays;

import static com.gregtechceu.gtceu.api.GTValues.V;

public class GTRValues {
  public static final long[] VP = Arrays.stream(V)
      .map(
          i -> BigInteger.valueOf(i)
              .multiply(BigInteger.valueOf(30))
              .divide(BigInteger.valueOf(32))
              .longValueExact())
      .toArray();
}
