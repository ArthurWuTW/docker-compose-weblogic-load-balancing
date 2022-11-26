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
Install EAR file
![image](https://user-images.githubusercontent.com/36653598/203979593-08812c8e-0bd4-4111-8606-8b13cc8c5279.png)
Run EJB Service
![image](https://user-images.githubusercontent.com/36653598/203980788-0f3c3851-8d0b-4214-b865-5aa73c171450.png)
![image](https://user-images.githubusercontent.com/36653598/203980902-abf7e899-7eaf-4dfe-8573-e064d86332c3.png)

## Client Test
Environment: Host (MacOS)
IDE: intellJ
JDK: zulu8.66.0.15-ca-jdk8.0.352-macosx_x64
### Dependencies:
- lib/*.jar: created by gradle
- wlthint3client.jar: copied from inside WebLogic Container 
```sh
[weblogic-admin] cd /u01/oracle/weblogic/wlserver/server/lib
[weblogic-admin] ll | grep wlthint3client.jar
```

Run ClientTest.java in IDE
![image](https://user-images.githubusercontent.com/36653598/203983696-1be9daba-d812-41b2-8898-205a2c2ad520.png)

## Setup Managed Server
- Setup Machine
![image](https://user-images.githubusercontent.com/36653598/204074461-e2e5fbb2-1400-4c0f-9129-c741f91a0a32.png)
- Setup Server
![image](https://user-images.githubusercontent.com/36653598/204074496-257a7823-9826-4a5c-9ca2-e4405f36b082.png)
- start NodeManager and start Server

Modify nodemanager.properties
![image](https://user-images.githubusercontent.com/36653598/204074557-f985220c-932b-46f8-95f7-cfda16e32ddc.png)
start NodeManager
```sh
[weblogic-admin] cd /u01/oracle/weblogic/user_projects/domains/base_domain/bin
[weblogic-admin] ./startNodeManager.sh
```
![image](https://user-images.githubusercontent.com/36653598/204074597-88bc6193-9a03-4736-817b-a6a267f1f3ff.png)

Start Server and make sure Server-0 is in state RUNNING
![image](https://user-images.githubusercontent.com/36653598/204074743-9c4e7d93-62aa-48a0-824f-576fc4f0ae69.png)

