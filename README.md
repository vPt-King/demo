1. Spring boot java 
2. Docker run

Cài git trên dockerfile

sudo docker run --name jenkins --restart=on-failure --detach \
  --network jenkins --env DOCKER_HOST=tcp://docker:2376 \
  --env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 \
  --publish 39999:8080 --publish 50000:50000 \
  --volume jenkins-data:/var/jenkins_home \
  --volume jenkins-docker-certs:/certs/client:ro \
    jenkins:demo

3. New item tren jenkins server
Add githubs link to item
Cai github plugin trong jenkins

4. Install maven in jenkins server
Cai maven plugin trong jenkins