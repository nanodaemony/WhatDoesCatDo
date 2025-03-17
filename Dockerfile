FROM openjdk:8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY target/what-does-cat-do.jar /what-does-cat-do/what-does-cat-do.jar
WORKDIR /what-does-cat-do
EXPOSE 8888
ENTRYPOINT ["java","-jar","what-does-cat-do.jar"]

