# JDK11的配置问题

## 事件过程
今天我把电脑上的JDK14和16都卸载了，今天导入了老师说的那个项目
https://gitee.com/52itstyle/smart-parking
导入的IDEA里面用JDK16，死活找不到**Toools.jar**,
应该不是自身配置的问题，应该是JDK的特性问题，
然后用的JDK14就很正常，但是我在系统变量里面配置好了，但是再cmd里面还是找不到cmd

导致我都给卸载了，卸载也是有讲究的

----
## JDK的卸载
1. 去系统的卸载里面去卸载JDK
2. 在“运行”中输入Regedit，打开注册表编辑器，找到HKEY_LOCAL_MACHINE/SOFTWARE/JavaSoft ，将JavaSoft文件夹及其子目录全部删除。

----
## JDK的安装
1. 去官网下载JDK11吧，LTS是长期支持版本，下64位的`.exe`文件
2. 安装，路径想改就改，到时候知道装哪里就行，剩下就一直下一步
3. 配置环境变量:此电脑→属性→高级系统属性→高级→环境变量→系统变量
    * 增加变量 JAVA_HOME 路径就是你的安装路径`D:\Program Files\Java\jdk-11.0.12`
    * Path里面增加一条 `%JAVA_HOME%\bin;`
