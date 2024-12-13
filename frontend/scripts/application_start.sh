#!/bin/bash

# S3에서 Docker 이미지 다운로드
aws s3 cp s3://jjhotel5/code-frontend.tar /home/ec2-user/

# Docker 이미지 로드 및 실행
docker load -i /home/ec2-user/code-frontend.tar
docker run -d -p 80:80 my-image
