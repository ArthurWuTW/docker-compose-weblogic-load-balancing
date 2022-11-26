FROM ismaleiva90/weblogic12

COPY --chown=oracle:oracle weblogicCreateServerClusterScript.py /home/user/script/weblogicCreateServerClusterScript.py
COPY --chown=oracle:oracle startManagedWebLogic.sh /u01/oracle/weblogic/user_projects/domains/base_domain/bin/startManagedWebLogic.sh
COPY --chown=oracle:oracle boot.properties /home/user/script/boot.properties
COPY --chown=oracle:oracle runCreateWeblogicScript.sh /home/user/script/runCreateWeblogicScript.sh