# giuliana-bezerra

## Instalação

docker mysql latest:

```bash
docker container run -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=demo -e MYSQL_USER=user -e MYSQL_PASSWORD=123456 -p 3306:3306 --name mysql mysql
```
ab:

```bash
sudo apt update
sudo apt install apache2-utils
servlet-api: ab -n 1000 -c 100 http://localhost:8081/users
reactive-api: ab -n 1000 -c 100 http://localhost:8080/users
```