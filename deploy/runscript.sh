sudo docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD
sudo docker rm -f professor-lol
sudo docker rmi -f a1010100z/professor-lol:latest
sudo docker pull a1010100z/professor-lol:latest
sudo docker run -d --name professor-lol -p 80:8080 a1010100z/professor-lol:latest