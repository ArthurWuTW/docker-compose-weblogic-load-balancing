docker-compose up --build --detach

# TODO - bugfix: why using docker-compose exec causing zombie java process

# Now need to enter container and then start start.sh manually
# docker-compose exec tomee1-server /bin/sh -c "/home/user/temp/apache-tomee-plus-7.1.4/bin/startup.sh"
# docker-compose exec tomee2-server /bin/sh -c "/home/user/temp/apache-tomee-plus-7.1.4/bin/startup.sh"