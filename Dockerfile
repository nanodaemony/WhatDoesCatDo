FROM openjdk:8-jre-alpine
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY target/spring-boot-plus.jar spring-boot-plus.jar
WORKDIR /spring-boot-plus
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-plus.jar"]

