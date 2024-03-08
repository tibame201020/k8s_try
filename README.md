basic frontend <=> backend <=> database
### k8s impl
```
https://github.com/tibame201020/k8s_try/blob/main/k8s_yaml
```
### database
```
sh database.sh
```
### backend image
```
cd backend
```
```
docker build . k8s_backend .
```
or
```
sh build-backend_image.sh
```
### frontend image
```
cd frontend
```
```
docker build . k8s_frontend .
```
or
```
sh build-frontend_image.sh
```
## start by docker compose
```
docker compose up
```
or 
```
docker compose up -d
```
