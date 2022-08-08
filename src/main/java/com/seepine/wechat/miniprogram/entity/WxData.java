package com.seepine.wechat.miniprogram.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
/**
 * @author seepine
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxData {
  public Map<String, Object> data = new HashMap<>();

  public WxData add(String key, Object value) {
    data.put(key, value);
    return this;
  }
}
