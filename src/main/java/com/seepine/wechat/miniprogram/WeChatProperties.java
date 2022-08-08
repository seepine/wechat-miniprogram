package com.seepine.wechat.miniprogram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Seepine
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeChatProperties {
  /** 微信小程序appId */
  private String appId;
  /** 微信小程序secret */
  private String appSecret;
}
