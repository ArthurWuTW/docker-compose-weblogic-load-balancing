FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update -y
RUN apt-get install -y iputils-ping init wget curl git
RUN apt install -y unzip ant 

RUN cd /usr/local && \
    wget https://cdn.azul.com/zulu/bin/zulu8.66.0.15-ca-jdk8.0.352-linux_x64.tar.gz && \
    tar zxvf zulu8.66.0.15-ca-jdk8.0.352-linux_x64.tar.gz && \
    rm -r zulu8.66.0.15-ca-jdk8.0.352-linux_x64.tar.gz

RUN wget https://services.gradle.org/distributions/gradle-5.0-bin.zip -P /usr/local && \
    cd /usr/local/ && \
    unzip gradle-5.0-bin.zip && \
    rm gradle-5.0-bin.zip

COPY cleanAndBuildEJB.sh /home/user/script/cleanAndBuildEJB.sh

CMD ["/sbin/init"]