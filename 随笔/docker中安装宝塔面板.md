### 1.先拉取个镜像文件

```
docker pull centos
```

### 2.创建docker

```
docker run -i -t -d --name baota -p 120:20 -p 121:21 -p 122:22 -p 180:80 -p 1443:443 -p 1888:888 -p 8811:8888 --privileged=true -v /home/www:/www centospw
```

名字为baota的docker，开放并映射端口 

### 3.进入docker

```
docker exec -it d497dcfd6062  /bin/bash(这里也可以直接用 bash)或者下面都行
docker exec -it baota /bin/bash
```

### 4.安装宝塔

```
yum install -y wget && wget -O install.sh http://download.bt.cn/install/install_6.0.sh && sh install.sh
```