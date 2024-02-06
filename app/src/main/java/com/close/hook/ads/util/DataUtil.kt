package com.close.hook.ads.util

import com.close.hook.ads.data.dao.UrlDao
import com.close.hook.ads.data.model.Url
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object DataUtil {

    fun setData(urlDao: UrlDao) {
        CoroutineScope(Dispatchers.IO).launch {
            urlDao.apply {
                insert(Url("KeyWord", "getappmsgad"))
                insert(Url("Host", "1010pic.com"))
                insert(Url("Host", "8le8le.com"))
                insert(Url("Host", "a0.app.xiaomi.com"))
                insert(Url("Host", "aaid.umeng.com"))
                insert(Url("Host", "ad-scope.com"))
                insert(Url("Host", "ad-scope.com.cn"))
                insert(Url("Host", "ad-sdk.huxiu.com"))
                insert(Url("Host", "ad.12306.cn"))
                insert(Url("Host", "ad.51wnl.com"))
                insert(Url("Host", "ad.bwton.com"))
                insert(Url("Host", "ad.cyapi.cn"))
                insert(Url("Host", "ad.flurry.com"))
                insert(Url("Host", "ad.partner.gifshow.com"))
                insert(Url("Host", "ad.qingting.fm"))
                insert(Url("Host", "ad.qq.com"))
                insert(Url("Host", "ad.tencentmusic.com"))
                insert(Url("Host", "ad.toutiao.com"))
                insert(Url("Host", "ad.winrar.com.cn"))
                insert(Url("Host", "ad.xelements.cn"))
                insert(Url("Host", "ad.xiaomi.com"))
                insert(Url("Host", "ad.ximalaya.com"))
                insert(Url("Host", "ad.zijieapi.com"))
                insert(Url("Host", "adapi.izuiyou.com"))
                insert(Url("Host", "adapi.yynetwk.com"))
                insert(Url("Host", "adashbc.ut.taobao.com"))
                insert(Url("Host", "adc.hpplay.cn"))
                insert(Url("Host", "adcdn.hpplay.cn"))
                insert(Url("Host", "adcdn.tencentmusic.com"))
                insert(Url("Host", "adclick.tencentmusic.com"))
                insert(Url("Host", "adcolony.com"))
                insert(Url("Host", "adeng.hpplay.cn"))
                insert(Url("Host", "adexpo.tencentmusic.com"))
                insert(Url("Host", "adfilter.imtt.qq.com"))
                insert(Url("Host", "adjust.cn"))
                insert(Url("Host", "adkwai.com"))
                insert(Url("Host", "adlog.flurry.com"))
                insert(Url("Host", "ads-api-o.api.leiniao.com"))
                insert(Url("Host", "ads-api.tiktok.com"))
                insert(Url("Host", "ads-api.twitter.com"))
                insert(Url("Host", "ads-img-qc.xhscdn.com"))
                insert(Url("Host", "ads-video-al.xhscdn.com"))
                insert(Url("Host", "ads-video-qc.xhscdn.com"))
                insert(Url("Host", "ads.95516.com"))
                insert(Url("Host", "ads.flurry.com"))
                insert(Url("Host", "ads.google.cn"))
                insert(Url("Host", "ads.heytapmobi.com"))
                insert(Url("Host", "ads.huan.tv"))
                insert(Url("Host", "ads.icloseli.cn"))
                insert(Url("Host", "ads.music.126.net"))
                insert(Url("Host", "ads.oppomobile.com"))
                insert(Url("Host", "ads.service.kugou.com"))
                insert(Url("Host", "ads.service.kugou.com"))
                insert(Url("Host", "adsense.google.cn"))
                insert(Url("Host", "adservice.google.cn"))
                insert(Url("Host", "adservice.google.com"))
                insert(Url("Host", "adservice.sigmob.cn"))
                insert(Url("Host", "adserviceretry.kugou.com"))
                insert(Url("Host", "adsfile.bssdlbig.kugou.com"))
                insert(Url("Host", "adsfile.bssdlbig.kugou.com"))
                insert(Url("Host", "adsfilebssdlbig.ali.kugou.com"))
                insert(Url("Host", "adsfileretry.service.kugou.com"))
                insert(Url("Host", "adsfs-sdkconfig.heytapimage.com"))
                insert(Url("Host", "adsfs.oppomobile.com"))
                insert(Url("Host", "adsmind.gdtimg.com"))
                insert(Url("Host", "adsmind.ugdtimg.com"))
                insert(Url("Host", "adsp.xunlei.com"))
                insert(Url("Host", "adstats.tencentmusic.com"))
                insert(Url("Host", "adtago.s3.amazonaws.com"))
                insert(Url("Host", "adtech.yahooinc.com"))
                insert(Url("Host", "adtrack.quark.cn"))
                insert(Url("Host", "adukwai.com"))
                insert(Url("Host", "adv.sec.intl.miui.com"))
                insert(Url("Host", "adv.sec.miui.com"))
                insert(Url("Host", "advertiseonbing.azureedge.net"))
                insert(Url("Host", "advertising-api-eu.amazon.com"))
                insert(Url("Host", "advertising.apple.com"))
                insert(Url("Host", "advertising.yahoo.com"))
                insert(Url("Host", "advertising.yandex.ru"))
                insert(Url("Host", "advice-ads.s3.amazonaws.com"))
                insert(Url("Host", "adview.cn"))
                insert(Url("Host", "adx-cn.anythinktech.com"))
                insert(Url("Host", "adx-drcn.op.dbankcloud.cn"))
                insert(Url("Host", "adx.ads.heytapmobi.com"))
                insert(Url("Host", "adx.ads.oppomobile.com"))
                insert(Url("Host", "adxlog-adnet.vivo.com.cn"))
                insert(Url("Host", "adxlog-adnet.vivo.com.cn.dsa.dnsv1.com.cn"))
                insert(Url("Host", "afs.googlesyndication.com"))
                insert(Url("Host", "ali-ad.a.yximgs.com"))
                insert(Url("Host", "amdcopen.m.taobao.com"))
                insert(Url("Host", "an.facebook.com"))
                insert(Url("Host", "analysis.yozocloud.cn"))
                insert(Url("Host", "analytics-api.samsunghealthcn.com"))
                insert(Url("Host", "analytics.126.net"))
                insert(Url("Host", "analytics.95516.com"))
                insert(Url("Host", "analytics.google.com"))
                insert(Url("Host", "analytics.pinterest.com"))
                insert(Url("Host", "analytics.rayjump.com"))
                insert(Url("Host", "analytics.tiktok.com"))
                insert(Url("Host", "analytics.woozooo.com"))
                insert(Url("Host", "analyze.lemurbrowser.com"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao.com"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao.com3"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao1.com"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao2.com"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao3.com"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao4.com"))
                insert(Url("Host", "api-access.pangolin-sdk-toutiao5.com"))
                insert(Url("Host", "api-ad-product.huxiu.com"))
                insert(Url("Host", "api-adservices.apple.com"))
                insert(Url("Host", "api-htp.beizi.biz"))
                insert(Url("Host", "api.ad.xiaomi.com"))
                insert(Url("Host", "api.htp.hubcloud.com.cn"))
                insert(Url("Host", "api.hzsanjiaomao.com"))
                insert(Url("Host", "api.installer.xiaomi.com"))
                insert(Url("Host", "api.kingdata.ksyun.com"))
                insert(Url("Host", "api.statsig.com"))
                insert(Url("Host", "api5-normal-quic-lf.ixigua.com"))
                insert(Url("Host", "apiyd.my91app.com"))
                insert(Url("Host", "app-measurement.com"))
                insert(Url("Host", "applog.lc.quark.cn"))
                insert(Url("Host", "applog.uc.cn"))
                insert(Url("Host", "ata-sdk-uuid-report.dreport.meituan.net"))
                insert(Url("Host", "audid-api.taobao.com"))
                insert(Url("Host", "audid.umeng.com"))
                insert(Url("Host", "azr.footprintdns.com"))
                insert(Url("Host", "b1-data.ads.heytapmobi.com"))
                insert(Url("Host", "bdapi-ads.realmemobile.com"))
                insert(Url("Host", "bdapi-in-ads.realmemobile.com"))
                insert(Url("Host", "bdapi.ads.oppomobile.com"))
                insert(Url("Host", "beacon-api.aliyuncs.com"))
                insert(Url("Host", "beacon.qq.com"))
                insert(Url("Host", "beacons.gvt2.com"))
                insert(Url("Host", "beizi.biz"))
                insert(Url("Host", "bingads.microsoft.com"))
                insert(Url("Host", "books-analytics-events.apple.com"))
                insert(Url("Host", "bugly.qq.com"))
                insert(Url("Host", "business-api.tiktok.com"))
                insert(Url("Host", "c.evidon.com"))
                insert(Url("Host", "c.gj.qq.com"))
                insert(Url("Host", "c.kuaiduizuoye.com"))
                insert(Url("Host", "c.sayhi.360.cn"))
                insert(Url("Host", "c2.gdt.qq.com"))
                insert(Url("Host", "catalog.fjwhcbsh.com"))
                insert(Url("Host", "ccs.umeng.com"))
                insert(Url("Host", "cdn-ads.oss-cn-shanghai.aliyuncs.com"))
                insert(Url("Host", "cdn.ad.xiaomi.com"))
                insert(Url("Host", "cdn.ynuf.aliapp.org"))
                insert(Url("Host", "cfg.imtt.qq.com"))
                insert(Url("Host", "chat1.jd.com"))
                insert(Url("Host", "chc.ads.huan.tv"))
                insert(Url("Host", "ck.ads.oppomobile.com"))
                insert(Url("Host", "clog.miguvideo.com"))
                insert(Url("Host", "cm.bilibili.com"))
                insert(Url("Host", "cn-acs.m.cainiao.com"))
                insert(Url("Host", "cnzz.com"))
                insert(Url("Host", "collect.kugou.com"))
                insert(Url("Host", "contentcenter-drcn.dbankcdn.cn"))
                insert(Url("Host", "crashlytics.com"))
                insert(Url("Host", "crashlyticsreports-pa.googleapis.com"))
                insert(Url("Host", "csjplatform.com"))
                insert(Url("Host", "data.ads.oppomobile.com"))
                insert(Url("Host", "data.mistat.india.xiaomi.com"))
                insert(Url("Host", "data.mistat.rus.xiaomi.com"))
                insert(Url("Host", "data.mistat.xiaomi.com"))
                insert(Url("Host", "dataflow.biliapi.com"))
                insert(Url("Host", "dc.sigmob.cn"))
                insert(Url("Host", "diagnosis.ad.xiaomi.com"))
                insert(Url("Host", "dig.bdurl.net"))
                insert(Url("Host", "dl.zuimeitianqi.com"))
                insert(Url("Host", "dlogs.bwton.com"))
                insert(Url("Host", "dm.toutiao.com"))
                insert(Url("Host", "doubleclick-cn.net"))
                insert(Url("Host", "doubleclick.net"))
                insert(Url("Host", "download.changhong.upgrade2.huan.tv"))
                insert(Url("Host", "downloadxml.changhong.upgrade2.huan.tv"))
                insert(Url("Host", "drcn-weather.cloud.huawei.com"))
                insert(Url("Host", "dsp.fcbox.com"))
                insert(Url("Host", "dualstack-logs.amap.com"))
                insert(Url("Host", "dutils.com"))
                insert(Url("Host", "dxp.baidu.com"))
                insert(Url("Host", "e.ad.xiaomi.com"))
                insert(Url("Host", "eclick.baidu.com"))
                insert(Url("Host", "ef-dongfeng.tanx.com"))
                insert(Url("Host", "entry.baidu.com"))
                insert(Url("Host", "errlog.umeng.com"))
                insert(Url("Host", "errnewlog.umeng.com"))
                insert(Url("Host", "events-drcn.op.dbankcloud.cn"))
                insert(Url("Host", "firebaselogging-pa.googleapis.com"))
                insert(Url("Host", "flurry.com"))
                insert(Url("Host", "g-staic.ganjingworld.com"))
                insert(Url("Host", "g-staic.ganjingworld.com"))
                insert(Url("Host", "g2.ganjing.world"))
                insert(Url("Host", "game.loveota.com"))
                insert(Url("Host", "gdfp.gifshow.com"))
                insert(Url("Host", "gemini.yahoo.com"))
                insert(Url("Host", "globalapi.ad.xiaomi.com"))
                insert(Url("Host", "google-analytics.com"))
                insert(Url("Host", "googleadservices-cn.com"))
                insert(Url("Host", "googleadservices.com"))
                insert(Url("Host", "googletagservices-cn.com"))
                insert(Url("Host", "googletagservices.com"))
                insert(Url("Host", "gromore.pangolin-sdk-toutiao.com"))
                insert(Url("Host", "grs.dbankcloud.com"))
                insert(Url("Host", "grs.hicloud.com"))
                insert(Url("Host", "h-adashx.ut.taobao.com"))
                insert(Url("Host", "h.trace.qq.com"))
                insert(Url("Host", "h5Hosting.dbankcdn.com"))
                insert(Url("Host", "henzanapp.com"))
                insert(Url("Host", "hexagon-analytics.com"))
                insert(Url("Host", "hiboard-drcn.ai.dbankcloud.cn"))
                insert(Url("Host", "hm.baidu.com"))
                insert(Url("Host", "hmma.baidu.com"))
                insert(Url("Host", "httpdns.bcelive.com"))
                insert(Url("Host", "httpdns.huaweicloud.com"))
                insert(Url("Host", "httpdns.ocloud.oppomobile.com"))
                insert(Url("Host", "httpdns.push.oppomobile.com"))
                insert(Url("Host", "hugelog.fcbox.com"))
                insert(Url("Host", "hw-ot-ad.a.yximgs.com"))
                insert(Url("Host", "hw.zuimeitianqi.com"))
                insert(Url("Host", "hwpub-s01-drcn.cloud.dbankcloud.cn"))
                insert(Url("Host", "hya.comp.360os.com"))
                insert(Url("Host", "hye.comp.360os.com"))
                insert(Url("Host", "hyt.comp.360os.com"))
                insert(Url("Host", "i.snssdk.com"))
                insert(Url("Host", "iad.apple.com"))
                insert(Url("Host", "iadctest.qwapi.com"))
                insert(Url("Host", "iadsdk.apple.com"))
                insert(Url("Host", "iadworkbench.apple.com"))
                insert(Url("Host", "ib.snssdk.com"))
                insert(Url("Host", "ifs.tanx.com"))
                insert(Url("Host", "image-ad.sm.cn"))
                insert(Url("Host", "imageplus.baidu.com"))
                insert(Url("Host", "images.pinduoduo.com"))
                insert(Url("Host", "img-c.heytapimage.com"))
                insert(Url("Host", "img.adnyg.com"))
                insert(Url("Host", "img.adnyg.com.w.kunlungr.com"))
                insert(Url("Host", "imtmp.net"))
                insert(Url("Host", "irc.qubiankeji.com"))
                insert(Url("Host", "is.snssdk.com"))
                insert(Url("Host", "ixav-cse.avlyun.com"))
                insert(Url("Host", "iyfbodn.com"))
                insert(Url("Host", "janapi.jd.com"))
                insert(Url("Host", "jfapi.chiq-cloud.com"))
                insert(Url("Host", "jiguang.cn"))
                insert(Url("Host", "jpush.cn"))
                insert(Url("Host", "jpush.html5.qq.com"))
                insert(Url("Host", "jpush.io"))
                insert(Url("Host", "jswebcollects.kugou.com"))
                insert(Url("Host", "ks.pull.yximgs.com"))
                insert(Url("Host", "lf1-cdn-tos.bytegoofy.com"))
                insert(Url("Host", "lf3-ad-union-sdk.pglstatp-toutiao.com"))
                insert(Url("Host", "liveats-vod.video.ptqy.gitv.tv"))
                insert(Url("Host", "lm10111.jtrincc.cn"))
                insert(Url("Host", "log-api-mn.huxiu.com"))
                insert(Url("Host", "log-api.huxiu.com"))
                insert(Url("Host", "log-api.pangolin-sdk-toutiao-b.com"))
                insert(Url("Host", "log-api.pangolin-sdk-toutiao.com"))
                insert(Url("Host", "log-sdk.gifshow.com"))
                insert(Url("Host", "log-upload-os.hoyoverse.com"))
                insert(Url("Host", "log-upload.mihoyo.com"))
                insert(Url("Host", "log.ad.xiaomi.com"))
                insert(Url("Host", "log.aispeech.com"))
                insert(Url("Host", "log.avlyun.com"))
                insert(Url("Host", "log.avlyun.sec.intl.miui.com"))
                insert(Url("Host", "log.byteoversea.com"))
                insert(Url("Host", "log.fc.yahoo.com"))
                insert(Url("Host", "log.kuwo.cn"))
                insert(Url("Host", "log.stat.kugou.com"))
                insert(Url("Host", "log.stat.kugou.com"))
                insert(Url("Host", "log.tagtic.cn"))
                insert(Url("Host", "log.tbs.qq.com"))
                insert(Url("Host", "log.vcgame.cn"))
                insert(Url("Host", "log.web.kugou.com"))
                insert(Url("Host", "log.web.kugou.com"))
                insert(Url("Host", "log1.cmpassport.com"))
                insert(Url("Host", "logbak.hicloud.com"))
                insert(Url("Host", "logs.amap.com"))
                insert(Url("Host", "logservice.hicloud.com"))
                insert(Url("Host", "logservice1.hicloud.com"))
                insert(Url("Host", "logtj.kugou.com"))
                insert(Url("Host", "logupdate.avlyun.sec.miui.com"))
                insert(Url("Host", "m.kubiqq.com"))
                insert(Url("Host", "m1.ad.10010.com"))
                insert(Url("Host", "masdkv6.3g.qq.com"))
                insert(Url("Host", "mdp-usertrace-cn.heytapmobi.com"))
                insert(Url("Host", "metok.sys.miui.com"))
                insert(Url("Host", "metrics.apple.com"))
                insert(Url("Host", "metrics.data.hicloud.com"))
                insert(Url("Host", "metrics.icloud.com"))
                insert(Url("Host", "metrics.mzstatic.com"))
                insert(Url("Host", "metrics2.data.hicloud.com"))
                insert(Url("Host", "mi.gdt.qq.com"))
                insert(Url("Host", "miav-cse.avlyun.com"))
                insert(Url("Host", "miui-fxcse.avlyun.com"))
                insert(Url("Host", "mnqlog.ldmnq.com"))
                insert(Url("Host", "mobads-logs.baidu.com"))
                insert(Url("Host", "mobads-pre-config.cdn.bcebos.com"))
                insert(Url("Host", "mobads.baidu.com"))
                insert(Url("Host", "mobilelog.upqzfile.com"))
                insert(Url("Host", "mobileservice.cn"))
                insert(Url("Host", "mon.zijieapi.com"))
                insert(Url("Host", "monitor.music.qq.com"))
                insert(Url("Host", "monitor.uu.qq.com"))
                insert(Url("Host", "monsetting.toutiao.com"))
                insert(Url("Host", "mtj.baidu.com"))
                insert(Url("Host", "nmetrics.samsung.com"))
                insert(Url("Host", "notes-analytics-events.apple.com"))
                insert(Url("Host", "nsclick.baidu.com"))
                insert(Url("Host", "o2o.api.xiaomi.com"))
                insert(Url("Host", "oauth-login-drcn.platform.dbankcloud.com"))
                insert(Url("Host", "offerwall.yandex.net"))
                insert(Url("Host", "open.e.kuaishou.cn"))
                insert(Url("Host", "open.e.kuaishou.com"))
                insert(Url("Host", "open.kuaishouzt.com"))
                insert(Url("Host", "open.kwaishouzt.com"))
                insert(Url("Host", "open.kwaizt.com"))
                insert(Url("Host", "optimus-ads.amap.com"))
                insert(Url("Host", "oth.eve.mdt.qq.com"))
                insert(Url("Host", "oth.str.mdt.qq.com"))
                insert(Url("Host", "p.l.qq.com"))
                insert(Url("Host", "p.s.360.cn"))
                insert(Url("Host", "p1-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("Host", "p1-lm.adkwai.com"))
                insert(Url("Host", "p2-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("Host", "p2-lm.adkwai.com"))
                insert(Url("Host", "p3-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("Host", "p3-lm.adkwai.com"))
                insert(Url("Host", "p3-tt.byteimg.com"))
                insert(Url("Host", "p4-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("Host", "p5-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("Host", "p6-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("Host", "pagead2.googleadservices.com"))
                insert(Url("Host", "pagead2.googlesyndication.com"))
                insert(Url("Host", "pangolin-sdk-toutiao-b.com"))
                insert(Url("Host", "pgdt.ugdtimg.com"))
                insert(Url("Host", "pglstatp-toutiao.com"))
                insert(Url("Host", "pig.pupuapi.com"))
                insert(Url("Host", "policy.video.ptqy.gitv.tv"))
                insert(Url("Host", "public.gdtimg.com"))
                insert(Url("Host", "q.i.gdt.qq.com"))
                insert(Url("Host", "qqdata.ab.qq.com"))
                insert(Url("Host", "qwapi.apple.com"))
                insert(Url("Host", "qzs.gdtimg.com"))
                insert(Url("Host", "recommend-drcn.hms.dbankcloud.cn"))
                insert(Url("Host", "res.hubcloud.com.cn"))
                insert(Url("Host", "res1.hubcloud.com.cn"))
                insert(Url("Host", "res2.hubcloud.com.cn"))
                insert(Url("Host", "res3.hubcloud.com.cn"))
                insert(Url("Host", "review.gdtimg.com"))
                insert(Url("Host", "rms-drcn.platform.dbankcloud.cn"))
                insert(Url("Host", "roi.soulapp.cn"))
                insert(Url("Host", "rpt.gdt.qq.com"))
                insert(Url("Host", "s1.qq.com"))
                insert(Url("Host", "s2.qq.com"))
                insert(Url("Host", "s3.qq.com"))
                insert(Url("Host", "samsung-com.112.2o7.net"))
                insert(Url("Host", "samsungads.com"))
                insert(Url("Host", "scdown.qq.com"))
                insert(Url("Host", "sdk-cache.video.ptqy.gitv.tv"))
                insert(Url("Host", "sdk.beizi.biz"))
                insert(Url("Host", "sdk.e.qq.com"))
                insert(Url("Host", "sdkconf.avlyun.com"))
                insert(Url("Host", "sdkconfig.ad.intl.xiaomi.com"))
                insert(Url("Host", "sdkconfig.ad.xiaomi.com"))
                insert(Url("Host", "sdkconfig.video.qq.com"))
                insert(Url("Host", "sdkoptedge.chinanetcenter.com"))
                insert(Url("Host", "sdktmp.hubcloud.com.cn"))
                insert(Url("Host", "sdownload.stargame.com"))
                insert(Url("Host", "search.ixigua.com"))
                insert(Url("Host", "search3-search.ixigua.com"))
                insert(Url("Host", "search5-search-hl.ixigua.com"))
                insert(Url("Host", "search5-search.ixigua.com"))
                insert(Url("Host", "sensors-log.dongqiudi.com"))
                insert(Url("Host", "service.changhong.upgrade2.huan.tv"))
                insert(Url("Host", "service.vmos.cn/vmospro/api/ad"))
                insert(Url("Host", "sf16-static.i18n-pglstatp.com"))
                insert(Url("Host", "skdisplay.jd.com"))
                insert(Url("Host", "slb-p2p.vcloud.ks-live.com"))
                insert(Url("Host", "smartad.10010.com"))
                insert(Url("Host", "smetrics.samsung.com"))
                insert(Url("Host", "sms.ads.oppomobile.com"))
                insert(Url("Host", "sngmta.qq.com"))
                insert(Url("Host", "stat.y.qq.com"))
                insert(Url("Host", "static.ads-twitter.com"))
                insert(Url("Host", "staticsns.cdn.bcebos.com"))
                insert(Url("Host", "stats.qiumibao.com"))
                insert(Url("Host", "statsigapi.net"))
                insert(Url("Host", "stg-data.ads.heytapmobi.com"))
                insert(Url("Host", "storage.moegirl.org.cn"))
                insert(Url("Host", "success.ctobsnssdk.com"))
                insert(Url("Host", "syh-imp.cdnjtzy.com"))
                insert(Url("Host", "t-dsp.pinduoduo.com"))
                insert(Url("Host", "t.l.qq.com"))
                insert(Url("Host", "t.track.ad.xiaomi.com"))
                insert(Url("Host", "t1.a.market.xiaomi.com"))
                insert(Url("Host", "t2.a.market.xiaomi.com"))
                insert(Url("Host", "t3.a.market.xiaomi.com"))
                insert(Url("Host", "tangram.e.qq.com"))
                insert(Url("Host", "tdc.qq.com"))
                insert(Url("Host", "tdid.m.qq.com"))
                insert(Url("Host", "terms-drcn.platform.dbankcloud.cn"))
                insert(Url("Host", "test.ad.xiaomi.com"))
                insert(Url("Host", "test.e.ad.xiaomi.com"))
                insert(Url("Host", "tj.b.qq.com"))
                insert(Url("Host", "tj.video.qq.com"))
                insert(Url("Host", "tmead.y.qq.com"))
                insert(Url("Host", "tmfsdk.m.qq.com"))
                insert(Url("Host", "toblog.ctobsnssdk.com"))
                insert(Url("Host", "trace.qq.com"))
                insert(Url("Host", "track.lc.quark.cn"))
                insert(Url("Host", "track.uc.cn"))
                insert(Url("Host", "tracker.ai.xiaomi.com"))
                insert(Url("Host", "tracker.gitee.com"))
                insert(Url("Host", "tracking.miui.com"))
                insert(Url("Host", "tracking.rus.miui.com"))
                insert(Url("Host", "tvuser-ch.cedock.com"))
                insert(Url("Host", "tx-ad.a.yximgs.com"))
                insert(Url("Host", "tx-kmpaudio.pull.yximgs.com"))
                insert(Url("Host", "uapi.ads.heytapmobi.com"))
                insert(Url("Host", "uapi.chiq-cloud.com"))
                insert(Url("Host", "ucstat.baidu.com"))
                insert(Url("Host", "ulog-sdk.gifshow.com"))
                insert(Url("Host", "ulogjs.gifshow.com"))
                insert(Url("Host", "ulogs.umeng.com"))
                insert(Url("Host", "ulogs.umengcloud.com"))
                insert(Url("Host", "umengacs.m.taobao.com"))
                insert(Url("Host", "umengjmacs.m.taobao.com"))
                insert(Url("Host", "umsns.com"))
                insert(Url("Host", "union.baidu.com"))
                insert(Url("Host", "update.avlyun.sec.miui.com"))
                insert(Url("Host", "us.l.qq.com"))
                insert(Url("Host", "v.adintl.cn"))
                insert(Url("Host", "v.adx.hubcloud.com.cn"))
                insert(Url("Host", "v1-ad.video.yximgs.com"))
                insert(Url("Host", "v2-ad.video.yximgs.com"))
                insert(Url("Host", "v2.gdt.qq.com"))
                insert(Url("Host", "v3-ad.video.yximgs.com"))
                insert(Url("Host", "video-dsp.pddpic.com"))
                insert(Url("Host", "vlive.qqvideo.tc.qq.com"))
                insert(Url("Host", "vungle.com"))
                insert(Url("Host", "w.l.qq.com"))
                insert(Url("Host", "w1.askwai.com"))
                insert(Url("Host", "w1.bskwai.com"))
                insert(Url("Host", "w1.cskwai.com"))
                insert(Url("Host", "w1.dskwai.com"))
                insert(Url("Host", "w1.eskwai.com"))
                insert(Url("Host", "w1.fskwai.com"))
                insert(Url("Host", "w1.gskwai.com"))
                insert(Url("Host", "w1.hskwai.com"))
                insert(Url("Host", "w1.iskwai.com"))
                insert(Url("Host", "w1.jskwai.com"))
                insert(Url("Host", "w1.kskwai.com"))
                insert(Url("Host", "w1.lskwai.com"))
                insert(Url("Host", "w1.mskwai.com"))
                insert(Url("Host", "w1.nskwai.com"))
                insert(Url("Host", "w1.oskwai.com"))
                insert(Url("Host", "w1.pskwai.com"))
                insert(Url("Host", "w1.qskwai.com"))
                insert(Url("Host", "w1.rskwai.com"))
                insert(Url("Host", "w1.sskwai.com"))
                insert(Url("Host", "w1.tskwai.com"))
                insert(Url("Host", "w1.uskwai.com"))
                insert(Url("Host", "w1.vskwai.com"))
                insert(Url("Host", "w1.wskwai.com"))
                insert(Url("Host", "w1.xskwai.com"))
                insert(Url("Host", "w1.yskwai.com"))
                insert(Url("Host", "w1.zskwai.com"))
                insert(Url("Host", "weather-analytics-events.apple.com"))
                insert(Url("Host", "weather-community-drcn.weather.dbankcloud.cn"))
                insert(Url("Host", "weather-drcn.music.dbankcloud.cn"))
                insert(Url("Host", "webstat.qiumibao.com"))
                insert(Url("Host", "win.gdt.qq.com"))
                insert(Url("Host", "wn.x.jd.com"))
                insert(Url("Host", "ws-keyboard.shouji.sogou.com"))
                insert(Url("Host", "ws.sj.qq.com"))
                insert(Url("Host", "www42.zskwai.com"))
                insert(Url("Host", "wxa.wxs.qq.com"))
                insert(Url("Host", "wxsnsdy.wxs.qq.com"))
                insert(Url("Host", "wxsnsdythumb.wxs.qq.com"))
                insert(Url("Host", "xc.gdt.qq.com"))
                insert(Url("Host", "xlivrdr.com"))
                insert(Url("Host", "xlmzc.cnjp-exp.com"))
                insert(Url("Host", "xlog.jd.com"))
                insert(Url("Host", "xlviiirdr.com"))
                insert(Url("Host", "xlviirdr.com"))
                insert(Url("Host", "youxi.kugou.com"))
                insert(Url("Host", "zeus.ad.xiaomi.com"))
            }
        }
    }

}