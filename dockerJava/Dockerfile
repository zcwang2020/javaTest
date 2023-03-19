#基于镜像使用java
FROM jdk:8
#作者
MAINTAINER zcw
#VOLUME指定临时文件目录为/tmp，在主机/var/lib/docker目录下创建了一个临时文件并链接到容器的/tmp
VOLUME /tmp
#将jar包添加到容器中并更名为xxx.jar
ADD dockerJava-0.0.1-SNAPSHOT.jar docker_boot.jar
#运行jar包
RUN bash -c 'touch /docker_boot.jar'
ENTRYPOINT ["java","-jar","/docker_boot.jar"]
#暴露6001端口作为微服务
EXPOSE 8091