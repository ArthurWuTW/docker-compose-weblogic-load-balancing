FROM ubuntu:20.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update -y
RUN apt-get install -y iputils-ping init wget curl git
RUN apt install -y openjdk-8-jdk openjdk-8-jre


CMD ["/sbin/init"]