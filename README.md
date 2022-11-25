# WebLogic EJB Application Project

## Environment

- Docker Containers
- Host

### Docker containers

- WebLogic Server Container
- EJB EAR File Build Container

### Host

run Client test

## Get started!

1. run containers
```sh
[host] cd <PATH>/docker-compose-weblogic-load-balancing/docker
[host] ./boot_and_service_init.sh
```
Note that docker-compose-weblogic-load-balancing directory has to be shared between host and containers

2. Enter Build Container and Build EAR file
```sh
[host] cd <PATH>/docker-compose-weblogic-load-balancing/docker
[host] ./enter_container.sh
```
type the index number of docker_build-env_1 to enter container

Inside container
```sh
[docker_build-env_1] cd <PATH_INSIDE_CONTAINER>/docker-compose-weblogic-load-balancing/ejb-project/WebLogicEJB
[docker_build-env_1] ./gradleBuild.sh
[docker_build-env_1] ./antBuild.sh
```

3. Browse WebLogic Console and Setup EJB Deployment

url: http://127.0.0.1:7001/console
username: weblogic
password: welcome1
![image](https://user-images.githubusercontent.com/36653598/203979125-46a1983f-48c6-4ce2-a159-86a3b5555916.png)
![image](https://user-images.githubusercontent.com/36653598/203979593-08812c8e-0bd4-4111-8606-8b13cc8c5279.png)


