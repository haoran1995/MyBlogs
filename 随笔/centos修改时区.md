1、查看系统当前的时区

```
[app@127-0-0-1 shine]$ timedatectl
      Local time: Wed 2019-10-23 17:56:17 CST
  Universal time: Wed 2019-10-23 09:56:17 UTC
        RTC time: Wed 2019-10-23 17:56:15
       Time zone: Asia/Shanghai (CST, +0800)
     NTP enabled: yes
NTP synchronized: no
 RTC in local TZ: yes
      DST active: n/a
 
Warning: The system is configured to read the RTC time in the local time zone.
         This mode can not be fully supported. It will create various problems
         with time zone changes and daylight saving time adjustments. The RTC
         time is never updated, it relies on external facilities to maintain it.
         If at all possible, use RTC in UTC by calling
         'timedatectl set-local-rtc 0'.
[app@127-0-0-1 shine]$
```

2、修改系统使用的时区

```
