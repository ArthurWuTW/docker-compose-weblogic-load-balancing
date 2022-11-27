from java.util import *
from javax.management import *
import javax.management.Attribute

print 'starting the script .... '
connect('weblogic','welcome1','t3://localhost:7001')
clusters = "cluster1","cluster2"
ms1 = {'Server-0':[7878, "172.28.1.5"],'Server-1':[7772,"172.28.1.6"]}
clustHM = HashMap()
edit()
startEdit()
for c in clusters:
    print 'creating cluster '+c
    clu = create(c,'Cluster')
    clustHM.put(c,clu)
cd('..\..')
clus1 = clustHM.get(clusters[0]) 
clus2 = clustHM.get(clusters[1])
for m, lp in ms1.items():
    managedServer = create(m,'Server')
    print 'creating managed server '+m
    managedServer.setListenPort(lp[0])
    managedServer.setListenAddress(lp[1])
    managedServer.setCluster(clus1)
save()
activate(block="true")
disconnect()
print 'End of script ...'
exit()