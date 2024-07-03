1. Tạo 1 project Spring boot java 21
2. Chạy jenkins trên docker

sudo docker build -f Dockerfile -t jenkins:demo .


sudo docker run --name jenkins --restart=on-failure --detach \
  --network jenkins --env DOCKER_HOST=tcp://docker:2376 \
  --env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 \
  --publish 39999:8080 --publish 50000:50000 \
  --volume jenkins-data:/var/jenkins_home \
  --volume jenkins-docker-certs:/certs/client:ro \
    jenkins:demo

3. Tạo 1 slave node
trên máy ảo ubuntu:
Tạo ssh-keygen -t rsa
Copy id_rsa.pub vào file authorized_key


4. - Cài jdk-21 lên slave node
wget https://download.oracle.com/java/21/archive/jdk-21.0.2_linux-x64_bin.deb
sudo dpkg -i jdk-21.0.2_linux-x64_bin.deb

Kiem tra java --version: jdk-21
kiem tra javac --version: javac 21.0.2

- Cài maven lên slave node
sudo apt install maven