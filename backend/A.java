apiVersion: apps/v1
kind: Deployment  # 리소스 생성 방식 중 deployment 라는 종류를 사용
metadata:  # metadata : 기본정보 기재
  name: nginx-deployment

 # deployment 세부 정보
spec:
 replicas: 2
 selector:
  matchLabels:
   app: front-app   # 아래에 정의된 pod 중 app: front-app 이라는 값을 가진 파드를 선택

 #배포할 pod 세부 정보
 template:
  metadata:
   labels:
    app: front-app
  spec:
   containers:
        - name: nginx-container
          image: nginx
 3장 실습
imagePullPolicy: IfNotPresent # 로컬에 있는 이미지를 가져온다.
        #없으면 registry에서 가져온다.
        ports: - containerPort: 80