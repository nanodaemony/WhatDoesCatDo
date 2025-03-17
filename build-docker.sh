# 1. maven打包
mvn clean package -Pdemo

# 2. 在Dockerfile文件目录下，构建docker镜像，spring-boot-plus为镜像名称
docker build -t what-does-cat-do .

# 3. 将镜像导出为tar
docker save what-does-cat-do -o what-does-cat-do.tar
