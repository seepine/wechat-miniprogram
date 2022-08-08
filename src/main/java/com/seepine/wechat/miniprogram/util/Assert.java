package com.seepine.wechat.miniprogram.util;

/**
 * @author seepine
 */
public class Assert {
  public static void hasText(String text, String message) {
    if (text == null || "".equals(text)) {
      throw new IllegalArgumentException(message);
    }
  }
}
