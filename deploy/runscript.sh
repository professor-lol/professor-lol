sudo docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD
docker rm -f professor-lol
docker rmi -f a1010100z/professor-lol:latest
docker pull a1010100z/professor-lol:latest
docker run -d --name professor-lol -p 80:8080 a1010100z/professor-lol:latest