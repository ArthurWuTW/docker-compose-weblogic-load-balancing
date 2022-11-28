#!/bin/sh

if [ ! -d $REPO_PATH/docker-compose-weblogic-load-balancing ]; then
    cd $REPO_PATH
    git clone https://github.com/ArthurWuTW/docker-compose-weblogic-load-balancing
fi

cd $REPO_PATH/docker-compose-weblogic-load-balancing/ejb-project/WebLogicEJB/
./cleanBuild.sh
./gradleBuild.sh
./antBuild.sh