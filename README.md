# AdClose

**AdClose** 是一个基于Xposed框架的Android广告屏蔽工具，致力于提供一个无广告的应用浏览体验，旨在优化用户体验并减少干扰。建议在LSPosed框架环境中使用。

AdClose的核心功能是阻止常见平台的SDK广告初始化加载，并拦截应用内的广告请求以屏蔽广告。此外，AdClose还为特定应用提供了定制化的去广告适配。


## 主要特性

功能支持：

- **全面屏蔽**：去除常见平台SDK广告。
- **广告请求拦截**：屏蔽应用内的广告请求。
- **截图录屏限制移除**：允许在应用中自由截图和录屏。
- **VPN与代理检测移除**：去除应用内的VPN和系统代理检测。
- **传感器监听移除**：用于禁用摇一摇等基于传感器的广告跳转。
- **Root检测规避**：去除应用内的一般性Root，Magisk和Xposed框架检测。

针对以下特定应用提供单独适配，直接勾选即启用(通杀)：

- 知乎（开屏)
- 皮皮虾 (所有)
- 爱奇艺 (所有)
- 酷我音乐 (所有)
- 腾讯视频 (所有)
- 优酷视频 (所有)
- 虎牙直播 (所有)
- 微博轻享版 (所有)


## 支持的应用范围

AdClose支持众多流行的Android应用，包括但不限于：

- 视频播放应用
- 阅读和新闻应用
- 工具和便捷应用
- 商务办公应用
- 社交和通讯应用


## 广告SDK拦截

AdClose能够拦截并处理包括以下在内的多种广告SDK：

- Kwai Ads
- Tanx Ads
- Baidu Ads
- Xiaomi Ads
- Tencent Ads
- Huawei Ads
- Umeng SDK
- MeiShu Ads
- Vungle Sdk
- Qumeng Ads
- Sigmob Ads
- Applovin Sdk
- Unity3d Ads
- Google Ads
- Pinduoduo Ads
- Appic Ads
- AdScope
- BJXingu Ads
- Ali BaiChuan Ads
- Tencent SDK
- Mbridge Ads
- Mintegral Ads
- ADSuyiSdk Ads
- XinwuPaijin Ads
- XiaoChuang Ads-ZuiYou
- ByteDance (Pangolin) Ads
- ByteDance (Pangolin) GroMore
- FaceBook Ads


## 安装指南

在安装AdClose之前，请确保您的设备已经安装LSPosed框架。

1. 下载并安装AdClose模块。
2. 在LSPosed模块管理器中激活AdClose模块。
3. 在模块作用域中选择您希望去除广告的应用。
4. 启动AdClose模块，选择您的应用列表，点击应用名称后，启用相应的Hook功能。


## 如何贡献

如果您对AdClose有改进建议，或发现Bug，欢迎通过Issues反馈。欲贡献代码者可Fork本仓库并提交Pull Requests。


## 支持我们

如果AdClose对您有帮助，请给予我们Star支持！这是我们持续改进的最大动力。


## 关注我们

获取更多更新和帮助，请关注我们的Telegram频道：

🌟 **频道入口**: @RikkaTi
