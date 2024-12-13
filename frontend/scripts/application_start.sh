#!/bin/bash

# S3에서 Docker 이미지 다운로드
aws s3 cp s3://jjhotel5/code-frontend.tar /home/ec2-user/

# Docker 이미지 로드
docker load -i /home/ec2-user/code-frontend.tar

# 기존 컨테이너가 있으면 종료 후 삭제
docker stop my-new-container || true
docker rm my-new-container || true

# 새 컨테이너 실행 (81:80 포트 매핑)
docker run -d -p 81:80 --name my-new-container code-frontend
