# 使用基础镜像
FROM 172.16.11.112:5100/library/adoptopenjdk/maven-openjdk8-openj9:latest

ARG PROJECT_NAME="clientifproxy"
# 设置工作目录
WORKDIR /home/app/${PROJECT_NAME}

# 复制项目文件到容器中
COPY . /home/app/${PROJECT_NAME}
RUN ls /home/app/${PROJECT_NAME}
# 使用 Maven 构建项目
RUN mvn -f /home/app/${PROJECT_NAME}/pom.xml clean package

RUN ls /home/app/${PROJECT_NAME}/client-if-proxy-admin

# 定义容器启动时要执行的命令
CMD ["java", "-jar", "/home/app/clientifproxy/client-if-proxy-admin/target/client-if-proxy-admin.jar"]