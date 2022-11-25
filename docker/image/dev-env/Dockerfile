FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update -y
RUN apt-get install -y iputils-ping init wget curl git
RUN apt install -y openjdk-8-jdk openjdk-8-jre unzip ant

RUN wget https://services.gradle.org/distributions/gradle-5.0-bin.zip -P /usr/local && \
    cd /usr/local/ && \
    unzip gradle-5.0-bin.zip && \
    rm gradle-5.0-bin.zip

CMD ["/sbin/init"]