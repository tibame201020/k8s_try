docker run -d --rm -p 3320:3306 \
    --name mysql \
    -e MYSQL_ROOT_PASSWORD=root \
    -e MYSQL_USER=user \
    -e MYSQL_PASSWORD=userPwd \
    -e MYSQL_DATABASE=testDb \
    mysql:latest