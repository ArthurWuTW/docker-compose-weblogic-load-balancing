docker-compose up --build --detach

# TODO - bugfix: why using docker-compose exec causing zombie java process

# Now need to enter container and then start start.sh manually
echo "sleep 10 seconds..."
sleep 10
echo "Build EJB..."
docker exec build-env /bin/sh /home/user/script/cleanAndBuildEJB.sh
echo "sleep 10 seconds..."
sleep 10
echo "Server Config setup...."
docker-compose exec weblogic-admin /bin/sh -c "cd /home/user/script/ && ./runCreateWeblogicScript.sh"
echo "sleep 20 seconds..."
sleep 20
echo "Start all Servers..."
docker exec weblogic-admin /bin/sh /home/user/script/runServer.sh
docker exec weblogic-slave1 /bin/sh /home/user/script/runServer.sh
echo "sleep 60 seconds, wait for all server starting..."
sleep 60
echo "Deploying EJB EAR file..."
docker-compose exec weblogic-admin /bin/sh -c "/home/user/script/runDeployEJB.sh"