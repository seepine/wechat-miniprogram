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
public class Color implements Serializable {
  static final long serialVersionUID = 0L;

  int r;
  int g;
  int b;
}
