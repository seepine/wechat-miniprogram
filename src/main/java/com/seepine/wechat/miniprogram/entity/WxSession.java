package com.seepine.wechat.miniprogram.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author seepine
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxSession implements Serializable {
  static final long serialVersionUID = 0L;

  private String openId;
  private String sessionKey;
}
