package com.mink.logid.util;

import java.util.UUID;

public class SKUGenerator {
    public static String generateSKU() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
}
