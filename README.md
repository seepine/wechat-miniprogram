## wechat-miniprogram

集成微信小程序接口

- jsCode转openId
- accessToken获取
- 发送消息订阅
- 生成小程序码
- 通过code获取手机号
- 生成小程序URL link
- 生成小程序Scheme link

## 依赖

- Latest
  Version: [![Maven Central](https://img.shields.io/maven-central/v/com.seepine/wechat-miniprogram.svg)](https://search.maven.org/search?q=g:com.seepine%20a:wechat-spring-boot-starter)
- Maven:

```xml

<dependency>
  <groupId>com.seepine</groupId>
  <artifactId>wechat-miniprogram</artifactId>
  <version>${latest.version}</version>
</dependency>
```

## 使用方法

### 1.配置文件

```java
class Test {
  WeChatTemplate weChatTemplate = new WeChatTemplate(appId, appSecret);

  // 若是SpringBoot可注入到bean中
  @Bean
  public WeChatTemplate weChatTemplate() {
    return new WeChatTemplate(appId, appSecret);
  }
}
```

### 2.代码使用

方法使用

```java
class Test {
  public static void main(String[] args) {
    String openId = weChatTemplate.getOpenId(jsCode);
    String accessToken = weChatTemplate.getAccess();
    // 1.1.0支持
    String phone = weChatTemplate.getPhone(jsCode, encryptedData, iv);
    // 1.1.1支持
    byte[] qrByte = weChatTemplate.getUnLimitedCode(accessToken, scene, page);
    // 1.1.3支持
    weChatTemplate.sendSubscribe(body);

    // 1.3.0支持
    // 详见https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/getPhoneNumber.html
    WxPhoneBody phoneBody = weChatTemplate.getPhone(accessToken, code);
    String phone = weChatTemplate.getPurePhone(accessToken, code);

  }
}
```
