# this is use minikube to impl

### Preconditions
##### install minikube or k3s or k8s cluster
##### build the frontend backend image
```
https://github.com/tibame201020/k8s_try/blob/main/backend/build-backend_image.sh
```
```
https://github.com/tibame201020/k8s_try/blob/main/frontend/build-frontend_image.sh
```
##### start minikube
```
minikube start
```
##### export image to tar
```
docker save -o k8s_backend.tar k8s_backend
```
```
docker save -o k8s_frontend.tar k8s_frontend
```
##### load image to minikube
```
minikube image load k8s_backend.tar
```
```
minikube image load k8s_frontend.tar
```
```
minikube image ls
```
##### enable ingress /k3s k8s_cluster may use helm install ingress
```
minikube addons enable ingress
```
##### apply yaml
```
kubectl apply -f mysql.yaml
```
```
kubectl apply -f backend.yaml
```
```
kubectl apply -f frontend.yaml
```
##### check status
```
kubectl get pods
```
```
kubectl get services
```
```
kubectl get ingress
```
##### use curl check ingress working, find your k8s_cluster ip
```
minikube ip
```
```
curl ${your_k8s_clusterIp}/backend/api/jpa
```
#### use minikube mapping ingress to localhost (only for minikube works
```
minikube tunnel --cleanup
```
```
http://localhost
```
![image](https://github.com/tibame201020/k8s_try/assets/78014702/27544eaf-7c14-45d4-a213-bab2fc684af7)
```
http://localhost/backend/api/jpa
```
```
http://localhost/backend/api/r2dbc
```
![image](https://github.com/tibame201020/k8s_try/assets/78014702/f40041b1-7cd6-4106-91c3-14c9c4c6c073)
![image](https://github.com/tibame201020/k8s_try/assets/78014702/a34351a8-d5c1-48e5-8c31-e91fb6192692)
