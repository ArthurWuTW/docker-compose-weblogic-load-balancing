FROM ismaleiva90/weblogic12

ARG SERVER_NAME

COPY --chown=oracle:oracle weblogicCreateServerClusterScript.py /home/user/script/weblogicCreateServerClusterScript.py
COPY --chown=oracle:oracle startManagedWebLogic.sh /u01/oracle/weblogic/user_projects/domains/base_domain/bin/startManagedWebLogic.sh
COPY --chown=oracle:oracle boot.properties /home/user/script/boot.properties
COPY --chown=oracle:oracle runCreateWeblogicScript.sh /home/user/script/runCreateWeblogicScript.sh
COPY --chown=oracle:oracle boot.properties /u01/oracle/weblogic/user_projects/domains/base_domain/servers/${SERVER_NAME:?}/security/boot.properties
COPY --chown=oracle:oracle runServer.sh /home/user/script/runServer.sh