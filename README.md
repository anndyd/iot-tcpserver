# �����豸TCP�����

### ������Ŀ
git clone https://github.com/shijian-ws/iot-tcpserver.git

### ������Ŀ, ��Ҫ�Ȱ�װiot-util���������زֿ�
mvn clean package

### ������Ŀ
java -Dspring.profiles.active=local -jar target/iot-tcpserver-0.1.jar &

### �鿴����, YWRtaW46YWRtaW4=Ϊadmin:admin��Base64����
curl -H "Authorization:Basic YWRtaW46YWRtaW4=" http://127.0.0.1:9999/manager/mappings

### �ر���Ŀ
curl -X POST -H "Authorization:Basic YWRtaW46YWRtaW4=" http://127.0.0.1:9999/manager/shutdown
