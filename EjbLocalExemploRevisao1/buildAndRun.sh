#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/EjbLocalExemploRevisao1 .
docker rm -f EjbLocalExemploRevisao1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name EjbLocalExemploRevisao1 br.dev.hygino/EjbLocalExemploRevisao1