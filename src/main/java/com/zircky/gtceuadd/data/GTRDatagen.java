package com.zircky.gtceuadd.data;

import com.tterrag.registrate.providers.ProviderType;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import com.zircky.gtceuadd.data.lang.GTRLangHandler;

public class GTRDatagen {
  public static void init() {
    GTRRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, GTRLangHandler::init);
  }
}
