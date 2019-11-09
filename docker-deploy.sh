docker login -u $DOCKER_USER_NAME -p $DOCKER_PASSWORD
docker build -t a1010100z/professor-lol:latest .
docker push a1010100z/professor-lol:latest