basic frontend <=> backend <=> database
### database
```
sh database.sh
```
### backend
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
